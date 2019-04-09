package com.zeasn.whitelist.controller;

import com.alibaba.druid.util.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginCtrl {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/loginUser")
    public String loginUser(String name, String password, HttpServletRequest request) {
        if (StringUtils.isEmpty(name)|| StringUtils.isEmpty(password)) {
            request.setAttribute("msg", "用户名或密码不能为空！");
            return "/login";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(name,password);
        try {
            subject.login(token);
            return "/index";
        }catch (LockedAccountException lae) {
            token.clear();
            request.setAttribute("msg", "用户已经被锁定不能登录，请与管理员联系！");
            return "/login";
        } catch (AuthenticationException e) {
            token.clear();
            request.setAttribute("msg", "用户或密码不正确！");
            return "/login";
        }

    }
    @RequestMapping("/logOut")
    public String logOut(HttpSession session) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
//        session.removeAttribute("user");
        return "login";
    }
}
