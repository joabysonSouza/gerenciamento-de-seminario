import Aluno.Aluno;
import Local.Local;
import Professor.Professor;
import Seminario.Seminario;

public class Main {
    public static void main(String[] args) {
        Local local = new Local("fazenda teste");
        Aluno aluno = new Aluno("Aluno01", 90);
        Aluno[] alunos = {aluno};
      
    Seminario seminario = new Seminario("Protecçao do Meio Hambiente", local, alunos);

    Seminario[] semiariosDisponivies = {seminario};

     Professor professor = new Professor("ProfessorTeste","Fisica quantica");

     professor.setSeminarios(semiariosDisponivies);

    
    
    

     
       
    }
}
