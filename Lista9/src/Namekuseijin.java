public class Namekuseijin extends PersonagemDragonBall{

    private int quantidadeEsferas;
    private int podeCurar;

    public Namekuseijin(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, int quantidadeEsferas, int podeCurar) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    public String toString(){
        return "\nNome:" + this.nome + "\nIdade:" + this.idade + "\nQuantidade de esferas:" + this.quantidadeEsferas + "\nPode curar:" + this.podeCurar + "\nSexo:" + this.sexo + "\nTemporada:" + this.temporada + "\nKi:" + this.ki + "\nPoder especial" + this.poderEspecial;
    }

    @Override
    float calculaPoder() {
        float poder;
        if(this.podeCurar == 1){
            poder = ki * (1 + 0.2f);
            return poder;
        }else{
            poder = ki * 1;
            return poder;
        }
    }

    public String fazerDesejo(String desejo){
        System.out.println("Desejo pede, desejo realizo. Desejo " + desejo + " está cedido");
        return "Desejo pede, desejo realizo. Desejo " + desejo + " está cedido";
    }
    

}
