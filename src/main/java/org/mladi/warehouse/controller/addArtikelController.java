package org.mladi.warehouse.controller;

import org.mladi.warehouse.repository.ILieferantenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addArtikelController {

    private ILieferantenRepository iLieferantenRepository;

    @Autowired
    public addArtikelController(ILieferantenRepository iLieferantenRepository) {
        this.iLieferantenRepository = iLieferantenRepository;
    }

    @RequestMapping("/addArtikel")
    public String letAddArtikel(Model model){
            model.addAttribute("lieferant", iLieferantenRepository.findAll());

        return "addArtikel";
    }

//    @RequestMapping("addArtikel")
}
