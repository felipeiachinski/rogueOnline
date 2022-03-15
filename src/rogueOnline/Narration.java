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
		System.out.println("\n\n\n\"Hmmm...?\" - você resmunga ao acordar. Você não se lembra do");
		scan.nextLine();
		System.out.println("que aconteceu na noite anterior. Simplesmente sabe que agora está aqui.");
		scan.nextLine();
		System.out.println("Então, analisa o cenário... Você está deitado em uma cama podre e velha");
		scan.nextLine();
		System.out.println("no canto de um quarto apertado. Olhando em volta, observa paredes brancas");
		scan.nextLine();
		System.out.println("e descascadas. Olhando para cima, visualiza uma tremelicante lâmpada de");
		scan.nextLine();
		System.out.println("uma fraca luz amarela. Além disso, há algo mais no teto... Um alçapão?");
		scan.nextLine();
		System.out.println("Seria por ali que haviam trazido você? Enfim, olhando a frente, percebe");
		scan.nextLine();
		System.out.println("uma porta aberta que leva a um corredor, sem conseguir ver o fim do mesmo.");
		scan.nextLine();
		System.out.println("Confuso e sem opções, você decide atravessar a porta...\n");
		scan.nextLine();
		
		System.out.println("Chocado com a revelação de um espaço pior iluminado que o quarto, você");
		scan.nextLine();
		System.out.println("mais uma vez encara o ambiente. Bifurcações. Dezenas. Você está preso em");
		scan.nextLine();
		System.out.println("um labirinto. Você caminha por este labirinto, temendo o que pode haver");
		scan.nextLine();
		System.out.println("pela frente... Em passos lentos e respiração acelerada, você anda, até");
		scan.nextLine();
		System.out.println("que... Uma porta! Você entra. Escuridão. Você escuta passos ao seu redor,");
		scan.nextLine();
		System.out.println("circulando sua posição e se aproximando... Até que as luzes se acendem, e...\n");
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
	