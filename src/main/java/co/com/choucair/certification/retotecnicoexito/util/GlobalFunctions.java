package co.com.choucair.certification.retotecnicoexito.util;

import java.util.*;

import java.util.List;

public class GlobalFunctions {


    public final List listRandomNumberProducts(int taman) {
        Integer[] arr = new Integer[taman];
        int v[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        Collections.shuffle(Arrays.asList(arr));
        return Arrays.asList(arr);
    }

    public final List listRandomQuantitiesOfProducts() {
        Integer[] arr = new Integer[18];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        return Arrays.asList(arr);
    }

    public final Double splitSpace(String price) {
        String num = price.substring(2).replaceAll("\\.", "");
        return Double.parseDouble(num);

    }
}
