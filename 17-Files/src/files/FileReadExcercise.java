package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadExcercise {
    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("D:\\Google Drive\\programming\\notes\\ambil.txt");
        List<String> lines = Files.readAllLines(pathFileToRead);
        System.out.println(lines);
        Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("lihat")).forEach(System.out::println);
    }
}
