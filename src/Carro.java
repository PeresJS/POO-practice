public class Carro {
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int combustivel;
    int kmPorLitros;
    boolean turbo;
    String capacidadeTanque;

    void abastecer(int litros) {
        combustivel = combustivel + litros;
    }

    int autonomiaCombustivel() {
        int autonomia = kmPorLitros * combustivel;
        return autonomia;
    }
}
