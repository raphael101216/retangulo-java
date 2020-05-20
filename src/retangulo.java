import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		  double larguraRetangulo, alturaRetanguo, area, perimetro;
		  
		  //Leitura da largura com validacao"
		  
		  System.out.print("Digite a largura do retangulo: ");
		  larguraRetangulo = sc.nextDouble();
		  
		   while(larguraRetangulo <= 0) {
			   
			   System.out.print("O valor deve ser positivo. Tente novamente: ");
			   larguraRetangulo = sc.nextDouble();
		   }
		   
		   

	}

}
