package ui;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaPagamento {
	public static void main(String args[]) {
		
		try {
			ArrayList<Funcionario> lista;
			
			lista = new ArrayList<Funcionario>();
			
			lista.add(new Chefe("Mario", 0, 5000, 10, 800));
			lista.add(new Comissionado("Luigi", 2, 3000, 12));
			lista.add(new Horista("Peach", 3, 15, 220));
			lista.add(new Empreiteiro("Yoshi", 4, 4000));
			
			for (Funcionario f : lista) {
				System.out.println("*******FOLHA DE PAGAMENTO*******\nFuncionario: "+f.getNome()+"\nRegistro: "+f.getNumeroRegistro()+"\nSalário R$ "+f.calcularSalario()+"\n********************************\n\n");
			}
		}
		catch (RuntimeException e) {
			System.out.println("MOTIVO: "+e.getMessage());
		}
	}

}
