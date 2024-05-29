
public class App {
    public static void main(String[] args) {
       Terraqueo humano = PersonagemFactory.Terraqueo("Kuririn", 42, 'm', 1, 2000, "Kienzan", "Brasil", "Diadema");
       Sayajin sayajin = PersonagemFactory.sayajin("goku", 60, 'M', 7, 8001, "Kaioken", 7, false);
       Sayajin sayajin2 = PersonagemFactory.sayajin("gohan", 30, 'M', 7, 7000, "Kamehameha", 3, false);
       Namekuseijin namekuseijin = PersonagemFactory.namekuseijin("Dende", 100, 'M', 2, 3000, "Cura", 2, 1);
        sayajin.transformar(5);
        sayajin2.transformar(3);
        sayajin2.transformar(5);
        namekuseijin.fazerDesejo("revive Jailson mendes");

    }
}
