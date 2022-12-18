package app2;

public class Garrafas {
	public static void main(String [] args) {
		/*int quantidCervejas = 99;
		String bebida = "Garrafas";
		System.out.println("Antes do Loop");*/
		
		/*while(quantidCervejas > 0) {
			 
			if(quantidCervejas == 1 ) {
				bebida = "Garrafa"; //Virou no singular
		}
		/*System.out.println("No Loop");
		System.out.println(quantidCervejas + " " + bebida + " de cerveja na parede");
		System.out.println(quantidCervejas + " " + bebida + " de cerveja");
		System.out.println("Derrubo uma ");
		System.out.println("Passo");
		quantidCervejas = quantidCervejas - 1;*/
		
		/*if (quantidCervejas > 0 ) {
			System.out.println(quantidCervejas + " " + bebida + " de cerveja na parede");
		}else { 
			System.out.println("Não a há mais garrafas");
		}*/
		
		String nome = "garrafas";
          
		for(int x = 99; x >= 1; x--) {
			
			if(x == 1 ) {
				nome = "garrafa";
			}
			System.out.println(x + " " +nome + " de cerveja" );
		}
		   System.out.println("Não há mais garrafas");
		}
	}


