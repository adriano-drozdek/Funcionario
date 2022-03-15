package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.ImpleFuncionario;

public class Funcionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ImpleFuncionario> list = new ArrayList<>();

		System.out.println("Informe a quantidade de funcionários: ");
		int n = sc.nextInt();
		ImpleFuncionario[] vect = new ImpleFuncionario[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Funcionário # " + (i + 1) + ": ");

			System.out.print("id: ");
			Integer id = sc.nextInt();

			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Salário: ");
			Double salario = sc.nextDouble();

			ImpleFuncionario imp = new ImpleFuncionario(id, nome, salario);

			list.add(imp);

		}

		System.out.println("Entre com o id do funcionário que ganhará aumento! ");
		int idsalario = sc.nextInt();
		Integer pos = posicao(list, idsalario);
		if (pos == null) {
			System.out.println("id não existe! ");
		} 
		else {
			System.out.println("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).setSalario(percent);
		}
		
		sc.close();
	}

	public static Integer posicao(List<ImpleFuncionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
