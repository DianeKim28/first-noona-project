package org.zerock.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MVCconfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registory){
        WebMvcConfigurer.super.addViewControllers(registory);

        registory.addViewController("board/list").setViewName("board/list");
    }
}
