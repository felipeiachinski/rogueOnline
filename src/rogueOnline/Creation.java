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
		
		System.out.println("\nBEM VINDO À ARENA!\n\n\n\n");
	
		Scanner scan =  new Scanner(System.in);	
		
		// ESCREVER NOME DO HERÓI
		int option = 0;
		while (option != 2) {
	
			System.out.println("Para começar, digite o nome do seu herói:\n");
			chosenName = scan.nextLine();
			System.out.println();
			
			// MENU DE CONFIRMAÇÃO
			System.out.println("Nome escolhido: " + chosenName + ".\n");
			System.out.println("(1) Digitar nome novamente.");
			System.out.println("(2) Confirmar e prosseguir.\n");
			option = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			}
	
		// DISTRIBUIR PONTOS DE ATRIBUTO DO HERÓI
		System.out.println(chosenName + ", agora é a hora de distribuir seus pontos de atributos!");
		System.out.println("CINQUENTA pontos estarão disponíveis para distribuição.");
		System.out.println("Não se preocupe, se mudar de ideia com os valores, poderá refazer.");
		System.out.println("Dica: Os atributos podem ser úteis fora de batalha também...");
		System.out.println("\nSão CINCO atributos:");
		System.out.println("ATAQUE, DEFESA, AGILIDADE, CARISMA e CONSTITUIÇÃO.");
	
		option = 0;
		while (option != 2) {
		
			int points = 50;
		
			// REGRAS
			System.out.println("\nREGRAS:");
			System.out.println("\n- Todos os atributos devem possuir ao menos um ponto.");
			System.out.println("- O limite de " + points + " pontos para distribuição não pode ser passado.");
			System.out.println("- Todos os pontos devem ser distribuídos.");
			System.out.println("\nPressione ENTER para continuar...");
			scan.nextLine();
		
			// INSERIR PONTOS DE ATAQUE
			System.out.println("\n\n\nPRIMEIRO - O ATAQUE do herói é sua força, um dos fatores que somam no seu dano ao atacar em batalha.");
			System.out.println("Digite quantos pontos quer inserir no ATAQUE (Atk) do herói (" + points + " pontos disponíveis):\n");
			chosenAtk = Integer.parseInt(scan.nextLine());
			points -= chosenAtk;
			if (points < 0 || chosenAtk == 0) {
				System.err.println("\nAtente-se às regras de distribuição. Por favor, distribua novamente.");
				continue;
				} 
		
			// INSERIR PONTOS DE DEFESA
			System.out.println("\nSEGUNDO - A DEFESA do herói é sua resistência, define o quanto de dano será anulado ao defender-se em batalha.");
			System.out.println("Digite quantos pontos quer inserir na DEFESA (Def) do herói (" + points + " pontos disponíveis):\n");
			chosenDef = Integer.parseInt(scan.nextLine());
			points -= chosenDef;
			if (points < 0 || chosenDef == 0) {
				System.err.println("\nAtente-se às regras de distribuição. Por favor, distribua novamente.");
				continue;
				}
		
			// INSERIR PONTOS DE AGILIDADE
			System.out.println("\nTERCEIRO - A AGILIDADE do herói é sua velocidade, se possui mais que o adversário, atacará antes em batalha.");
			System.out.println("Digite quantos pontos quer inserir na AGILIDADE (Agi) do herói (" + points + " pontos disponíveis):\n");
			chosenAgi = Integer.parseInt(scan.nextLine());
			points -= chosenAgi;
			if (points < 0 || chosenAgi == 0) {
				System.err.println("\nAtente-se às regras de distribuição. Por favor, distribua novamente.");
				continue;
				}
		
			// INSERIR PONTOS DE CARISMA
			System.out.println("\nQUARTO - A CARISMA do herói é sua capacidade de persuasão, pode ser importante em certas interações...");
			System.out.println("Digite quantos pontos quer inserir no CARISMA (Cha) do herói (" + points + " pontos disponíveis):\n");
			chosenCha = Integer.parseInt(scan.nextLine());
			points -= chosenCha;
			if (points < 0 || chosenCha == 0) {
				System.err.println("\nAtente-se às regras de distribuição. Por favor, distribua novamente.");
				continue;
				}
		
			// INSERIR PONTOS DE CONSTITUIÇÃO
			System.out.println("\nÚLTIMO - A CONSTITUIÇÃO do herói é sua capacidade de regeneração, também soma com a vida base (50) para definir o PV (Pontos de Vida) de seu herói.");
			System.out.println("Digite quantos pontos quer inserir na CONSTITUIÇÃO (Con) do herói (" + points + " pontos disponíveis):\n");
			chosenCon = Integer.parseInt(scan.nextLine());
			points -= chosenCon;
			if (points != 0 || chosenCon == 0) {
				System.err.println("\nAtente-se às regras de distribuição. Por favor, distribua novamente.");
				continue;
				}
			
			// MENU DE CONFIRMAÇÃO
			System.out.println();
			System.out.println("\n\n\nPontos de atributos distribuídos!");
			System.out.printf("%nAtk %d  Def %d  Agi %d  Cha %d  Con %d%n%n", chosenAtk, chosenDef, chosenAgi, chosenCha, chosenCon);
			System.out.println("(1) Refazer a distribuição.");
			System.out.println("(2) Confirmar e prosseguir.\n");
			option = Integer.parseInt(scan.nextLine());
			System.out.println();
			}
		
		// ESCOLHA DE CLASSE DO HÉROI
		System.out.println(chosenName + ", agora é a hora de escolher sua classe!");
		System.out.println("\nSão TRÊS classes escolhíveis:");
		System.out.println("GUERREIRO, CAÇADOR ou MAGO.");
		System.out.println("\nPressione ENTER para continuar...");
		scan.nextLine();
		
		option = 0;
		while (option != 2) {
			
			int classOption = 0;
			
			System.out.println("\n\n\nO Guerreiro usa Espada Longa para atacar.");
			System.out.println("O Caçador usa Arco e Flecha para atacar.");
			System.out.println("O Mago usa Bola de Fogo para atacar.");
			System.out.println("\nQual classe você deseja escolher?\n");
			System.out.println("(1) Guerreiro.");
			System.out.println("(2) Caçador.");
			System.out.println("(3) Mago.\n");
			classOption = Integer.parseInt(scan.nextLine());
			switch (classOption) {
			case 1:
				chosenClass = "Guerreiro";
				chosenWeapon = espada;
				break;
			case 2:
				chosenClass = "Caçador";
				chosenWeapon = arco;
				break;
			case 3:
				chosenClass = "Mago";
				chosenWeapon = fogo;
				break;
			default:
				System.err.println("\nOpção inválida. Por favor, digite novamente.");
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
		System.out.println("\nPersonagem criado com sucesso! A aventura começa...");
		System.out.println("(Pressione ENTER para continuar os diálogos/narrações...)");
		scan.nextLine();
		return hero;
		}
	}
