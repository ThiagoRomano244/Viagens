import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Turista mochileiro = new Turista("Maia")
                ;

        mochileiro.setNome("Thiago");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista();
        mochileira.setNome("Romano");

        String nome = JOptionPane.showInputDialog("Entre com seu nome:");
        mochileira.setNome(nome);


        String cpf = JOptionPane.showInputDialog("Entre com seu cpf:");
        mochileira.setCpf(cpf);


        Turista outroTurista = new Turista(nome);
        System.out.println("O nome dessa turista é: " + outroTurista.getNome());
        // Fazer o recebimento do cpf para este turista
        if(Validacao.cpf(cpf))
           outroTurista.setCpf(cpf);

        else
            System.out.println("CPF inválido!");
        System.out.println("O cpf do objeto é :"+cpf);

    }
}