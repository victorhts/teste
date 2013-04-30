import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaPalavras {
	private ArrayList<String> Palavra = new ArrayList<String>();	
	private ArrayList<String> Significado = new ArrayList<String>();

	public void AdcionarPalavra(String NovaPalavra,String NovoSignificado){
	Palavra.add(NovaPalavra);
	Significado.add(NovoSignificado);
	}
	
	public boolean PesquisaPalavra(String palavra){
		int j ;
		int n = Palavra.size();
		boolean existe=false;
			for(j=0;j<n;j++){
				if((palavra.toLowerCase()).equals((Palavra.get(j)).toLowerCase())){
					JOptionPane.showMessageDialog(null,"O significado de "+ palavra +" é "+ Significado.get(j));
					existe = true;
				  	}
			}
		return existe;	
	}
}
