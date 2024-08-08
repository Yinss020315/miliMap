package com.xiaomi.miliMap;

import com.xiaomi.aegis.filter.AegisFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author hulonghai@xiaomi.com  2024/5/23
 * description:
 */
@EnableAsync
@SpringBootApplication()
public class App {
    public static void main(String[] args) {
        try{
            SpringApplication.run(App.class,args);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Bean
    public FilterRegistrationBean filterCasBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new AegisFilter());
        registrationBean.setOrder(1);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

}
