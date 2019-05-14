package com.echarts.echarts.controller;

import com.echarts.echarts.entity.User;
import com.echarts.echarts.service.TestServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {
    @Autowired
    TestServce testServce;
    @RequestMapping("user/{id}")
    public String selectOne(@PathVariable("id") int id,Model map) {
        User user = testServce.selectOne(id);

        map.addAttribute("name", user.getName());
        map.addAttribute("id", user.getId());

        return "some";
    }
}
