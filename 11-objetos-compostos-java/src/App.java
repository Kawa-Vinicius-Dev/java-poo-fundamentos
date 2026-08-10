public class App {
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
                                    68.9f,11,2,1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
                                        57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f,
                                80.9f, 12, 2, 1);
        l[3] = new Lutador("Kawa Viana", "Brasil", 22, 1.85f,
                                85.5f, 0, 1, 0);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f,
                                109.3f, 13, 0, 1);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f,
                                105.7f, 12, 0, 1);
        l[0].apresentar();
    }
}
