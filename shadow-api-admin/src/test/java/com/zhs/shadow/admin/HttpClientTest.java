package com.zhs.shadow.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhs.shadow.common.util.HttpClientUtils;

public class HttpClientTest {

    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            String url = "http://127.0.0.1:8080/web/statisticsBusinessOrder/queryOrderAnalyze";
            try {
                Map<String, String> dataMap = new HashMap<>(4);
                dataMap.put("id", "26106");
                Map<String, String> requestHeader = new HashMap<String, String>();
                requestHeader.put("Content-Type:", "application/json");
                requestHeader.put("X-LOGINNAME", "18855088242");
                requestHeader.put("X-BID", "186");
//                requestHeader.put("X-TOKEN", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODYiLCJleHAiOjE1OTQwMDM5ODZ9.CJdZo4gfDNp1nGEw95qhY_0vzp4pMMIUR4qMpVn1Xew");
                String s = HttpClientUtils.doPost(url, requestHeader, dataMap);
                System.out.println("-----------------");
                System.out.println(s);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }


        String s = "[\"26114\",\"26111\",\"26113\",\"26109\",\"26110\",\"26106\",\"26120\",\"26127\",\"26137\",\"26117\",\"26105\",\"26123\",\"26116\",\"26112\",\"26107\",\"26115\",\"26130\",\"26134\",\"26132\",\"26131\",\"26136\",\"26125\",\"26122\",\"26108\",\"26144\",\"26129\",\"26124\",\"26135\",\"26126\",\"26118\",\"26133\"]";
        List<Integer> strings = JSON.parseArray(s, Integer.class).subList(0, 10);
        System.out.println(strings);
    }

}
