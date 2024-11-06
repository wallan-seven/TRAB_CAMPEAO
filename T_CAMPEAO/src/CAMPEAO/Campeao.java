package CAMPEAO;

public class Campeao {
	String nome;
	int vida;
	int ataque;
	int armadura;
	
	public Campeao(String nome, int vida, int ataque, int armadura){
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.armadura = armadura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public int Armadura() {
		return armadura;
	}
	
	public void ataque(int ataque2) {
		int dano = ataque - this.armadura;
        if (dano < 1) {
            dano = 1;
        }
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
		
	}
    
    public boolean Vivo() {
        return this.vida > 0;
    }
    
    public String status() {
        if (this.vida > 0) {
            return this.nome + ": " + this.vida + " de vida";
        } else {
            return this.nome + ": morreu";
        }
    }
}
