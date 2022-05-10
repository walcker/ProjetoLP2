package br.ufrn.imd;

public class TesouroIPCA extends Investimento{

    public double IPCA;

    public double calcular(double IPCA, double valorInicial){

        return ((IPCA + 5.8)/100 * valorInicial) * (int) (qntMeses/12) + valorInicial;
    }

}
