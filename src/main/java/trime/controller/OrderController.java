package trime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhanglu on 2015/3/15.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/create")
    public ModelAndView createOrder(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mv = new ModelAndView();
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("CreateOrder");

        return mv;
    }

    @RequestMapping(value="/publish", method = RequestMethod.POST)
    public ModelAndView publishOrder(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mv = new ModelAndView();
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("AnswerOrder");

        return mv;
    }
}
