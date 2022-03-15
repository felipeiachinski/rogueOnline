package rogueOnline;

import java.util.Scanner;

public class Narration {
	
	static Scanner scan =  new Scanner(System.in);
	
	private static void toAppear(Character hero, Character enemy) {
		System.out.println(enemy.getName() + " aparece...?!");
		scan.nextLine();
		System.out.println("\n\n\n--- BATALHA INICIADA ---\n");
		Character.present(hero);
		Character.present(enemy);
		Battle.avaliate(hero, enemy);
	}
	
	public static void encounter1(Character hero, Character enemy) {
		System.out.println("\n\n\n\"Hmmm...?\" - voc� resmunga ao acordar. Voc� n�o se lembra do");
		scan.nextLine();
		System.out.println("que aconteceu na noite anterior. Simplesmente sabe que agora est� aqui.");
		scan.nextLine();
		System.out.println("Ent�o, analisa o cen�rio... Voc� est� deitado em uma cama podre e velha");
		scan.nextLine();
		System.out.println("no canto de um quarto apertado. Olhando em volta, observa paredes brancas");
		scan.nextLine();
		System.out.println("e descascadas. Olhando para cima, visualiza uma tremelicante l�mpada de");
		scan.nextLine();
		System.out.println("uma fraca luz amarela. Al�m disso, h� algo mais no teto... Um al�ap�o?");
		scan.nextLine();
		System.out.println("Seria por ali que haviam trazido voc�? Enfim, olhando a frente, percebe");
		scan.nextLine();
		System.out.println("uma porta aberta que leva a um corredor, sem conseguir ver o fim do mesmo.");
		scan.nextLine();
		System.out.println("Confuso e sem op��es, voc� decide atravessar a porta...\n");
		scan.nextLine();
		
		System.out.println("Chocado com a revela��o de um espa�o pior iluminado que o quarto, voc�");
		scan.nextLine();
		System.out.println("mais uma vez encara o ambiente. Bifurca��es. Dezenas. Voc� est� preso em");
		scan.nextLine();
		System.out.println("um labirinto. Voc� caminha por este labirinto, temendo o que pode haver");
		scan.nextLine();
		System.out.println("pela frente... Em passos lentos e respira��o acelerada, voc� anda, at�");
		scan.nextLine();
		System.out.println("que... Uma porta! Voc� entra. Escurid�o. Voc� escuta passos ao seu redor,");
		scan.nextLine();
		System.out.println("circulando sua posi��o e se aproximando... At� que as luzes se acendem, e...\n");
		scan.nextLine();
		toAppear(hero, enemy);
	}
	
	public static void encounter2(Character hero, Character enemy) {
		scan.nextLine();
		toAppear(hero, enemy);
	}
	
	public static void encounter3(Character hero, Character enemy) {
		scan.nextLine();
		toAppear(hero, enemy);
	}
}
	