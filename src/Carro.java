public class Carro {
    int cavalos;
    String cor;
    String montadora;
    String transmissao;
    int combustivel;
    int capacidadeTanque;
    int kmPorLitros;


     int abastecer(int litros) {
         int soma = combustivel + litros;
         if (soma > capacidadeTanque) {
             combustivel = capacidadeTanque;
             int sobra = soma - capacidadeTanque;
             return sobra;
         } else {
             combustivel = soma;
             return soma;
         }
     }
     int autonomiaCombustivel(){
        int autonomia = combustivel * kmPorLitros;
         return autonomia;
     }
}
