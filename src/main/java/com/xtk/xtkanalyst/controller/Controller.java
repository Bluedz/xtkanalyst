package com.xtk.xtkanalyst.controller;
import com.xtk.xtkanalyst.entity.*;
import com.xtk.xtkanalyst.mapper.*;
import com.xtk.xtkanalyst.service.*;


//import mybatis

//other
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

// IO
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.util.*;


/**
 * @Author: zyh
 * @Date: 2020/3/10 0026
 * @Time: 14:42
 */


@RestController
@RequestMapping("/index") //在类上使用RequestMapping，里面设置的value就是方法的父路径
public class Controller {

    // restApi_Index
    @RequestMapping  //如果方法上的RequestMapping没有value，则此方法默认被父路径调用
    public String index(){
        return "Welcome to XTK Analysis System";
    }

    // restApi_tst_sl1
    @Autowired
    private TstService tstService;
    @RequestMapping(value = "/sl1")
    public Tst sl1(){
        return tstService.Sel();
    }
    /*
    public String sl1(){
        return tstService.Sel().toString();
    }*/

    /** restApi_upload -- 文件上传接口
     *
     * @param file //
     * @return
     */
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @PostMapping("/upload")
    @ResponseBody
    public Object upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {return "文件为空";}
        //储存地址
        String filePath = "E:\\Codes\\files\\upload\\";
        //文件名称（默认new Date().getTime()）
        String fileName = System.currentTimeMillis() + Objects.requireNonNull(file.getOriginalFilename()).substring(file.getOriginalFilename().lastIndexOf('.'));
        File file_ = new File(filePath);
        if (!file_.exists()) {
            file_.mkdirs();
        }
        BufferedOutputStream stream = null;
        try {
            stream = new BufferedOutputStream(new FileOutputStream(filePath + "upload_" + fileName));
            stream.write(file.getBytes());
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //返回文件名称
        return fileName + " : " + filePath + "upload_" + fileName;
    }

    /** restApi_import
     * @param file // import excel
     * @return
    */
    @Autowired
    private MaterialComparisonDataService materialComparisonDataService;
    @Autowired
    private MaterialComparisonData materialComparisonData;
    @Autowired
    private MaterialComparisonDataMapper materialComparisonDataMapper;

    @Resource
    private MaterialComparsionLogMapper materialComparsionLogMapper;

    @PostMapping(value = "/impExcel")
    @ResponseBody
    public  String  impExcel(@RequestParam("file") MultipartFile file) throws Exception {
        //empty table
        materialComparisonDataMapper.deleteAll();

        //insert excel data to table
        if(file.isEmpty()){
            return "文件不能为空";
        }
        InputStream inputStream = file.getInputStream();
        List<List<Object>> list = materialComparisonDataService.getBankListByExcel(inputStream,file.getOriginalFilename());
        inputStream.close();

        MaterialComparisonData mcd = null;
        for (int i = 0; i < list.size(); i++) {
            List<Object> lo = list.get(i);
//            assert mcd != null;
            materialComparisonData.setClassAttr(lo);
            materialComparisonDataMapper.insert(materialComparisonData);
            //调用mapper中的insert方法
        }

        //compare & return result
        // add

        MaterialComparsionLog materialComparsionLog = new MaterialComparsionLog();
        Date datetime = new Date(System.currentTimeMillis());
        String uuid = UUID.randomUUID().toString(); //.replaceAll("-", "");

        // -add
        List<Object> objlist = materialComparisonDataMapper.matCom();
        List<List<String>> inlist = new ArrayList<List<String>>();
        List<String> hlt = Arrays.asList("物料名称","规格/型号","制造商","制造商编号","设备制造商","设备制造商编号", "西泰克物料号");
        inlist.add(hlt);
        for(Object obj : objlist){
            inlist.add(((MatComResult)obj).getAllAtrr());
            // add
            materialComparsionLog.setsDatetime(datetime);
            materialComparsionLog.setFdMatnum(
                    ((MatComResult)obj).getMatNum()
            );
            materialComparsionLog.setsUuid(uuid);
            materialComparsionLogMapper.insert(materialComparsionLog);

            // -add
        }

        CreateExcel ce = new CreateExcel();
        ce.createFromStrList(inlist, uuid);

        // return things
//
        String sid = "0bd88470-c483-4b65-814a-38be9cf09839";
        return "已上载并处理成功, 可以点击此处下载结果" + "@" + uuid;
    }

    /** restApi_matComUUIDList
     *
     */
    @PostMapping(value = "/matComUUIDList")
    @ResponseBody
    public Object matComUUIDList(String uuid){
        MaterialComparsionLogExample testExample = new MaterialComparsionLogExample();
        if(uuid!=null&&!"".equals(uuid)){
            testExample.createCriteria().andSUuidLike("%" + uuid +"%");
        }
        List<MaterialComparsionLog> list = materialComparsionLogMapper.selectByExample(testExample);
        return list;
    }

    /** restApi_selectByID
     *
     */
//    @Autowired
//    private MaterialComparisonDataMapper materialComparisonDataMapper;
    @RequestMapping(value = "/slcID/{id}")
    @ResponseBody
    public MaterialComparisonData slcID(@PathVariable("id") String id){
        return materialComparisonDataMapper.selectByPrimaryKey(Integer.valueOf(id));
    }

}
