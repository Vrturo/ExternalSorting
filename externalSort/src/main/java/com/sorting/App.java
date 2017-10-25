package com.sorting;

import com.google.code.externalsorting.ExternalSort;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static File one = new File("/Users/Art/IdeaProjects/ExternalSorting/externalSort/src/main/resources/input2.txt");
    public static File two = new File("/Users/Art/IdeaProjects/ExternalSorting/externalSort/src/main/resources/output");

    public static void main( String ...args) throws IOException {
        System.out.println( "Hello Sorter!" );

        ExternalSorter es = new ExternalSorter();
        es.exSort(one, two);
    }
}