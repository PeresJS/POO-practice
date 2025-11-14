public class MainCarro {
    public static void main(String[] args) {

        Carro punto = new Carro();
        punto.cavalos = 100;
        punto.cor = "cor";
        punto.montadora = "Fiat";
        punto.transmissao = "Fiat";
        punto.capacidadeTanque = 60;
        punto.combustivel = 30;
        punto.kmPorLitros = 11;

        Carro corolla = new Carro();
        corolla.cavalos = 175;
        corolla.cor = "preto";
        corolla.transmissao = "manual";
        corolla.montadora = "Toyota";
        corolla.capacidadeTanque = 60;
        corolla.combustivel = 40;
        corolla.kmPorLitros = 8;

        System.out.println("punto " + punto.combustivel);
        System.out.println("civic " + corolla.combustivel);

        punto.abastecer(20);
        corolla.abastecer(10);

        System.out.println("punto (depois de abastecer) " + punto.combustivel);
        System.out.println("civic (depois de abastecer) " + corolla.combustivel);

        punto.tirarGasolina(20);
        corolla.tirarGasolina(20);

        System.out.println("punto (depois de tirar a gasolina) " + punto.combustivel);
        System.out.println("civic (depois de tirar a gasolina) " + corolla.combustivel);

        System.out.println("A autonomia é de " + punto.autonomiaCombustivel() +"km");
        System.out.println("A autonomia é de " + corolla.autonomiaCombustivel() +"km");
    }
}
