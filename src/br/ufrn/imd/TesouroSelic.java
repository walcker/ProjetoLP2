package br.ufrn.imd;

public class TesouroSelic extends Investimento{

    public double rentabilidadeLiquidaAno;

    public double calcular(double rentabilidadeLiquidaAno, double valorInicial){

        return (rentabilidadeLiquidaAno/100 * valorInicial) * (int) (qntMeses/12) + valorInicial;
    }

}
