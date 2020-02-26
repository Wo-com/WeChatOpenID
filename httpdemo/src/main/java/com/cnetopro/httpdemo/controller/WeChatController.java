package com.cnetopro.httpdemo.controller;

import com.cnetopro.httpdemo.service.WeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeChatController {
    @Autowired
    WeChatService wc;

    @RequestMapping("/cis")
    public void getcode(@RequestParam(value = "code")String  code){
        System.out.println(code);

       wc.codetoopenid(code);

    }
}
