package xyz.fefine.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wkzq on 3/7/17.
 * index
 */
@Controller
//@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView) {
        System.out.println("index");
        modelAndView.addObject("TITLE", "ssm");
        modelAndView.addObject("END", "ssm");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/main")
    public String index() {
        System.out.println("index");
        return "index";
    }

}
