package com.xiaomi.miliMap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: RedirectController
 * @Description:
 * @Author: YourName
 * @Date: 2024/8/8
 */
@RestController
@RequestMapping("/auth")
public class RedirectController {

    private static final Logger logger = LoggerFactory.getLogger(RedirectController.class);

    @RequestMapping(value = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    void redirect(HttpServletResponse response, @RequestParam("currentPath") String currentPath) {
        try {
            logger.info("path is :{}",currentPath);
            response.sendRedirect(currentPath);
        }catch (IOException e){
            logger.error("error:",e);
        }
    }
}
