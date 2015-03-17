package trime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhanglu on 2015/3/17.
 */
@Controller
@RequestMapping("/map")
public class MapController {

    //搜索目的地名
    @RequestMapping("/inputDestination")
    public ModelAndView searchDestination(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView mv = new ModelAndView();
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("InputDestination");

        return mv;
    }

    //选择完接机类型和目的地后计算价格
    @RequestMapping("/evaluatePrice")
    public @ResponseBody String evaluatePrice(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        return "test";
    }
}
