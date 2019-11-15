package cn.com.tiptop.httpproxy.proxyfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HomeController {
    @RequestMapping("/**")
    public void home(HttpServletRequest request, HttpServletResponse response){
        try {
            response.getWriter().print("Http Server Proxy");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
