/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.caosvete;

import com.it355.model.Igra;
import java.util.Locale;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Marko
 */
@Controller

public class IgraController {

    
    @Autowired
    private MessageSource m;

    @RequestMapping(value = "/igra", method= RequestMethod.GET)
    
    public String igra(ModelMap mapa) {
         System.out.println("MessageSource");
        m.getMessage("name", null, Locale.ENGLISH);
        mapa.addAttribute("igra", new Igra());
        return "igra"; 
    }

    @RequestMapping(value = "/dodajIgru", method = RequestMethod.POST)
    public String dodajIgru(@ModelAttribute Igra igra, ModelMap model) {
        model.addAttribute("imeIgre", igra.getImeIgre());
        model.addAttribute("opisIgre", igra.getOpisIgre());
        model.addAttribute("OcenaIgre", igra.getOcenaIgre());
        model.addAttribute("velicinaIgrice", igra.getVelicinaIgrice());
        model.addAttribute("cenaIgre", igra.getCenaIgre());
        return "prikaz";
    }
}
