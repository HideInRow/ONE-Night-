package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	/**
	 * 进入后台管理请求
	 */
    @RequestMapping(value = "/admin")
    public String toAdmin(){
        return "admin/main";
    }
    
    /**
     * 关于本站
     */
    @RequestMapping("/aboutMe")
    public ModelAndView aboutMe(){
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("title", "关于本站");
    	mav.addObject("mainPage", "common/aboutMe");
    	mav.addObject("mainPageKey", "#a");
    	mav.setViewName("index");
        return mav;
    }

    /**
     * 登录请求
     */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 网站根目录请求
     */
    @RequestMapping("/")
    public ModelAndView root() {
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("title", "首页");
    	mav.addObject("mainPage", "film/indexFilm");
    	mav.addObject("mainPageKey", "#f");
    	mav.setViewName("index");
        return mav;
    }
}