package jpa.ToDoList.controller;

import jpa.ToDoList.entity.Usuario;
import jpa.ToDoList.repositories.UsuarioRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController{

    @Autowired
    UsuarioRepositories user;

//    @PostMapping
//    Public Usuario Salvar() {
//        Usuario teste = new Usuario("teste", "teste@gmail.com", "lkdjsf");
//        return user.save(teste);
//
    @GetMapping
    public List<Usuario> mostrar() {
        List<Usuario> usuario = user.findAll();
        return usuario;
    }
}
