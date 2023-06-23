package br.com.devantenor.java8;

import java.util.StringTokenizer;

public class StringJoiner {
    public static void tests() {
        String nameList = "Ana, Beatriz, Cesar, Daniel, Flávio, Gabriela";

        //Old StringTokenizer, is utilized for read the string list itens
        System.out.println("Read string lists with StringTokenizer: ");

        StringTokenizer st = new StringTokenizer(nameList, ", ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        //StringTokenizer, used by join string itens
        System.out.println("\nMake string lists with StringJoiner: ");

        java.util.StringJoiner sj = new java.util.StringJoiner(", ");
        sj.add("Ana");
        sj.add("Beatriz");
        sj.add("Cesar");
        sj.add("Daniel");
        sj.add("Flávio");
        sj.add("Gabriela");

        System.out.println(sj);
    }
}
