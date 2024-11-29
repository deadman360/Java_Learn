package deadman360;

public class Cliente {
    private String nome ;
    private String tipoConta ;
    private double salario;

    public Cliente (String nome, String tipoConta, double salario){
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.salario = salario;
    }
    // Getters
    public String getNome(){
        return nome;
    }
    public String getConta(){
        return tipoConta;
    }
    public double getSalario(){
        return salario;
    }
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

}