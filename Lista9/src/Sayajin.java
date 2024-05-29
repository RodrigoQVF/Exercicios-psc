public class Sayajin extends PersonagemDragonBall implements Transformar{

    private int nivelMaximoSSJ;
    private boolean temRabo;

    public Sayajin(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo) {
        super(nome, idade, sexo, temporada, ki, poderEspecial);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;

    }

    public String toString(){
        return "\nNome:" + this.nome + "\nIdade:" + this.idade + "\nSexo:" + this.sexo + "\nTemporada:" + this.temporada + "\nKi:" + this.ki + "\nPoder especial" + this.poderEspecial + "\nNivel máximo SSJ:" + this.nivelMaximoSSJ + "\nTem rabo:" + this.temRabo;
    }


    @Override
    float calculaPoder() {
        return this.ki * (1 + nivelMaximoSSJ * 0.1f);
    
    }

    @Override
    public void transformar(int nivel) {
        if((nivel == 4 || nivel == 5) && (this.nome == "goku" || this.nome == "vegeta")){
            
            System.out.printf("\n{{ %s }} transformou para super sayajin nível {{ %d }}\n", this.nome, nivel);
        } else if(nivel <= 3){
            System.out.printf("\n{{ %s }} transformou para super sayajin nível {{ %d }}\n", this.nome, nivel);  
        }else{
            System.out.println("\nNão foi possível transformar esse sayajin");
            
    }
    
}
}