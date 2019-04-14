package com.in28minutes.ifstatement.examples;

public class IfStatementRunner {


    public static void main(String[] args) {
        alhamdulillah( "kiamat",  false  );
    }

    public static void alhamdulillah(String haRri, boolean isBirthdyk) {
        if (isBirthdyk == true) {
            System.out.println("gratis " + "p " + "i " + "z " + "z " + "a ");
        }
        if (haRri.equals("minggu")){
            System.out.println("gratis ES PRIEM");
        } else if (haRri.equals("senin")|| haRri.equals("jum'at")){
            System.out.println("DAPET ayam");
        } else {
            if (isBirthdyk == false){
                System.out.println("KASIAN CUIPU DI BULLY HAHAHHAHAHAHHAHAHWHSDVHDSHDKSFESDFGURF FFRRRFGRRB, ,D , KNM  "                                                                                                                                                    );
            }
        }

    }

    private static void puzzle1() {
        int k = 15;
        if (k > 20) {
            System.out.println(1);
        } else if (k > 10) {
            System.out.println(2);
        } else if (k < 20) {//
            System.out.println(3);
        } else {
            System.out.println(4);
        }

    }

    private static void puzzle2() {
        int l = 15;

        if (l < 20)
            System.out.println("l<20");//
        if (l > 20)
            System.out.println("l>20");
        else
            System.out.println("Who am I?");//
    }


    private static void puzzle3() {
        int m = 15;

        if (m > 20)
            if (m < 20)
                System.out.println("m>20");
            else
                System.out.println("Who am I?");
    }


    private static void puzzle5() {
        int number = 0;
        if (number <= 0) {
            number = number + 10;
        }
        number++;
        System.out.println(number);
    }

    private static void basicNestedIfElse() {
        int i = 24;
        // i is 25
        // i is 24
        // i is neither 25 or 24
        if (i == 25) {
            System.out.println("i = 25");
        } else if (i == 24) {
            System.out.println("i = 24");
        } else if (i == 23) {
            System.out.println("i = 23");
        } else {
            System.out.println("i != 24 and i !=25 and i !=23");
        }
    }

    public static void puzel() {
        String iRGFUHSRIU = "ojiosrjhguuuuuuuuuPUSOSOJDIOSLFJROICNuuuuuuuuuuuuoirjgporojpogiooghikdhgoirrrrrrrrrrrrr";
        //HRGFUHSRIU i not u
        //HRGFUHSRIU BONOT NO!!!!!!!!!!!!!!!!
        //HRGFUHSRIU AMIN
        if (iRGFUHSRIU.contains("U")) {
            System.out.println("NO!!!");
        } else {
            System.out.println("NO  !! !! !  !");
        }
    }


    public static void string(int integer) {
        if (integer >= 8999) {
            System.out.println("CETRAK GRAD A CETAK GRAD BE");
        } else if (integer >= 6000 && integer <= 8009) {
            System.out.println(" amin");
        } else {
            System.out.println("hfh " + 999999999 * 999999999);
        }


    }


}
