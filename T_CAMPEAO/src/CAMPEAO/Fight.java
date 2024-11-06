package CAMPEAO;

import java.util.Scanner;

public class Fight {
	Campeao campeao1;
    Campeao campeao2;
    int qntTurnos;
	
	
    public Fight(Campeao campeao1, Campeao campeao2, int qntTurnos) {
        this.campeao1 = campeao1;
        this.campeao2 = campeao2;
        this.qntTurnos = qntTurnos;
    }

  
    public void iniciar() {
        for (int turno = 1; turno <= qntTurnos; turno++) {
            System.out.println("Resultado do Turno " + turno + ":");
            
           
            campeao2.ataque(campeao1.getAtaque());
            System.out.println(campeao2.status());
            
            if (!campeao2.Vivo()) {
                System.out.println("FIM DO COMBATE");
                break;
            }
            
          
            campeao1.ataque(campeao2.getAtaque());
            System.out.println(campeao1.status());
            
            if (!campeao1.Vivo()) {
                System.out.println("FIM DO COMBATE");
                break;
            }
        }
        System.out.println("\nFIM DO COMBATE");
    }
}