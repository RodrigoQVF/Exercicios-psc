public class Empregado {

    private String nome;
    private int idade;
    private float salario;



    public Empregado(String nome, int idade, float salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {

        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {

        return idade;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }

    public void promover(){
        if(getIdade() <= 18){
            System.out.println("Nao e permitido a promocao de funcionario de menos de 18 anos");
        }else{
            aumentarSalario(25f);
        }
    }

    public String toString(){
        return "Nome:" + this.nome + "\n Idade:" + this.idade + "\nSalario:" + this.salario + "\n";

    }
    public void aumentarSalario(float porcentagem) {
        float salarioNovo = getSalario() + (getSalario() * (porcentagem/100));
        this.salario = salarioNovo;
    }

    public void demitir(int op){
        switch (op) {
            case 1:
                System.out.println("O empregador deverá cumprir o aviso previo");
            break;
            case 2:
                float aviso;
                aviso = getSalario() + (getSalario() * 0.40f);
                System.out.println("O empregador deverá receber 40% do aviso prévio");
                System.out.println("Valor do aviso: " + aviso);
            break;
            case 3:
                System.out.println("Pagamento do INSS conforme o salário do empregador");
                if(getSalario() >= 1000 || getSalario() < 2000){
                    System.out.println("Receberá 1500R$");
                }
                if(getSalario() >= 2000 || getSalario() < 3000){
                    System.out.println("Receberá: 2500R$");
                }
                if(getSalario() >= 3000 || getSalario() <= 4000){
                    System.out.println("Receberá 3500R$");
                }
                if(getSalario() > 4000){
                    System.out.println("Receberá 4000R$");
                }

            break;
            default:
            System.out.println("opcao invalido");
            break;

        }

        
    }
    public void fazerAniversario(){
        this.idade++;
        
    }

}
