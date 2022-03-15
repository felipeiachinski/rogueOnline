package rogueOnline;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	
	private static final Random RANDOM = new Random();
	static Scanner scan =  new Scanner(System.in);
	
	// ROLAGEM DE DADO
	public static int rollDice(int num) {
		return RANDOM.nextInt(num) + 1;
	}
	
	// BATALHAR ATÉ A MORTE DEFININDO QUEM ATACA PRIMEIRO, ENTÃO PARABENIZANDO O VENCEDOR
	public static void toBattle(Character first, Character second) {
		while (first.isAlive() && second.isAlive()) {
			first.attack(second);
			if (second.isAlive()) {
				second.attack(first);
				}
			}
		var winner = first.isAlive() ? first : second;
		System.out.printf("%s venceu a batalha. PV: %d.%n", winner.getName(), winner.getPV());
		}
	
	// AVALIADOR DE AGILIDADES
	public static void avaliate(Character hero, Character enemy) {
		if (hero.getAgi() == enemy.getAgi()) {
			rollInitiative(hero, enemy);
		} else {
			compareAgi(hero, enemy);
		}
	}
	

	// DEFINIR ORDEM DE ATAQUE COMPARANDO INICIATIVAS
	public static void compareInitiative(Character hero, int heroStart, Character enemy, int enemyStart) {
		var first = heroStart > enemyStart ? hero : enemy;
		var second = heroStart < enemyStart ? hero : enemy;
		var biggerRoll = heroStart > enemyStart ? heroStart : enemyStart;
		var smallerRoll = heroStart < enemyStart ? heroStart : enemyStart;
		System.out.printf("%s rolou a maior iniciativa (%d > %d), então atacará primeiro!\n\n", first.getName(), biggerRoll, smallerRoll);
		scan.nextLine();
		toBattle(first, second);
		}
	
	// DEFINIR ORDEM DE ATAQUE COMPARANDO AGILIDADES
	public static void compareAgi(Character hero, Character enemy) {
		var first = hero.getAgi() > enemy.getAgi() ? hero : enemy;
		var second = hero.getAgi() < enemy.getAgi() ? hero : enemy;
		var biggerAgi = hero.getAgi() > enemy.getAgi() ? hero.getAgi() : enemy.getAgi();
		var smallerAgi = hero.getAgi() < enemy.getAgi() ? hero.getAgi() : enemy.getAgi();
		System.out.printf("%s possui a maior agilidade (%d > %d), então atacará primeiro!\n\n", first.getName(), biggerAgi, smallerAgi);
		scan.nextLine();
		Battle.toBattle(first, second);
	}
	
	// DEFINIR INICIATIVA QUANDO AS AGILIDADES ESTÃO EMPATADAS
	public static void rollInitiative(Character hero, Character enemy) {
		System.out.printf("%nOs dois combatentes possuem a mesma agilidade (%d = %d)! A iniciativa será decidida com um d20.%n", hero.getAgi(), enemy.getAgi());
		scan.nextLine();
		int heroStart;
		int enemyStart;
		while (true) {
			heroStart = rollDice(20);
			enemyStart = rollDice(20);
			System.out.printf("%s... 1d20 [%d] = %d%n", hero.getName(), heroStart, heroStart);
			scan.nextLine();
			System.out.printf("%s... 1d20 [%d] = %d%n", enemy.getName(), enemyStart, enemyStart);
			scan.nextLine();
			if (heroStart == enemyStart) {
				System.out.println("Os dados rolaram o mesmo valor! Rerolando...\n");
				scan.nextLine();
				continue;
			} else {
				break;
				}
			}
		compareInitiative(hero, heroStart, enemy, enemyStart);
		}
	}
