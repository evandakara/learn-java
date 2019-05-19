package com.in28minutes.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuestionRunner {

    public static void main(String[] args) {

        //PRAY TO GOD

        System.out.println("اَللهُمَّ صَلِّ وَسَلِّمْ عَلَى سَيِّدِنَا مُحَمَّدٍ وَعَلى آلِ سَيِّدِنَا مُحَمَّدٍ. صَلاَةً تُنْجِيْنَابِهَا مِنْ جَمِيْعِ اْلاَهْوَالِ وَاْلآفَاتِ. وَتَقْضِىْ لَنَابِهَا جَمِيْعَ الْحَاجَاتِ.وَتُطَهِّرُنَا بِهَا مِنْ جَمِيْعِ السَّيِّئَاتِ. وَتَرْفَعُنَابِهَا عِنْدَكَ اَعْلَى الدَّرَجَاتِ. وَتُبَلِّغُنَا بِهَا اَقْصَى الْغَيَاتِ مِنْ جَمِيْعِ الْخَيْرَاتِ فِى الْحَيَاةِ وَبَعْدَ الْمَمَاتِ اِنَّهُ سَمِيْعٌ قَرِيْبٌ مُجِيْبُ الدَّعَوَاتِ وَيَاقَاضِىَ الْحَاجَاتِ.");

        // MAKE TRAINS

        List<String> train1 = new ArrayList<>();

        List<String> train2 = new ArrayList<>();

        //PASSENGERS ARRAY

        String[] passengers = {"Andi", "Budi", "Jack", "Mike", "Vins", "Lisa", "Rezky", "Garry", "Superman", "Evan", "Gio"};

        //PASSENGER LOOP

        for (String passenger : passengers) {
            if (train1.size() < 5) {
                train1.add(passenger);
            } else if (train2.size() < 5) {
                train2.add(passenger);
            }
        }

        //PRINT

        System.out.println("train 1 = " + train1);
        System.out.println("train 2 = " + train2);

        System.out.println("اَللّهُمَّ لَكَ صُمْتُ وَبِكَ آمَنْتُ وَعَلَى رِزْقِكَ أَفْطَرْتُ بِرَحْمَتِكَ يَا اَرْحَمَ الرَّحِمِ");
    }

}