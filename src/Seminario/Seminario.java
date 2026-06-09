package Seminario;

import Aluno.Aluno;
import Local.Local;

public class Seminario {
    private String titulo;
    private Local local ;
   
    private Aluno aluno1 = new Aluno("gustavo", 23);

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;

    }

    public void imprimir() {
        System.out.println("o aluno " + aluno1.getNome() + " idade " + aluno1.getIdade()
                + " está participando do Seminario " + titulo + " que está acontenco no endereco " + local.getEndereco());
    }

}
