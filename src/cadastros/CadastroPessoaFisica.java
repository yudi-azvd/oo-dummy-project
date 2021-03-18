package cadastros;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CadastroPessoaFisica {
  private PessoaFisica[] pfs;
  private JFrame optionPane;


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


  public PessoaFisica pesquisarPessoaFisica() {
    String cpf = JOptionPane.showInputDialog("Informe o CPF da pessoa física: ");
    PessoaFisica pf = null;
    for (PessoaFisica pessoaFisica : pfs) {
      if (pessoaFisica.cpf.equals(cpf)) {
        pf = pessoaFisica;
        break;
      }
    }

    if (pf != null) {
      JOptionPane.showMessageDialog(optionPane, "Encontrado: " + pf.nome);
    }
    else {
      JOptionPane.showMessageDialog(optionPane, "Não Encontrado", "", JOptionPane.ERROR_MESSAGE);
    }

    return pf;
  }


  public boolean deletarPessoaFisica() {
    return true;
  }
}
