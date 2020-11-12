package com.xtk.xtkanalyst;

import com.xtk.xtkanalyst.entity.MatComResult;
import com.xtk.xtkanalyst.entity.MaterialComparsionLog;
import com.xtk.xtkanalyst.mapper.MaterialComparisonDataMapper;
import com.xtk.xtkanalyst.mapper.MaterialComparsionLogMapper;

import com.xtk.xtkanalyst.mapper.TstMapper;
import com.xtk.xtkanalyst.service.EmailActionService;
import com.xtk.xtkanalyst.service.CreateExcel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

//

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;
import java.util.*;

//@RunWith(SpringRunner.class)
@SpringBootTest
class XtkAnalystApplicationTests {

    @Test
    void contextLoads() {
    }
//    private static final Logger log = LoggerFactory.getLogger(XtkAnalystApplicationTests.class);

    @Value("${spring.mail.username}")
    private String sendName;
    @Autowired
    private JavaMailSender mailSender;
    @Test
    public void tstSimpleMail(){
        EmailActionService emailActionService = new EmailActionService(mailSender, sendName, "tst");
        emailActionService.sendSimpleMsg("sts", "zhaoyuheng@setechchina.com");
    }

    @Autowired
    private MaterialComparisonDataMapper materialComparisonDataMapper;
    @Autowired
    private TstMapper tstMapper;

    @Test
    public void testTstCrossDB(){
        List<Map> XMap = tstMapper.tstCrossDB();
        String[] strLst;
        List<String> lstStr;
        System.out.println(XMap);
        for( Map lst : XMap){
            System.out.println(lst.get("uid"));
            lstStr = new ArrayList<String>(lst.values());
            System.out.println(lst.toString());
            System.out.println(lst.values());
            System.out.println(lstStr);
        }

}

    @Test
    public void testQuery() {

        // 使用userMapper执行根据条件查询用户
        List<Object> objlist = materialComparisonDataMapper.matCom();
        List<String> lst = null;
        String str;
//        for (Object ou : list) {
//            lst = ou.getAllAtrr();
//            str = lst.get(0) + " , " +
//                    lst.get(1) + " , " +
//                    lst.get(2) + " , " +
//                    lst.get(3) + " , " +
//                    lst.get(4) + " , " +
//                    lst.get(5) + " , " +
//                    lst.get(6) ;
//            System.out.println(str);
//            System.out.println(lst.size());
//            System.out.println(ou.getClass().getDeclaredFields().length);
//            System.out.println(ou);
//        }

//        List<Object> listO = Collections.singletonList(list);
//        List<Object> list1 = list;

        List<List<String>> list = new ArrayList<List<String>>();
//        list.add(GetClassAttr.objToStrList(objlist.get(0)));
        List<String> hlt = Arrays.asList("物料名称", "规格/型号", "制造商", "制造商编号", "设备制造商", "设备制造商编号", "西泰克物料号");
        list.add(hlt);
        for (Object obj : objlist) {
            list.add(((MatComResult) obj).getAllAtrr());
        }

        CreateExcel ce = new CreateExcel();
        ce.createFromStrList(list, "test", "uuid");
        System.out.println(
                "xxxxxxxxx"
        );
    }

    @Test
    public void emptyTable() {
        materialComparisonDataMapper.deleteAll();
    }

    @Test
    public void tstBCrypt() {
        BCryptPasswordEncoder BC = new BCryptPasswordEncoder();
        String psw = BC.encode("123");
        System.out.println(psw);
    }

    @Test
    public void tstUUID() {
        for (int i = 0; i < 5; i++) {
            //注意replaceAll前面的是正则表达式
            String uuid0 = UUID.randomUUID().toString();
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(uuid0);
            System.out.println(uuid);
//            System.out.println(uuid.length());
        }
    }

    @Resource
    private MaterialComparsionLogMapper materialComparsionLogMapper;

    @Test
    public void tstMatCompLogMapper() {
        MaterialComparsionLog materialComparsionLog;
        materialComparsionLog = materialComparsionLogMapper.selectByPrimaryKey(2);
        System.out.println(materialComparsionLog.getsUuid());
    }

}
