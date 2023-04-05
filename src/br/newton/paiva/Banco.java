package br.newton.paiva;

import java.util.*;

public class Banco {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(100.0);
        cliente1.nome = "Jose Toalha";
        c1.numero = 123;
        c1.setCliente(cliente1);

        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(200.0);

        List contas = new ArrayList();

        contas.add(c1);
        contas.add(c2);

        for(int i = 0; i < contas.size(); i++){
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println("A conta " + cc.numero + " do cliente " +
                    cc.getCliente().nome + "possui saldo: " +
                    cc.getSaldo());
        }
    }
}