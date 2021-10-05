public class App {
    public static void main(String[] args) throws Exception {
        
        Gato gato1 = new Gato();
            gato1.apelido = "Frajola";
            gato1.pelo = "Liso";
            gato1.cor = "Preto e branco";
            gato1.idade = 2;
            gato1.peso = 3.5f;
            gato1.status();
            gato1.arrepiado = false;
            gato1.miando = true;

        System.out.println("Caneta");

        Caneta caneta1 = new Caneta();
            caneta1.cor = "Preta";
            caneta1.marca = "Stabil";
            caneta1.ponta = 0.5f;
            caneta1.tampada = false;
            caneta1.status();

        System.out.println("Carro");

        Carro carro1 = new Carro();
            carro1.aro = 16;
            carro1.cor = "Cinza";
            carro1.modelo = "Celta";
            carro1.velocidade = 0f;
            carro1.motor = true;
            carro1.ligado();
            carro1.status();

        System.out.println("Conta corrente");

        ContaCorrente conta1 = new ContaCorrente();
            conta1.agencia = 2412;
            conta1.nome = "Acelora";
            conta1.numeroConta = 11111;
            conta1.vejaSaldo = true;
            conta1.status();
            conta1.saldo();
        
    }
}
