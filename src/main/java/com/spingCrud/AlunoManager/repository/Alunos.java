/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spingCrud.AlunoManager.repository;


import com.spingCrud.AlunoManager.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alberto
 */
public interface Alunos extends JpaRepository<Aluno, Long> {
    
}
