package com.cnetopro.httpdemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cnetopro.httpdemo.service.WeChatService;
import com.github.kevinsawicki.http.HttpRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeChatServiceimpl implements WeChatService {

    @Override
    public String codetoopenid(String code) {
        Map<String, String> data = new HashMap<String, String>();
        data.put("appid", "xxxxxxxxx");
        data.put("secret", "eeeeeeeeeeeeeeeeeee");
        data.put("js_code", code);
        data.put("grant_type", "authorization_code");


        String response = HttpRequest.get("https://api.weixin.qq.com/sns/jscode2session").form(data).body();
        System.out.println("Response was: " + response);
        JSONObject obj= JSON.parseObject(response);//将json字符串转换为json对
        System.out.println(obj);



        return null;
    }
}
