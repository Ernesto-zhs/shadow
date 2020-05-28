package com.zhs.shadow.service.music.write.impl;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.zhs.shadow.common.util.HttpClientUtils;
import com.zhs.shadow.service.music.write.MusicVoteWriteService;
import org.springframework.stereotype.Service;

/**
 * 写入服务实现类
 * @author Austin
 */
@Service
public class MusicVoteWriteServiceImpl implements MusicVoteWriteService {

    private final static String url = "http://xshell.xgsuu.cn//WeChat.php?m=Xue&c=MusicVote&a=vote&fengxue=261&id=508";

    @Override
    public void refreshData() throws Exception {
        method(1);
    }

    private static void method(int i) throws Exception {
        long time = System.currentTimeMillis() / 1000 + i * 6000;
        Map<String, String> paramMap = new HashMap<>(4);
        paramMap.put("id", "26106");
        Map<String, String> requestHeader = new HashMap<String, String>(4);
        requestHeader.put("Content-Type", "application/json");
        String s = HttpClientUtils.doPost(url, requestHeader, paramMap);
        System.out.println("-----------------");
        System.out.println(s);
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1; i++) {
            method(i);
        }
    }
}
