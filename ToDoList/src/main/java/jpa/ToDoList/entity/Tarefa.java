package ToDoList.src.main.java.jpa.ToDoList.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String descricao;
    private Date dataFinal;

    public Tarefa() {

    }
}
