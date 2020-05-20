import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		double larguraRetangulo, alturaRetanguo, area, perimetro;
		int menu;

		// Leitura da largura com validacao"

		System.out.print("Digite a largura do retangulo: ");
		larguraRetangulo = sc.nextDouble();

		while (larguraRetangulo <= 0) {

			System.out.print("O valor deve ser positivo. Tente novamente: ");
			larguraRetangulo = sc.nextDouble();
		}

		// Leitura da altura com validacao

		System.out.print("Digite a altura do retangulo: ");
		alturaRetanguo = sc.nextDouble();

		while (alturaRetanguo <= 0) {

			System.out.print("O valor deve ser positivo. Tente novamente: ");
			alturaRetanguo = sc.nextDouble();
		}

		// Programa finalizado
      do {
    	  
     
		System.out.println();
		System.out.println("Menu:");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.print("Digite uma opcao: ");
		menu = sc.nextInt();
		System.out.println();
		
		while (menu > 3) {

			System.out.println("OPÇÃO INVALIDA");
			System.out.println();
			System.out.println("Menu:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opcao: ");
			menu = sc.nextInt();
			System.out.println();
		}
		
		
		   if(menu == 1) {
			   
			 area = larguraRetangulo * alturaRetanguo;
			 System.out.println("AREA = " +df.format(area));
			 
		   }else if(menu == 2) {
			  
			   perimetro = (2 * larguraRetangulo) + (2 * alturaRetanguo);
			   System.out.println("PERIMETRO = " +df.format(perimetro));
		   }else if(menu > 3) {
			   System.out.println("OPÇÃO INVALIDA");
		   }
		   
      }while(menu != 3);
      
        System.out.println("FIM DO PROGRAMA!");
        
        sc.close();

	}

}
