//package org.mladi.warehouse.controller;
//
//import org.mladi.warehouse.repository.ILieferantenRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class LieferantenController {
//
//    private ILieferantenRepository iLieferantenRepository;
//
//    @Autowired
//    public LieferantenController(ILieferantenRepository iLieferantenRepository) {
//        this.iLieferantenRepository = iLieferantenRepository;
//    }
//
//    @RequestMapping("/addArtikel")
//    public String getLieferantenName(Model model){
//        model.addAttribute("lieferant", iLieferantenRepository.findAll());
//
//        return "addArtikel";
//    }
//
//}
