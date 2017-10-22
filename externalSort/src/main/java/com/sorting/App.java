package com.sorting;

import com.google.code.externalsorting.ExternalSort;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String args[]) throws IOException {
        System.out.println( "Hello World!" );
    }

    public static void exSort(final File input, final File output) throws IOException {
        ExternalSort.mergeSortedFiles(ExternalSort.sortInBatch(input), output);
    }

    public App() {
        public File one = new File("one");
        public File two = new File("two");

        public App sortApp = new App();
        App.exSort(one, two);
    }
}

