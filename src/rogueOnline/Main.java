package rogueOnline;

import java.util.Scanner;

public class Main {
		
	// INÍCIO DA EXECUÇÃO
	public static void main(String[] args) {	
		
		Scanner scan =  new Scanner(System.in);	

		// CRIAR WEAPONS A PARTIR DO CONSTRUTOR. PARÂMETROS: weaponName, weaponAtk
		Weapon machado = new Weapon("Machado de Margit", 3);
		Weapon lua = new Weapon("Lua Mágica", 4);
		Weapon espadas = new Weapon("Espadas de Aço Negro", 5);
		
		// CRIAR HERÓI A PARTIR DA CLASSE E MÉTODO DE CRIAÇÃO
		Character hero = Creation.create();
		
		// CRIAR INIMIGOS A PARTIR DO CONTRUTOR.  PARÂMETROS: Name, Atk, Def, Agi, Cha, Con, Weapon, PV
		Character enemy1 = new Character("Margit, o Agouro Caído", 3, 3, 9, 3, 3, machado, 30);
		Character enemy2 = new Character("Rennala, Rainha da Lua Cheia", 4, 4, 10, 4, 4, lua, 40);
		Character enemy3 = new Character("Flagelo Estelar Radahn", 5, 5, 11, 5, 5, espadas, 50);
		
		// NARRAÇÕES, ENCONTROS E BATALHAS
		Narration.encounter1(hero, enemy1);
		Narration.encounter2(hero, enemy2);
		Narration.encounter3(hero, enemy3);
		
		}
	}
