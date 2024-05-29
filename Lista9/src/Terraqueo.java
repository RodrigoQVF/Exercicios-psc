public class Terraqueo extends PersonagemDragonBall {

    private String pais;
    private String cidade;

    public Terraqueo(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, String pais, String cidade){
        super(nome, idade, sexo, ki, temporada, poderEspecial);
        this.cidade = cidade;
        this.pais = pais;
    }

    public String toString(){
        return "\nNome:" + this.nome + "\nIdade:" + this.idade + "\nPaís:" + this.pais + "\nCidade:" + this.cidade + "\nSexo:" + this.sexo + "\nTemporada:" + this.temporada + "\nKi:" + this.ki + "\nPoder especial" + this.poderEspecial;
    }

    @Override
    float calculaPoder() { /* Override utilizado nas classes que herdam da classe abstrata */
        return this.ki;
    }


}
