package com.zhs.shadow.admin;

import java.util.Map;

import com.alibaba.fastjson.JSON;

public class TestSS {

    public static void main(String[] args) {
        String s = "{\n" +
                "    \"id\":7,\n" +
                "    \"kssj\":\"2020-06-22\",\n" +
                "    \"jssj\":\"2020-06-22\",\n" +
                "    \"yjmc\":\"个人业绩\",\n" +
                "    \"zygznr\":\"完成xxxxxxxx\",\n" +
                "    \"qdcx\":\"较为显著\",\n" +
                "    \"zt\":\"1\",\n" +
                "    \"zmrId\":\"141\",\n" +
                "    \"zmrMz\":\"管理员\",\n" +
                "    \"grmc\":\"1\",\n" +
                "    \"yjnd\":\"难度很大\",\n" +
                "    \"yjpjbz\":\"123\",\n" +
                "    \"jjjs\":\"主要参与\",\n" +
                "    \"yjjb\":\"市公司级\",\n" +
                "    \"pushFlag\":\"Y\",\n" +
                "    \"LAY_TABLE_INDEX\":4\n" +
                "}";
        Map<String,Object> map = JSON.parseObject(s, Map.class);
        System.out.println(map);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("private String " + entry.getKey() + ";");
            System.out.println();
        }

    }

}
