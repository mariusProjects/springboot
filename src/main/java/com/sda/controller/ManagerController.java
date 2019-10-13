package com.sda.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

    @RequestMapping("/managers")
    public String displayConroller(){
        return "Aici vom introduce managerii";
    }
}
