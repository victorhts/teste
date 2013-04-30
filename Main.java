import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String args[]){
		ListaPalavras Dicionario = new ListaPalavras();
		String palavra;
		String significado;
		int opc,x=0;
		boolean existe=false;
		
		while(x!=9){
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha a Opção:\n 1-Pesquisar palavra \n 9-Sair "));
			switch (opc){
			case 1:
				palavra = JOptionPane.showInputDialog("Digite a palavra");
				existe = Dicionario.PesquisaPalavra(palavra);
				if(existe==false){
					significado = JOptionPane.showInputDialog("Palavra não encontrada! Digite o significado!"); 
					Dicionario.AdcionarPalavra(palavra, significado);
					JOptionPane.showMessageDialog(null, "Palavra Adicionada com Sucesso");
				}
				break;
				case 9:
				System.exit(0);
				x=opc;
				break;
				default : 
				JOptionPane.showMessageDialog(null,"Opção Invalida");
				break;
			}
		}
	}
}