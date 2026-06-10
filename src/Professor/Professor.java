package Professor;

import Seminario.Seminario;

public class Professor {

   private String nome;
   private String especialidade;
   private Seminario[] seminarios;

   public Professor(String nome, String especialidade) {
      this.nome = nome;
      this.especialidade = especialidade;
   
     
   }

   public Professor(String nome, String especialidade,Seminario[] seminarios) {
      this.nome = nome;
      this.especialidade = especialidade;
      this.seminarios = seminarios;
      
     
   }

   public void imprimir(){
      System.out.println(nome);
     
            System.out.println(especialidade);
           
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