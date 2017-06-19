/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spingCrud.AlunoManager.controller;



import com.spingCrud.AlunoManager.model.Aluno;
import com.spingCrud.AlunoManager.repository.Alunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alberto
 */
@Controller
public class alunoController {
  
    
    @Autowired
    private Alunos alunos;
    
    
    @GetMapping("/alunos")
    public ModelAndView listar() {

        ModelAndView modelAndView = new ModelAndView("ListaAlunos");
        modelAndView.addObject("alunos", alunos.findAll());
        modelAndView.addObject(new Aluno());
        return modelAndView;
    }
    
    @PostMapping("/alunos")
    public String salvar(Aluno aluno) {
        this.alunos.save(aluno);
        return "redirect:/alunos";
    }
    
    
     @RequestMapping("removeAluno")
    public String removerAluno(Aluno aluno) {
        alunos.delete(aluno);
        return "redirect:/alunos";
    }
    
     @GetMapping("/editaAluno")
     public ModelAndView editarAluno(long id) {

        ModelAndView modelAndView = new ModelAndView("EditaAluno");
        modelAndView.addObject("alunos", alunos.findOne(id));
        modelAndView.addObject(new Aluno());
        return modelAndView;
     }
     
     @PostMapping("/alteraAluno")
     public String alteraAluno(Aluno aluno) {
        this.alunos.save(aluno);
        return "redirect:/alunos";
    }
    
}
