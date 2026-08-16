public class App {
    public static void main(String[] args){
        Video []v = new Video[3];
        v[0] = new Video("encapsulamento");
        v[1] = new Video("herança");
        v[2] = new Video("polimorfismo");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Kawã","M",22, "Colt");
        g[1] = new Gafanhoto("Rilary", "F",23, "Bezpuro");
        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());
        //System.out.println(g[1].toString());

        Visualizacao vis = new Visualizacao(g[0], v[0]);
        Visualizacao vis2 = new Visualizacao(g[0], v[1]);
        System.out.println(vis.toString());


    }
}
