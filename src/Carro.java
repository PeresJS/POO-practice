public class Carro {
    int cavalos;
    String cor;
    String montadora;
    String transmissao;
    int combustivel;
    int capacidadeTanque;
    int kmPorLitros;


     void abastecer(int litros) {
         combustivel = combustivel + litros;

     }
     void tirarGasolina(int litros) {
         combustivel = combustivel - litros;
     }
     int autonomiaCombustivel(){
        int autonomia = combustivel * kmPorLitros;
         return autonomia;
     }
}
