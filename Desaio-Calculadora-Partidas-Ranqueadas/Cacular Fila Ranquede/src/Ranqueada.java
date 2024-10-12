import java.util.Random;
import java.util.Scanner;

public class Ranqueada {

    private class Rknd{

        String nomePlayer;
        String playerELO;
        int pointsPlayer;

        Rknd(String nome, int level, String playerELO){
            this.nomePlayer = nome;
            this.pointsPlayer = level;
            this.playerELO = playerELO;
        }
    }

    //interaction
    Random pts = new Random();
    Scanner sc = new Scanner(System.in);

    //player
    String elo;
    Rknd player1;
    Rknd player2;
    Rknd player3;
    Rknd player4;
    int points = pts.nextInt(100);

    //results
    String firstCombat;
    String secondCombat;

public void update(){
    interactionPlayer();
    searchGame();
}

    Ranqueada(){
        for(int i = 0; i < 10; i++){
            if (points <= 20) {
                elo = "prata";
            }
            else if (points > 20 && points <= 40) {
                elo = "ouro";
            }
            else if (points > 40 && points <= 60) {
                elo = "platina";
            }
            else if (points > 60 && points <= 80) {
                elo = "diamante";
            }
            else if (points > 80 && points <= 100) {
                elo = "imortal";
            }

            player1 = new Rknd(" ", points, elo);

            player2 = new Rknd("Joaozinho", points, elo);

            player3 = new Rknd("Bruninho", points, elo);

            player4 = new Rknd("Cainho", points, elo);
        }
    }
    public void interactionPlayer(){
        System.out.println("Digite seu nome de heroi: ");
        player1.nomePlayer = sc.next();

        if (player1.nomePlayer != " ") {
            System.out.println("Parabéns pelo acesso " + player1.nomePlayer + ". Segue uma lista com seus atributos!!");   
            System.out.println( " Nome: " + player1.nomePlayer );
            System.out.println( " Pontos: " + player1.pointsPlayer); 
            System.out.println( " Elo: " + player1.playerELO);
        }
    }

    public void searchGame(){
            int seach;
            String firstMatch;
            String secondMatch;
            System.out.println("Gostaria de iniciar um pareamento de partida? Digite 1 para SIM e 2 para NÃO");
            seach = sc.nextInt();
            if (seach == 1) {
                for(int i = 0; i <= 1; i++)
                {
                    if(player1.pointsPlayer <= player2.pointsPlayer )
                    {
                        firstMatch = "Partida encontrada: " + player1.nomePlayer + " com elo: " + player1.playerELO + " VS " + player2.nomePlayer + " com elo: " + player2.playerELO;
                        System.out.println(firstMatch);
                    }
                    if(player3.pointsPlayer <= player4.pointsPlayer )
                    {
                        secondMatch = "Partida encontrada: " + player3.nomePlayer + " com elo: " + player3.playerELO + " VS " + player4.nomePlayer + " com elo: " + player4.playerELO;
                        System.out.println(secondMatch);
                    }
                }
            }
            else
            {
                System.out.println("Foi um prazer de te ver aqui heroi: " + player1.nomePlayer + " volte sempre!");
                System.exit(0);
            }
        }
    }
    