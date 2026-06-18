package Professor;

import Aluno.Aluno;
import Seminario.Seminario;

public class Professor {

   private String nome;
   private String especialidade;
   private Seminario[] seminarios;

   public Professor(String nome, String especialidade) {
      this.nome = nome;
      this.especialidade = especialidade;

   }

   public Professor(String nome, String especialidade, Seminario[] seminarios) {
      this.nome = nome;
      this.especialidade = especialidade;
      this.seminarios = seminarios;

   }

   public void imprimir() {
      System.out.println("professor" + this.nome);
      if (seminarios == null) return;
      System.out.println("seminario cadastrados");
      
      // TODO REVISAR ESSE CODIGO 
    for(Seminario seminario : this.seminarios){
         System.out.println(seminario.getTitulo());
         System.out.println(seminario.getLocal());
         if (seminario.getAlunos() == null || seminario.getAlunos().length ==0) {
            System.out.println("****************");

            for(Aluno aluno : seminario.getAlunos()){
               System.out.println("Aluno " + aluno.getNome() + "idade " + aluno.getIdade());

            }
            
         }
    }         
      
   }

   public String getEspecialidade() {
      return especialidade;
   }

   public String getNome() {
      return nome;
   }

   public void setEspecialidade(String especialidade) {
      this.especialidade = especialidade;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Seminario[] getSeminarios() {
      return seminarios;
   }

   public void setSeminarios(Seminario[] seminarios) {
      this.seminarios = seminarios;
   }

}