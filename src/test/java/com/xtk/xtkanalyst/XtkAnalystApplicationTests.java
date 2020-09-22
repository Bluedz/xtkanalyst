package com.xtk.xtkanalyst;

import com.xtk.xtkanalyst.entity.MatComResult;
import com.xtk.xtkanalyst.mapper.MaterialComparisonDataMapper;
import com.xtk.xtkanalyst.service.CreateExcel;
import com.xtk.xtkanalyst.service.GetClassAttr;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//
import com.xtk.xtkanalyst.entity.User;
import com.xtk.xtkanalyst.mapper.UserMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

//@RunWith(SpringRunner.class)
@SpringBootTest
class XtkAnalystApplicationTests {

    @Test
    void contextLoads() {
    }
//    private static final Logger log = LoggerFactory.getLogger(XtkAnalystApplicationTests.class);


    @Autowired
    private MaterialComparisonDataMapper materialComparisonDataMapper;
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
        List<String> hlt = Arrays.asList("物料名称","规格/型号","制造商","制造商编号","设备制造商","设备制造商编号", "西泰克物料号");
        list.add(hlt);
        for(Object obj : objlist){
            list.add(((MatComResult)obj).getAllAtrr());
        }

        CreateExcel ce = new CreateExcel();
        ce.createFromStrList(list);
        System.out.println(
                "xxxxxxxxx"
        );
    }

    @Test
    public void emptyTable(){
        materialComparisonDataMapper.deleteAll();
    }

    @Test
    public void tstBCrypt(){
        BCryptPasswordEncoder BC = new BCryptPasswordEncoder();
        String psw = BC.encode("123");
        System.out.println(psw);
    }

    @Test
    public void tstUUID(){
        for (int i = 0; i < 5; i++) {
            //注意replaceAll前面的是正则表达式
            String uuid0 = UUID.randomUUID().toString();
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(uuid0);
            System.out.println(uuid);
//            System.out.println(uuid.length());
        }
    }

}
