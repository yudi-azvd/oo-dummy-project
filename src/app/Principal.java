package app;

import javax.swing.JOptionPane;

import cadastros.CadastroPessoaFisica;

public class Principal {
  private static CadastroPessoaFisica cadPf;

  public static void main(String[] args) {
    cadPf = new CadastroPessoaFisica();

    menu();
  }

  public static void menu() {
    int opcao = 0;
    String dialogo = "Informe o que deseja fazer:\n"
      + "1) Cadastrar pessoa física\n"
      + "2) Pesquisar pessoa física\n"
      + "3) Editar pessoa física\n"
      + "0) Sair\n\n";

    do {
      String strOpcao =  JOptionPane.showInputDialog(dialogo);
      opcao = Integer.parseInt(strOpcao);

      switch (opcao) {
        case 1: {
          cadPf.cadastrarPessoaFisica();
          break;          
        }
        // case 2: {
        //   cadPf.cadastrarPessoaFisica();
        //   break;          
        // }
        // case 3: {
        //   cadPf.cadastrarPessoaFisica();
        //   break;          
        // }
        // ...
        default: {
          // JOptionPane.showMessageDialog("Opção indisponível.");
        }
      }
    } while (opcao != 0);


  }
}
