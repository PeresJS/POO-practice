public class MainCarro {
    public static void main(String[] args) {

        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "cor";
        punto.montadora = "Fiat";
        punto.transmissao = "manual";
        punto.capacidadeTanque = 60;
        punto.combustivel = 10;
        punto.kmPorLitros = 11;

        Carro corolla = new Carro();
        corolla.cavalos = 175;
        corolla.cor = "preto";
        corolla.transmissao = "manual";
        corolla.montadora = "Toyota";
        corolla.capacidadeTanque = 60;
        corolla.combustivel = 0;
        corolla.kmPorLitros = 8;

        System.out.println("Tanque do Punto(antes de abastecer)" + punto.combustivel);
        System.out.println("Tanque do Corolla(antes de abastecer)" + corolla.combustivel);

        System.out.println("Abastecendo 20 no punto");
        punto.abastecer(20);
        System.out.println("Abastecendo 50 no punto");
        int sobraPunto= punto.abastecer(50);


        System.out.println("Abastecendo 50 no corolla");
        corolla.abastecer(50);
        System.out.println("Abastecendo 50 no corolla");
        int sobraCorolla = corolla.abastecer(50);

        System.out.println("punto (depois de abastecer) " + punto.combustivel + " sobrou " + sobraPunto);

        System.out.println("civic (depois de abastecer) " + corolla.combustivel +" sobrou " + sobraCorolla);

        System.out.println("A autonomia é de " + punto.autonomiaCombustivel() +"km");
        System.out.println("A autonomia é de " + corolla.autonomiaCombustivel() +"km");
    }
}
