package br.com.sistema.controller;

import br.com.sistema.service.FuncionarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioController {

    @Autowired
    FuncionarioServiceImpl funcionarioService;

    @GetMapping("/funcionario/list")
    public String list(Model model){
        model.addAttribute("funcionarios",funcionarioService.findAll());
        System.out.println(funcionarioService.findAll());
        return "funcionario/list";
    }
}
