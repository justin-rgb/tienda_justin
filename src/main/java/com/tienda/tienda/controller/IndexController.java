package com.tienda.tienda.controller;

import com.tienda.tienda.dao.ClienteDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Estamos usando una arquitectura mvc");
        
        var clientes = clienteDao.findAll();
        
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
    
    
    
    
}
