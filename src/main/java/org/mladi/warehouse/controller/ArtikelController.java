package org.mladi.warehouse.controller;

import org.mladi.warehouse.repository.IArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtikelController {

    private IArtikelRepository iArtikelRepository;

    @Autowired
    public ArtikelController(IArtikelRepository iArtikelRepository) {
        this.iArtikelRepository = iArtikelRepository;
    }

    @RequestMapping("/artikel")
    public String getArtikel(Model model){
        model.addAttribute("artikel", iArtikelRepository.findAll());

        return "artikel";
    }
}
