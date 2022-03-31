package Main;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
       Veiculo car;
       Scanner sc = new Scanner(System.in);		
	Veiculo car = new Veiculo();
	int optionMenu;
		do{
			System.out.println("===||Menu||===");
			System.out.println("1 - Cadastrar novo veiculo");
			System.out.println("2 - Alterar veiculo");
			System.out.println("3 - Excluir veiculo");
			System.out.println("4 - Listar veiculos");
			System.out.println("5 - Sair do programa");
			optionMenu = sc.nextInt();
			
			switch(optionMenu){
			
				case 1:
					System.out.println("Cadastre um novo veiculo");
					
					break;
				case 2:
					System.out.println("Altere um veiculo");
					
					break;
				case 3:
					System.out.println("Exclua um veiculo");
					
					break;
				case 4:
					System.out.println("Listagem de veiculos");
					
					break;
				case 5: 
					System.out.println("Saindo do programa...");
					
					break;
					
					
					
					
			}
			
		}while(optionMenu!=5);
       		
	}

}
