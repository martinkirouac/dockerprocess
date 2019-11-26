package com.mk.docker.dockerprocess.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping({"/", "index"})
    public String getIndex(Model model){
        return "index";
    }

}