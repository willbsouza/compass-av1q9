import java.util.Scanner;

public class BonusOuDesconto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Double BonusOuOnus;
		System.out.println("Quantos funcionários serão cadastrados?");
		Funcionario[] funcionarios = new Funcionario[scan.nextInt()];
		scan.nextLine();
		
		for(int i = 0; i < funcionarios.length; i++) {
			funcionarios[i] = new Funcionario();
			System.out.println("Digite o nome do funcionário de N°" + (i+1));
			funcionarios[i].setNome(scan.nextLine());
			System.out.println("Digite o salário do funcionário de N°"+ (i+1));
			funcionarios[i].setSalario(scan.nextDouble());
			scan.nextLine();
		}
		
		for(Funcionario funcionario : funcionarios) {
			System.out.println("Funcionário " + funcionario.getNome());
			System.out.printf("Salário: %.2f%n", funcionario.getSalario());
			if(funcionario.getSalario() <= 1000) {
				BonusOuOnus = funcionario.getSalario()*0.2;
				System.out.printf("Bônus: %.2f%n", BonusOuOnus);
				System.out.printf("Salário Líquido: %.2f%n%n", funcionario.getSalario() + BonusOuOnus);
			}else if(funcionario.getSalario() <= 2000) {
				BonusOuOnus = funcionario.getSalario()*0.1;
				System.out.printf("Bônus: %.2f%n", BonusOuOnus);
				System.out.printf("Salário Líquido: %.2f%n%n", funcionario.getSalario() + BonusOuOnus);
			}else {
				BonusOuOnus = funcionario.getSalario()*0.1;
				System.out.printf("Desconto: %.2f%n", BonusOuOnus);
				System.out.printf("Salário Líquido: %.2f%n%n", funcionario.getSalario() - BonusOuOnus);
			}
		}
	}
}
