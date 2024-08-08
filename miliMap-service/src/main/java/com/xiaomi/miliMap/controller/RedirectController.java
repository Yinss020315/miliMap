package com.xiaomi.miliMap.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: RedirectController
 * @Description:
 * @Author: YourName
 * @Date: 2024/8/8
 */
@RestController
@Log4j2
@RequestMapping("/auth")
public class RedirectController {

    @RequestMapping(value = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    void redirect(HttpServletResponse response, @RequestParam("currentPath") String currentPath) {
        try {
            log.info("currentPath:{}",currentPath);
            response.sendRedirect(currentPath);
        }catch (IOException e){
            log.error("error:",e);
        }
    }
}
