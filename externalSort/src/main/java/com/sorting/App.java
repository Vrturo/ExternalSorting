package com.sorting;

import com.google.code.externalsorting.ExternalSort;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static File one = new File("input");
    public static File two = new File("output");

    public static void main( String ...args) throws IOException {
        System.out.println( "Hello Sorter!" );

        ExternalSorter es = new ExternalSorter();
        es.exSort(one, two);
    }
}