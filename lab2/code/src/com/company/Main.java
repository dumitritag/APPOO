package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double value=0.00;
        int amount=0;
        int converted;
        Person user;

        Person shopKeeper=new Person();
        shopKeeper.setName("Garaba Dumitrita");
        shopKeeper.setMoney(0);

        double userMoney=0;
        boolean light=false;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Cum vă numiți?");
        String userName=scanner.nextLine();

        while(light==false){
            try{

                System.out.println("Cîți bani doriți să cheltuiți? ");
                userMoney=Double.parseDouble(scanner.next());

            }

            catch(Exception e){

                System.out.println("Nu este o valută monetară!");

            }

            if(userMoney>0){

                light=true;

            }

        }

        user=new Person();
        user.setName(userName);
        user.setMoney(userMoney);


        Flowers roseStock=new Flowers(20, 45.00, "trandafiri");
        Flowers tulipsStock=new Flowers(20,20.00,"lalele");
        Flowers carnationsStock=new Flowers(20, 15.00,"garoafe");
        Flowers jasmineStock=new Flowers(20,25.00,"jasmin");
        Flowers peoniesStock=new Flowers(20,30.00,"bujori");

        String userInput;
        boolean flag=true;
        roseStock.view();
        System.out.println("Salut "+user.getName()+"! Bine ați venit la MintFlower! Cu ce vă pot ajuta?");

        do{
            System.out.println();
            System.out.print(shopKeeper.getName()+" are ");
            System.out.printf("%.2f",shopKeeper.getMoney());
            System.out.println("lei");
            System.out.print(user.getName()+" are ");
            System.out.printf("%.2f",user.getMoney());
            System.out.println("lei");
            System.out.println();
            System.out.println("1-Cumpăr");
            System.out.println("2-Ies");

            userInput=scanner.next();

            if(userInput.equals("1")){

                System.out.println("Ce doriți să cumpărați?");
                System.out.println("1-Trandafiri");
                System.out.println("2-Lalele");
                System.out.println("3-Garoafe");
                System.out.println("4-Jasmin");
                System.out.println("5-Bujori");
                System.out.println("6-Un buchet");

                userInput=scanner.next();

                converted=Integer.parseInt(userInput);

                if(converted>0&&converted<6){

                    System.out.println("Cîte doriți?");
                    amount=scanner.nextInt();

                }

                switch(userInput){

                    case "1":

                        value=roseStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);
                        user.transaction(-1*value);
                        shopKeeper.transaction(value);


                        break;

                    case "2":

                        value=tulipsStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                        user.transaction(-1*value);

                        shopKeeper.transaction(value);

                        break;

                    case "3":

                        value=carnationsStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                        user.transaction(-1*value);

                        shopKeeper.transaction(value);

                        break;

                    case "4":

                        value=jasmineStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                        user.transaction(-1*value);

                        shopKeeper.transaction(value);

                        break;

                    case "5":

                        value=peoniesStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                        user.transaction(-1*value);

                        shopKeeper.transaction(value);

                        break;

                    case "6":

                        int flowerCount=0;

                        double bouquetPrice=0;

                        do{

                            System.out.print("Vînzătorul, "+shopKeeper.getName()+" are");
                            System.out.printf("%.2f",shopKeeper.getMoney());
                            System.out.println("lei");
                            System.out.println();
                            System.out.print(user.getName()+" are");
                            System.out.printf("%.2f",user.getMoney());
                            System.out.println("lei");
                            System.out.println();
                            System.out.println("Sunt "+flowerCount+" flori în buchetul d-stra.");
                            System.out.println("Doriți să cumpărați?");
                            System.out.println("1-Trandafiri");
                            System.out.println("2-Lalele");
                            System.out.println("3-Garoafe");
                            System.out.println("4-Jasmin");
                            System.out.println("5-Bujori");
                            System.out.println("6-Finisarea buchetului");

                            userInput=scanner.next();

                            converted=Integer.parseInt(userInput);

                            if(converted>0&&converted<6){

                                System.out.println("Cît doriți?");

                                amount=scanner.nextInt();

                            }


                            if((flowerCount+amount)<=11){

                                switch(userInput){

                                    case "1":

                                        value=roseStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                                        if(value>0){

                                            user.transaction(-1*value);

                                            shopKeeper.transaction(value);

                                            bouquetPrice+=value;

                                            flowerCount+=amount;

                                        }

                                        break;

                                    case "2":

                                        value=tulipsStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                                        if(value>0){

                                            user.transaction(-1*value);

                                            shopKeeper.transaction(value);

                                            bouquetPrice+=value;

                                            flowerCount+=amount;

                                        }

                                        break;

                                    case "3":

                                        value=carnationsStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                                        if(value>0){

                                            user.transaction(-1*value);

                                            shopKeeper.transaction(value);

                                            bouquetPrice+=value;

                                            flowerCount+=amount;

                                        }

                                        break;

                                    case "4":

                                        value=jasmineStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                                        if(value>0){

                                            user.transaction(-1*value);

                                            shopKeeper.transaction(value);

                                            bouquetPrice+=value;

                                            flowerCount+=amount;

                                        }

                                        break;

                                    case "5":

                                        value=peoniesStock.accept(new FlowerProcessingVisitor(),amount,user.getMoney(),false);

                                        if(value>0){

                                            user.transaction(-1*value);

                                            shopKeeper.transaction(value);

                                            bouquetPrice+=value;

                                            flowerCount+=amount;

                                        }

                                        break;

                                    case "6":

                                        flowerCount=11;

                                        break;

                                    default:

                                        System.out.println("Nu este o opțiune validă!");

                                        break;

                                }}

                            else{

                                System.out.println("Poți să ai doar 11 flori în buchet!");

                            }

                        }while(flowerCount!=11);

                        if(bouquetPrice>0){
                            System.out.print("Ați cumpărat un buchet de ");
                            System.out.printf("%.2f",bouquetPrice);
                            System.out.println("lei");
                            System.out.println();

                        }

                        break;

                    default:

                        System.out.println("Nu este o opțiune validă!");

                        break;

                }

            }


            else if(userInput.equals("2")){

                flag=false;

                System.out.println("Vă mulțumesc, vă mai aștemptăm!");

                System.exit(1);

            }

            else{

                System.out.println("Nu este o opțiune validă!");

            }

        }while(flag);

    }
}

