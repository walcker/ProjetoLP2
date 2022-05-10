package br.ufrn.imd;

public class Main {

    public static void main(String[] args) {

        TesouroSelic selic = new TesouroSelic();
        selic.valorInicial = 5000;
        selic.rentabilidadeLiquidaAno = 11.45;
        selic.valorMensal = 200;
        selic.qntMeses = 60;

        TesouroIPCA ipca = new TesouroIPCA();
        ipca.valorInicial = 5000;
        ipca.IPCA = 10.45;
        ipca.valorMensal = 200;
        ipca.qntMeses = 60;

        System.out.println("Resgate do investimento de R$ 5.000,00 no Tesouro Selic.");
        System.out.println(selic.calcular(selic.rentabilidadeLiquidaAno, selic.valorInicial));

        System.out.println("Resgate do investimento de R$ 5.000,00 no Tesouro IPCA.");
        System.out.println(ipca.calcular(ipca.IPCA, ipca.valorInicial));

    }
}
