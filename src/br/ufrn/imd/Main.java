package br.ufrn.imd;

public class Main {

    public static void main(String[] args) {

        TesouroSelic selic = new TesouroSelic();
        selic.valorInicial = 5000;
        selic.rentabilidadeLiquidaAno = 2.45;
        selic.valorMensal = 200;
        selic.qntMeses = 60;

        System.out.println(selic.calcular(selic.rentabilidadeLiquidaAno, selic.valorInicial));

    }
}
