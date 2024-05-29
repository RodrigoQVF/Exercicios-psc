public abstract class PersonagemDragonBall {

    protected String nome;
    protected int idade;
    protected char sexo;
    protected int temporada;
    protected int ki;
    protected String poderEspecial;

    public PersonagemDragonBall(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.temporada = temporada;
        this.ki = ki;
        this.poderEspecial = poderEspecial;
    }

    abstract float calculaPoder();
}
