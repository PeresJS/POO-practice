public class MainCarro {
    public static void main(String[] args) {

        Carro corolla = new Carro();
        corolla.cavalos = 175;
        corolla.cor = "preto";
        corolla.transmissao = "automático";
        corolla.montadora = "Toyota";
        corolla.combustivel = 30;
        corolla.turbo = true;
        corolla.capacidadeTanque = "50";
        corolla.kmPorLitros = 8;

        Carro civic = new Carro();
        civic.cavalos = 175;
        civic.cor = "preto";
        civic.transmissao = "manual";
        civic.montadora = "Toyota";
        civic.combustivel = 20;
        civic.turbo = false;
        civic.capacidadeTanque = "50";
        civic.kmPorLitros = 7;

        System.out.println("a autornomia do corolla é: " + corolla.autonomiaCombustivel());
        System.out.println("a autonomia do civic é: " + civic.autonomiaCombustivel());
    }
}
