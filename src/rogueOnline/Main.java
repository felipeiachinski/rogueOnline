package rogueOnline;

import java.util.Scanner;

public class Main {
		
	// IN�CIO DA EXECU��O
	public static void main(String[] args) {	
		
		Scanner scan =  new Scanner(System.in);	

		// CRIAR WEAPONS A PARTIR DO CONSTRUTOR. PAR�METROS: weaponName, weaponAtk
		Weapon machado = new Weapon("Machado de Margit", 3);
		Weapon lua = new Weapon("Lua M�gica", 4);
		Weapon espadas = new Weapon("Espadas de A�o Negro", 5);
		
		// CRIAR HER�I A PARTIR DA CLASSE E M�TODO DE CRIA��O
		Character hero = Creation.create();
		
		// CRIAR INIMIGOS A PARTIR DO CONTRUTOR.  PAR�METROS: Name, Atk, Def, Agi, Cha, Con, Weapon, PV
		Character enemy1 = new Character("Margit, o Agouro Ca�do", 3, 3, 9, 3, 3, machado, 30);
		Character enemy2 = new Character("Rennala, Rainha da Lua Cheia", 4, 4, 10, 4, 4, lua, 40);
		Character enemy3 = new Character("Flagelo Estelar Radahn", 5, 5, 11, 5, 5, espadas, 50);
		
		// NARRA��ES, ENCONTROS E BATALHAS
		Narration.encounter1(hero, enemy1);
		Narration.encounter2(hero, enemy2);
		Narration.encounter3(hero, enemy3);
		
		}
	}
