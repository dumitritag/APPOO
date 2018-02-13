package com.company;

public class Lucrator extends Organizatie {
    private String NumeLucrator;
    private String FunctiaLucrator;
    private double SalariuBrut;
    private double Scutiri;

    public String getNumeLucrator() {
        return NumeLucrator;
    }

    public String getFunctiaLucrator() {
        return FunctiaLucrator;
    }


    public void setNumeLucrator(String numeLucrator) {
        NumeLucrator = numeLucrator;
    }

    public void setFunctiaLucrator(String functiaLucrator) {
        FunctiaLucrator = functiaLucrator;
    }

    public double getScutiri() {
        return Scutiri;
    }

    public double getSalariuBrut() {
        return SalariuBrut;
    }

    public void setScutiri(double scutiri) {
        Scutiri = scutiri;
    }

    public void setSalariuBrut(double salariuBrut) {
        SalariuBrut = salariuBrut;
    }

    public void SalariuNet(double SB){
        double SN;
        double Vi;
        double Iv;
        Vi = SB-648-486;
        Iv = 0.07*(31140/2)+0.18*(Vi-31140/2);
        SN = SB-(648+486+Iv);
        System.out.println("Salariul net:"+ SN);
    }
    public void SalariuNet(double SB, double S){
        double SN;
        double Vi;
        double Iv;
        Vi = SB-648-486-S;
        Iv = 0.07*(31140/2)+0.18*(Vi-31140/2);
        SN = SB-(648+486+Iv);
        System.out.println("Salariul net:"+ SN);
    }

}
