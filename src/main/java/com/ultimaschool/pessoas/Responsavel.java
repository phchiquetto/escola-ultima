package com.ultimaschool.pessoas;

public class Responsavel extends Pessoa {
    private boolean[] pagamentos = new boolean[12];

    public Responsavel(String nome) {
        super(nome);
    }

    public boolean[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(boolean[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    public boolean pagarmensalidade(int mes, boolean situacao){
        return false;
    }

    @Override
    public String versituacao(int mes) {
        return null;
    }

    @Override
    public String relatorio() {
        return null;
    }
}
