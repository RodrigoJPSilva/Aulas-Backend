package jpa.ToDoList.repositories;

import jpa.ToDoList.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositories extends JpaRepository<Usuario, Long> {
}
