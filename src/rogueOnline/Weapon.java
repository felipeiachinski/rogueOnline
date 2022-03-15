package rogueOnline;

public class Weapon {
	
	// DECLARA��O DE ATRIBUTOS DAS ARMAS
	private String weaponName;
	private int weaponAtk;
	
	// GETTERS (RETORNADORES - ENCAPSULAMENTO PRIVADO)
	public String getName() {
		return weaponName;
	}
	
	public int getAtk() {
		return weaponAtk;
	}
	
	// M�TODO CONSTRUTOR PARA ARMA
	public Weapon(String weaponName, int weaponAtk) {
		this.weaponName = weaponName;
		this.weaponAtk = weaponAtk;
	}
}
