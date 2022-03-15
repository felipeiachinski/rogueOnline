package rogueOnline;

import java.util.Scanner;

public class Character {
	
	Scanner scan =  new Scanner(System.in);
	
	// DECLARAÇÃO DE ATRIBUTOS DOS PERSONAGENS
	private String charName;
	private int charAtk;
	private int charDef;
	private int charAgi;
	private int charCha;
	private int charCon;
	private int charPV;
	private Weapon weapon;

	// GETTERS (RETORNADORES - ENCAPSULAMENTO PRIVADO)
	public String getName() {
		return charName;
	}
	
	public int getAtk() {
		return charAtk;
	}
	
	public int getDef() {
		return charDef;
	}
	
	public int getAgi() {
		return charAgi;
	}
	
	public int getCha() {
		return charCha;
	}
	
	public int getCon() {
		return charCon;
	}
	
	public int getPV() {
		return charPV;
	}
	
	// SETTERS (ALTERADORES - ENCAPSULAMENTO PRIVADO)
	public void setName(String charName) {
		this.charName = charName;
	}
	
	public void setAtk(int charAtk) {
		this.charAtk = charAtk;
	}
	
	public void setDef(int charDef) {
		this.charDef = charDef;
	}
	
	public void setAgi(int charAgi) {
		this.charAgi = charAgi;
	}
	
	public void setCha(int charCha) {
		this.charCha = charCha;
	}
	
	public void setCon(int charCon) {
		this.charCon = charCon;
	}
	
	// AVALIA SE PERSONAGEM ESTÁ VIVO
	public boolean isAlive() {
		return charPV > 0;
	}
	
	// MÉTODO CONSTRUTOR PARA INIMIGOS (DEFININDO PV)
	public Character(String charName, int charAtk, int charDef, int charAgi, int charCha, int charCon, Weapon weapon, int charPV) {
		this.charName = charName;
		this.charAtk = charAtk;
		this.charDef = charDef;
		this.charAgi = charAgi;
		this.charCha = charCha;
		this.charCon = charCon;
		this.weapon = weapon;
		this.charPV = charPV;
	}
	
	// MÉTODO CONSTRUTOR PARA HERÓI (VIDA NÃO É PASSADA, VIDA = VIDA BASE (50) + CON)
	public Character(String charName, int charAtk, int charDef, int charAgi, int charCha, int charCon, Weapon weapon) {
		this(charName, charAtk, charDef, charAgi, charCha, charCon, weapon, (50 + charCon));
	}
	
	// APRESENTAR PERSONAGEM E SEUS STATUS
	public static void present(Character character) {
		System.out.printf("%n%s - Stats%n%n"
				+ "PV %d%n"
				+ "Atk %d%n"
				+ "Def %d%n"
				+ "Agi %d%n"
				+ "Cha %d%n"
				+ "Con %d%n"
				+ "Arma: %s (Atk %d)%n",
				character.charName, character.charPV, character.charAtk, character.charDef, character.charAgi,
				character.charCha, character.charCon, character.weapon.getName(), character.weapon.getAtk());
		System.out.println();
		}
	
	// TOMAR DANO
	public void takeDamage(int damage) {
		charPV -= damage;
		if (charPV <= 0) {
			charPV = 0;
			System.out.printf("%s tomou %d de dano. PV: %d.%n%n", charName, damage, charPV);
			scan.nextLine();
			System.out.println();
			System.out.printf("%nÉ o fim para %s...%n", charName);
		} else {
			System.out.printf("%s tomou %d de dano. PV: %d.%n%n", charName, damage, charPV);
			scan.nextLine();
		}
	}
	
	// ATAQUE EM BATALHA
	public void attack(Character enemy) {
		System.out.printf("%s atacou %s com %s...%n", charName, enemy.charName, weapon.getName());
		int roll1 = Battle.rollDice(4);
		int roll2 = Battle.rollDice(4);
		int roll3 = Battle.rollDice(4);
		int damage = charAtk + weapon.getAtk() + roll1 + roll2 + roll3;
		System.out.printf("3d4 [%d,%d,%d] + Atk [%d] + %s Atk [%d] = %d%n", roll1, roll2, roll3, charAtk,
				weapon.getName(), weapon.getAtk(), damage);
		enemy.takeDamage(damage);	
	}
}
	