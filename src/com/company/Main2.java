package com.company;

import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        String str = "привет мир";

        /*char symbArr[] = str.toCharArray();
        symbArr[0]='П';
        str = new String(symbArr);*/

        //str = 'П' + str.substring(1);

        /*if(str.contains("рt")==true){
            System.out.println("OK");
        }else{
            System.out.println("ERROR");
        }*/

        //String strParts[] = str.split("\\.");

        //System.out.println(str.indexOf('и', 3));

        /*String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'и') {
                output += str.charAt(i);
            }
        }
        System.out.println(output);*/

        /*char tempArr[] = new char[5];
        tempArr[0]='a';
        tempArr[3]='b';
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i]);
        }
        System.out.println();
        String str2 = new String(tempArr);
        System.out.print(str2);*/

        /*int a = 15;
        String str2 = Integer.toString(a);
        str2 += "20";
        a = Integer.parseInt(str2);
        System.out.println(a);*/

        //String str2 = "привет мир";

        //System.out.println(str.equals(str2));

        //Привет МИР
        //привет мир

        /*String str2 = "аривет мир";
        System.out.println(str.compareTo(str2));*/


        /*str = str.trim();
        System.out.println(str);*/

        /*String str2 = String.format("value #%d is %d", 1, 100);
        System.out.println(str2);*/

        /*int index = str.indexOf('и');
        String str2 = str.substring(0, index) + str.substring(index + 1, str.length());
        System.out.println(str2);*/


    }
}