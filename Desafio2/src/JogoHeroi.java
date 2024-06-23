import java.util.Scanner;

public class JogoHeroi {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Insira a quantidade de vitorias:");
        int vitoria = scanner.nextInt();
        System.out.println("Insira a quantidade de derrotas:");
        int derrota = scanner.nextInt();
        scanner.close();

        //Declaracao das variaveis
        int saldoVitorias = calculoRankeadas(vitoria, derrota);
        String nivel = determinarNivel(saldoVitorias);

        //Saida de dados
        System.out.println("O Heroi tem saldo de " + saldoVitorias + " e esta no nivel " + nivel);
    }

    //Funcoes
    private static int calculoRankeadas(int vitoria, int derrota) {
        return vitoria - derrota;
    }

    private static String determinarNivel(int saldoVitorias){
        if (saldoVitorias <= 10) {
            return "Ferro";
        } else if (saldoVitorias <= 20) {
            return "Bronze";
        } else if (saldoVitorias <= 50) {
            return "Prata";
        } else if (saldoVitorias <= 80) {
            return "Ouro";
        } else if (saldoVitorias <= 90) {
            return "Diamante";
        } else if (saldoVitorias <= 100) {
            return "Lendario";
        } else {
            return "Imortal";
        }
    }
}
