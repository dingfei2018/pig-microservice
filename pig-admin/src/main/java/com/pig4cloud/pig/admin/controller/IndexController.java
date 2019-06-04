package com.pig4cloud.pig.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Auther: dingfei
 * @Date: 2019-6-4 16:21
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index(){
        return "/login";
    }
}
