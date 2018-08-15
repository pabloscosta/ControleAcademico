
public class Monitor implements Disciplina{
   private String nome;
   
   public Monitor(Aluno nome, Disciplina disciplina ){
       this.nome=nome;
       this.disciplina = disciplina;
    }
   
   public String Monitor() {
       return nome+disciplina;
    } 
}
