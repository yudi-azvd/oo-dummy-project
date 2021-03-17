package cadastros;

import javax.swing.JOptionPane;

public class CadastroPessoaFisica {
  private PessoaFisica[] pfs;

  public CadastroPessoaFisica() {
    pfs = new PessoaFisica[0];
  }

  public PessoaFisica cadastrarPessoaFisica() {
    String nome = JOptionPane.showInputDialog("Informa o nome da pessoa física: ");
    String cpf = JOptionPane.showInputDialog("Informa o CPF da pessoa física: ");

    PessoaFisica novaPessoa = new PessoaFisica(nome, cpf);

    PessoaFisica[] tmp = new PessoaFisica[pfs.length+1];
    for (int i = 0; i < pfs.length; i++) {
      tmp[i] = pfs[i];
    }

    tmp[tmp.length-1] = novaPessoa;
    pfs = tmp;

    return novaPessoa;
  }
}
