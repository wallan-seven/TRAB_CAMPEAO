package CAMPEAO;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
	
	    
	    System.out.println("Informações sobre o Campeão 1:");
	    System.out.print("Nome: ");
	    String nome1 = scanner.nextLine();
	    System.out.print("Ataque: ");
	    int ataque1 = scanner.nextInt();
	    System.out.print("Armadura: ");
	    int armadura1 = scanner.nextInt();
	    System.out.print("Vida: ");
	    int vida1 = scanner.nextInt();
	    scanner.nextLine();
	
	    
	    Campeao campeao1 = new Campeao(nome1, ataque1, armadura1, vida1);
	
	    System.out.println("\nInformações sobre o Campeão 2:");
	    System.out.print("Nome: ");
	    String nome2 = scanner.nextLine();
	    System.out.print("Ataque: ");
	    int ataque2 = scanner.nextInt();
	    System.out.print("Armadura: ");
	    int armadura2 = scanner.nextInt();
	    System.out.print("Vida: ");
	    int vida2 = scanner.nextInt();
	
	    Campeao campeao2 = new Campeao(nome2, ataque2, armadura2, vida2);
	
	    System.out.print("\nInsira o número máximo de turnos: ");
	        int turnosMaximos = scanner.nextInt();
	
	        Fight luta = new Fight(campeao1, campeao2, turnosMaximos);
	        luta.iniciar();
	
	        scanner.close();
   
	}
}
