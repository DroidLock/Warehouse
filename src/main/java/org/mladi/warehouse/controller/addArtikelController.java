package org.mladi.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addArtikelController {

    @RequestMapping("/addArtikel")
    public String letAddArtikel(){
        return "addArtikel";
    }
}
