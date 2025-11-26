package com.List.ToDo.dto;

import com.List.ToDo.entities.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDTO {

    private long id;
    @NotBlank(message = "Nome inválido")
    private String nome;
    @NotBlank(message = "Email inválido") @Email
    private String email;
    @NotBlank(message = "Senha inválida")
    @Size(min = 6, max = 20, message = "A senha deve ter entre 6 e 20 caracteres ")
    private String senha;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.nome = user.getNome();
        this.email = user.getEmail();
    }

    public UserDTO(long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
