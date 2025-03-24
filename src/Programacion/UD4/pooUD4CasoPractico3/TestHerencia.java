package Programacion.UD4.pooUD4CasoPractico3;

public class TestHerencia {
    public static void main(String[] args) {
        ProductoCongelado pc = new ProductoCongelado("01/01/2022", 1);
        pc.setTemperaturaRecomendada("-18ºC");
        System.out.println(pc);
        ProductoRefrigerado pr = new ProductoRefrigerado("01/01/2022", 1);
        pr.setCodigoOrganismoSupervision("ES 40.12345/AB");
        System.out.println(pr);
        ProductoFresco pf = new ProductoFresco("01/01/2022", 1);
        pf.setFechaEnvasado("01/01/2021");
        pf.setPaisOrigen("España");
        System.out.println(pf);
    }
}
