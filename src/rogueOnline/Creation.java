package rogueOnline;

import java.util.Scanner;

public class Creation {
	
	private static String chosenName;
	private static int chosenAtk = 0;
	private static int chosenDef = 0;
	private static int chosenAgi = 0;
	private static int chosenCha = 0;
	private static int chosenCon = 0;
	private static Weapon chosenWeapon;
	private static String chosenClass;
	
	private static Weapon espada = new Weapon("Espada Longa", 5);
	private static Weapon arco = new Weapon("Arco e Flecha", 5);
	private static Weapon fogo = new Weapon("Bola de Fogo", 5);
	
	// CRIAR PERSONAGEM: DEFINIR NOME, ATRIBUTOS E ARMA
	public static Character create() {
		
		System.out.println("\nBEM VINDO � ARENA!\n\n\n\n");
	
		Scanner scan =  new Scanner(System.in);	
		
		// ESCREVER NOME DO HER�I
		int option = 0;
		while (option != 2) {
	
			System.out.println("Para come�ar, digite o nome do seu her�i:\n");
			chosenName = scan.nextLine();
			System.out.println();
			
			// MENU DE CONFIRMA��O
			System.out.println("Nome escolhido: " + chosenName + ".\n");
			System.out.println("(1) Digitar nome novamente.");
			System.out.println("(2) Confirmar e prosseguir.\n");
			option = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			}
	
		// DISTRIBUIR PONTOS DE ATRIBUTO DO HER�I
		System.out.println(chosenName + ", agora � a hora de distribuir seus pontos de atributos!");
		System.out.println("CINQUENTA pontos estar�o dispon�veis para distribui��o.");
		System.out.println("N�o se preocupe, se mudar de ideia com os valores, poder� refazer.");
		System.out.println("Dica: Os atributos podem ser �teis fora de batalha tamb�m...");
		System.out.println("\nS�o CINCO atributos:");
		System.out.println("ATAQUE, DEFESA, AGILIDADE, CARISMA e CONSTITUI��O.");
	
		option = 0;
		while (option != 2) {
		
			int points = 50;
		
			// REGRAS
			System.out.println("\nREGRAS:");
			System.out.println("\n- Todos os atributos devem possuir ao menos um ponto.");
			System.out.println("- O limite de " + points + " pontos para distribui��o n�o pode ser passado.");
			System.out.println("- Todos os pontos devem ser distribu�dos.");
			System.out.println("\nPressione ENTER para continuar...");
			scan.nextLine();
		
			// INSERIR PONTOS DE ATAQUE
			System.out.println("\n\n\nPRIMEIRO - O ATAQUE do her�i � sua for�a, um dos fatores que somam no seu dano ao atacar em batalha.");
			System.out.println("Digite quantos pontos quer inserir no ATAQUE (Atk) do her�i (" + points + " pontos dispon�veis):\n");
			chosenAtk = Integer.parseInt(scan.nextLine());
			points -= chosenAtk;
			if (points < 0 || chosenAtk == 0) {
				System.err.println("\nAtente-se �s regras de distribui��o. Por favor, distribua novamente.");
				continue;
				} 
		
			// INSERIR PONTOS DE DEFESA
			System.out.println("\nSEGUNDO - A DEFESA do her�i � sua resist�ncia, define o quanto de dano ser� anulado ao defender-se em batalha.");
			System.out.println("Digite quantos pontos quer inserir na DEFESA (Def) do her�i (" + points + " pontos dispon�veis):\n");
			chosenDef = Integer.parseInt(scan.nextLine());
			points -= chosenDef;
			if (points < 0 || chosenDef == 0) {
				System.err.println("\nAtente-se �s regras de distribui��o. Por favor, distribua novamente.");
				continue;
				}
		
			// INSERIR PONTOS DE AGILIDADE
			System.out.println("\nTERCEIRO - A AGILIDADE do her�i � sua velocidade, se possui mais que o advers�rio, atacar� antes em batalha.");
			System.out.println("Digite quantos pontos quer inserir na AGILIDADE (Agi) do her�i (" + points + " pontos dispon�veis):\n");
			chosenAgi = Integer.parseInt(scan.nextLine());
			points -= chosenAgi;
			if (points < 0 || chosenAgi == 0) {
				System.err.println("\nAtente-se �s regras de distribui��o. Por favor, distribua novamente.");
				continue;
				}
		
			// INSERIR PONTOS DE CARISMA
			System.out.println("\nQUARTO - A CARISMA do her�i � sua capacidade de persuas�o, pode ser importante em certas intera��es...");
			System.out.println("Digite quantos pontos quer inserir no CARISMA (Cha) do her�i (" + points + " pontos dispon�veis):\n");
			chosenCha = Integer.parseInt(scan.nextLine());
			points -= chosenCha;
			if (points < 0 || chosenCha == 0) {
				System.err.println("\nAtente-se �s regras de distribui��o. Por favor, distribua novamente.");
				continue;
				}
		
			// INSERIR PONTOS DE CONSTITUI��O
			System.out.println("\n�LTIMO - A CONSTITUI��O do her�i � sua capacidade de regenera��o, tamb�m soma com a vida base (50) para definir o PV (Pontos de Vida) de seu her�i.");
			System.out.println("Digite quantos pontos quer inserir na CONSTITUI��O (Con) do her�i (" + points + " pontos dispon�veis):\n");
			chosenCon = Integer.parseInt(scan.nextLine());
			points -= chosenCon;
			if (points != 0 || chosenCon == 0) {
				System.err.println("\nAtente-se �s regras de distribui��o. Por favor, distribua novamente.");
				continue;
				}
			
			// MENU DE CONFIRMA��O
			System.out.println();
			System.out.println("\n\n\nPontos de atributos distribu�dos!");
			System.out.printf("%nAtk %d  Def %d  Agi %d  Cha %d  Con %d%n%n", chosenAtk, chosenDef, chosenAgi, chosenCha, chosenCon);
			System.out.println("(1) Refazer a distribui��o.");
			System.out.println("(2) Confirmar e prosseguir.\n");
			option = Integer.parseInt(scan.nextLine());
			System.out.println();
			}
		
		// ESCOLHA DE CLASSE DO H�ROI
		System.out.println(chosenName + ", agora � a hora de escolher sua classe!");
		System.out.println("\nS�o TR�S classes escolh�veis:");
		System.out.println("GUERREIRO, CA�ADOR ou MAGO.");
		System.out.println("\nPressione ENTER para continuar...");
		scan.nextLine();
		
		option = 0;
		while (option != 2) {
			
			int classOption = 0;
			
			System.out.println("\n\n\nO Guerreiro usa Espada Longa para atacar.");
			System.out.println("O Ca�ador usa Arco e Flecha para atacar.");
			System.out.println("O Mago usa Bola de Fogo para atacar.");
			System.out.println("\nQual classe voc� deseja escolher?\n");
			System.out.println("(1) Guerreiro.");
			System.out.println("(2) Ca�ador.");
			System.out.println("(3) Mago.\n");
			classOption = Integer.parseInt(scan.nextLine());
			switch (classOption) {
			case 1:
				chosenClass = "Guerreiro";
				chosenWeapon = espada;
				break;
			case 2:
				chosenClass = "Ca�ador";
				chosenWeapon = arco;
				break;
			case 3:
				chosenClass = "Mago";
				chosenWeapon = fogo;
				break;
			default:
				System.err.println("\nOp��o inv�lida. Por favor, digite novamente.");
				continue;
			}
			System.out.println("\nClasse escolhida: " + chosenClass + ". Arma: " + chosenWeapon.getName() + ".\n");
			System.out.println("(1) Escolher classe novamente.");
			System.out.println("(2) Confirmar e prosseguir.\n");
			option = Integer.parseInt(scan.nextLine());
			System.out.println();
			
		}
		
		Character hero = new Character(chosenName, chosenAtk, chosenDef, chosenAgi, chosenCha, chosenCon, chosenWeapon);
		
		System.out.println("\n");
		Character.present(hero);
		System.out.println("\nPersonagem criado com sucesso! A aventura come�a...");
		System.out.println("(Pressione ENTER para continuar os di�logos/narra��es...)");
		scan.nextLine();
		return hero;
		}
	}
