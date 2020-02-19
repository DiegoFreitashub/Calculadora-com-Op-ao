
import java.util.Scanner;
  	class Main {
 
  		
  		
  		public static double soma(double N1,double N2) {
  			return N1+N2;
  		}
  		public static double subtracao(double N1, double N2) {
  			return N1-N2;	
  		}
  		public static double multiplicacao(double N1, double N2) {
  			return N1*N2;
  		}
  		public static double divisao(double N1, double N2) {
  			return N1/N2;
  		}
  		
  	
  		public static void main(String[]args) { 
  			
  			
  			Scanner sc = new Scanner(System.in);
  			
  			System.out.println("Informe a operacao: ");
  			int opcao = sc.nextInt();
			System.out.println("Informe o primeiro numero: ");		
			double N1 = sc.nextDouble();
			System.out.println("Informe o segundo numero: ");
			double N2 = sc.nextDouble();
			
			sc.close();
  		
			
		switch (opcao) {
		
		case 1: 
			double soma = soma(N1,N2);
			System.out.println("1: Soma");
			System.out.println(soma);
			break;
		
		case 2: 
			double subtracao = subtracao(N1,N2);
			System.out.println("2: Subtracao");
			System.out.println(subtracao);
			break;
		
		case 3: 
			double multiplicacao = multiplicacao(N1,N2);
			System.out.println("3: Multiplicacao");
			System.out.println(multiplicacao);
			break;
						
		case 4: 
			double divisao = divisao(N1,N2);
			System.out.println("4: Divisao");
			System.out.println(divisao);
			break;
			default: 
			System.out.println("Opcao invalida!");
			
		}		
  		  }
  	}