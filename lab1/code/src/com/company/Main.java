package com.company;

public class Main {

    public static void main(String[] args) {
	Lucrator l1 = new Lucrator();
	Lucrator l2 = new Lucrator();
	ProfitLunar p1 = new ProfitLunar();
	ProfitPrimaLuna p2 = new ProfitPrimaLuna();
	System.out.println("****************************************************************** \n");
	System.out.println("Detaliile despre organizatie: \n");
l1.NumeOrganizatie="Senaco Sistem";
l1.Fondator=" Parfentieva Oxana";
l1.AnulFondarii=2010;
System.out.println("Nume organizatie:" + l1.NumeOrganizatie + "\n" + "Fondator:" + l1.Fondator + "\n" + "Anul fondarii:" + l1.AnulFondarii + "\n");
   System.out.println("******************************************************************* \n");
   System.out.println("Lucratorii organizatiei: \n");
   l1.setNumeLucrator("Bou Corina");
   System.out.println("Nume si prenume:" + l1.getNumeLucrator());
   l1.setFunctiaLucrator("Manager");
   System.out.println("Functia:" + l1.getFunctiaLucrator());
   l1.setSalariuBrut(10800);
   l1.setScutiri(2155);
   l1.SalariuNet(l1.getSalariuBrut(), l1.getScutiri());
        l2.setNumeLucrator("Albu Ina");
        System.out.println("Nume si prenume:" + l2.getNumeLucrator());
        l2.setFunctiaLucrator("Contabil");
        System.out.println("Functia:" + l2.getFunctiaLucrator());
        l2.setSalariuBrut(10800);
        l2.SalariuNet(l2.getSalariuBrut());
System.out.println("\n");
System.out.println("***************************************************************** \n");
System.out.println("Profitul organizatiei: \n");
p1.VenitLunar=200000;
p1.CheltuieliLunare=50000;
p1.profit();
p2.VenitLunar=200000;
p2.CheltuieliLunare=50000;
p2.CheltuieliInregistrare=500;
p2.profit();
    }

}
