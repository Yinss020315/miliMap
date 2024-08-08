package com.xiaomi.miliMap;

import com.xiaomi.aegis.config.AegisConfig;
import com.xiaomi.aegis.constant.SdkConstants;
import com.xiaomi.aegis.filter.AegisFilter;
import com.xiaomi.aegis.vo.UserInfoVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * @author yinshuo@xiaomi.com
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

    @PostConstruct
    public void config(){
        AegisConfig.openTestMode();
        UserInfoVO userInfoVO=new UserInfoVO();
        userInfoVO.setName("machenyang3");
        userInfoVO.setUser("马晨阳");
        userInfoVO.setEmail("machenyang3@xioami.com");
        userInfoVO.setDepartmentName("互联网业务部");
        AegisConfig.addTestModeIpUserInfo("10.192.121.223",userInfoVO);
        //eyJjYXM6dXNlciI6IumprOaZqOmYsyIsImNhczpuYW1lIjoibWFjaGVueWFuZzMiLCJjYXM6ZGVwYXJ0bWVudE5hbWUiOiLkupLogZTnvZHkuJrliqHpg6giLCJjYXM6ZW1haWwiOiJtYWNoZW55YW5nM0B4aW9hbWkuY29tIn0=
        UserInfoVO userInfo = new UserInfoVO();
        userInfo.setUser("zhigang");
        userInfo.setName("志刚");
        userInfo.setEmail("zhigang@xiaomi.com");
        userInfo.setDepartmentName("信息安全与隐私");
// 设置默认返回的用户信息，没有匹配到配置ip时返回默认的用户信息
        AegisConfig.addTestModeIpUserInfo("default", userInfo);
    }
//    @Bean
//    public FilterRegistrationBean filterCasBean() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new AegisFilter());
//        registrationBean.setOrder(1);
//        registrationBean.addUrlPatterns("/*");
//        return registrationBean;
//    }

//    @Bean
//    @Profile({"staging"})
//    public FilterRegistrationBean<AegisFilter> filterCasStagingBean() {
//        String ignoreUrl = String.join(",", Arrays.asList(
//                "/api/NoLoginTest/*",
//                "/api/process/*"
//        ));
//        FilterRegistrationBean<AegisFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new AegisFilter());
//        registrationBean.addUrlPatterns("/*");
//        registrationBean.addInitParameter(SdkConstants.PUBLIC_KEY_FILTER_INIT_PARAM_KEY, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDOOnsiJpdPZKG8tU9hdgCTWyDn" +
//                "KJSf/Du2Qd7Wo0zXuusTsJneS2XxNsTyqRFPEGpfEcJe5+cg8k7ZPpJu4p/2PcKZ" +
//                "YWnK72f5XsZgEBw7eTD0sBtQBOF6y9NOTzPShwdm5woLmFKoj/XrR3BkwuMyw0/k" +
//                "N4UvtSyTrfY/8WT7+QIDAQAB");
//        registrationBean.addInitParameter(SdkConstants.IGNORE_URL_FILTER_INIT_PARAM_KEY,ignoreUrl);
//        return registrationBean;
//    }

}
