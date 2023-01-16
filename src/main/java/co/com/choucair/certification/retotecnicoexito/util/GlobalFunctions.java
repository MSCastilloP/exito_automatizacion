package co.com.choucair.certification.retotecnicoexito.util;

import java.util.*;
import java.util.stream.Collectors;

public class GlobalFunctions {


    public final List listRandomNumberProducts() {
        Integer[] arr = new Integer[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(arr));
//        System.out.println(Arrays.toString(arr));
        return List.of(arr);
    }

    public final List listRandomQuantitiesOfProducts() {
        Integer[] arr = new Integer[18];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        return List.of(arr);
    }

    public final Double splitSpace(String price) {
        String num = price.substring(2).replaceAll("\\.", "");
        return Double.parseDouble(num);

    }
}
