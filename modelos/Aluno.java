package modelos;

public class Aluno extends Pessoa{
  public String nome;
  public Integer idade;
  public Float altura;
  public Integer matricula;

  public Aluno(String nome, Integer idade, Float altura, Integer matricula){
    super.Pessoa(nome, idade, altura);
    this.matricula = matricula;
  }

  @Override
  public String apresentar(){
    String apresentacaoPessoa = super.apresentar();
    return apresentacaoPessoa + "\nMatrícula: " + this.matricula;
  }
}