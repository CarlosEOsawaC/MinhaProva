import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> participante = new ArrayList<String>();

        participante.add("Alane Dias");
        participante.add("Beatriz Reis");
        participante.add("Davi Brito");
        participante.add("Deniziane Ferreira");
        participante.add("Fernanda Bande");
        participante.add("Giovanna Lima");
        participante.add("Giovanna Pitel");
        participante.add("Isabelle Nogueira");
        participante.add("Juninho");
        participante.add("Leidy Elin");
        participante.add("Lucas Henrique");
        participante.add("Lucas Luigi");
        participante.add("Lucas Pizane");
        participante.add("Marcus Vinicius");
        participante.add("Matteus Amaral");
        participante.add("Maycon Cosmer");
        participante.add("MC Bin Laden");
        participante.add("Michel Nogueira");
        participante.add("Nizam");
        participante.add("Raquele Cardozo");
        participante.add("Rodriguinho");
        participante.add("Thalyta Alves");
        participante.add("Vanessa Lopes");
        participante.add("Vinicius Rodrigues");
        participante.add("Wanessa Camargo");
        participante.add("Yasmin Brunet");

        int i;

        System.out.printf("Participantes BBB23:\n");
        int n = participante.size();
        for (i = 0; i < n; i++) {
            System.out.printf("Jogador %d- %s\n", i, participante.get(i));
        }
        System.out.printf("\nEm quem você vota para sair da casa? ");
        i = ler.nextInt();
    }
}