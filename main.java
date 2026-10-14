import modelos.Pessoa;
import modelos.Aluno;

public class main{
  public static void main(String args[]){
    Pessoa ana = new Pessoa("Ana da Silva", 17, (float) 1.70);
    System.out.println(ana.apresentar());
    Aluno bruno = new Aluno("Bruno de Souza", 16, (float) 1.83, 123456);
    System.out.println(bruno.apresentar());
  }
}