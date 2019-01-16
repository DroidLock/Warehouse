package org.mladi.warehouse.controller;

import org.mladi.warehouse.Model.Artikel;
import org.mladi.warehouse.repository.IArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

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
    @GetMapping("/artikel/{artikelnummer}")
    public String deleteArticle(@PathVariable("artikelnummer") Long artikelnummer, Model model){
        Artikel artikel =  iArtikelRepository.findById(artikelnummer).orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + artikelnummer));
        iArtikelRepository.delete(artikel);
        model.addAttribute("artikel", iArtikelRepository.findAll());
        return "artikel";

    }

    @RequestMapping(value = "s", method = RequestMethod.GET)
    public String showArticleById(@RequestParam(value = "s", required = false) Long search, Model model){

        model.addAttribute("artikel", iArtikelRepository.findAllById(Collections.singleton(search)));
        return "artikel";
    }
}
