package trime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import trime.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by better on 15/3/17.
 */
@Controller
@RequestMapping("admin")
public class ManageUserController {

    @RequestMapping("/manageuser")
    public ModelAndView listUsers(HttpServletRequest request, HttpServletResponse response){
        List<User> userList = new ArrayList<User>();
        User u1 = new User("1", "zhang", "Male", 23);
        User u2 = new User("2", "Li", "Female", 24);
        User u3 = new User("3", "Zhao", "Male", 25);
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", userList);
        mv.setViewName("manager/ManageUser");

        return mv;
    }
}
