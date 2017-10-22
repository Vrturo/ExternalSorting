package com.sorting;

import com.google.code.externalsorting.ExternalSort;

import java.io.File;
import java.io.IOException;

public class ExternalSorter {

    public void exSort(final File input, final File output) throws IOException {
        ExternalSort.mergeSortedFiles(ExternalSort.sortInBatch(input), output);
    }

}
