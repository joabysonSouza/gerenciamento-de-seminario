package Seminario;

import Aluno.Aluno;
import Local.Local;


public class Seminario {
    private String titulo;
    private Local local ;
    private Aluno[] alunos;
  
   

    public Seminario(String titulo, Local local, Aluno[] alunos){
       this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
       
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Local getLocal() {
        return local;
    }
   
  
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public void setLocal(Local local) {
        this.local = local;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    
  

}
