public class PersonagemFactory{

    public static Terraqueo Terraqueo(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, String pais, String cidade) {
        return new Terraqueo(nome, idade, sexo, temporada, ki, poderEspecial, pais, cidade);
    }

    public static Sayajin sayajin(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, int nivelMaximoSSJ, boolean temRabo){
        return new Sayajin(nome, idade, sexo, temporada, ki, poderEspecial, nivelMaximoSSJ, temRabo);
    }

    public static Namekuseijin namekuseijin(String nome, int idade, char sexo, int temporada, int ki, String poderEspecial, int quantidadeEsferas, int podeCurar){
        return new Namekuseijin(nome, idade, sexo, temporada, ki, poderEspecial, quantidadeEsferas, podeCurar);

    }









}
