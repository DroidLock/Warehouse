package org.mladi.warehouse.controller;

import org.mladi.warehouse.Model.Artikel;
import org.mladi.warehouse.repository.IArtikelRepository;
import org.mladi.warehouse.repository.ILieferantenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addArtikelController {

    private ILieferantenRepository iLieferantenRepository;
    private IArtikelRepository iArtikelRepository;

    @Autowired
    public addArtikelController(ILieferantenRepository iLieferantenRepository, IArtikelRepository iArtikelRepository) {
        this.iLieferantenRepository = iLieferantenRepository;
        this.iArtikelRepository = iArtikelRepository;
    }

    @RequestMapping("/addArtikel")
    public String getLieferant(Model model) {
        model.addAttribute("artikel", new Artikel());
        model.addAttribute("lieferant", iLieferantenRepository.findAll());

        return "addArtikel";
    }

    @PostMapping("/addArtikel")
    public String addNewArtikel(Model model, @ModelAttribute Artikel artikel) {
        iArtikelRepository.save(artikel);
//        model.addAttribute("lieferant", iLieferantenRepository.findById(artikel.getLieferant().getLieferantenNr()));
        return "artikel";
    }
}
