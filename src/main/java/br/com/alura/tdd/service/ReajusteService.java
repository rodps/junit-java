package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        var reajusteMultiplicador = desempenho.percentualReajuste();
        var reajuste = funcionario.getSalario().multiply(reajusteMultiplicador);
        funcionario.reajustarSalario(reajuste);
    }
}
