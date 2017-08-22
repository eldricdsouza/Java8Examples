package com.eldric.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by eldric on 22/08/17.
 */
public class FileReader {

    public static void main(String[] args) throws IOException {
            Stream<String> stringStream = Files.lines(Paths.get("src/com/eldric/files/text.txt"));
            stringStream.forEach(System.out::println);

    }

}


