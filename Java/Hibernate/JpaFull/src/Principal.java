import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		listarUm();

	}

	public static void inserir() {
		Contato contato = new Contato();
		contato.setNome("Jose");
		contato.setEmail("jose@gmail.com");
		contato.setCelular("(47)999-7070");

		new DaoContato().salvar(contato);
	}

	static void listarUm() {
		String id = JOptionPane.showInputDialog("Digite o ID que quer pesquisar: ");
		Long idN = Long.parseLong(id);
		Contato contato = new DaoContato().pegarUm(idN);
		JOptionPane.showMessageDialog(null, contato.getNome());
	}
	
	static void update() {
		String id = JOptionPane.showInputDialog("Digite o ID que quer alterar: ");
		Long idN = Long.parseLong(id);
		Contato contato = new DaoContato().pegarUm(idN);
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		contato.setNome(nome);
		if(new DaoContato().update(contato)) {
			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
		};
	}
}