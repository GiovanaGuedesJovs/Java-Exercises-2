package Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {

        String file = "arquivo.txt";
        
        System.out.println("\nStream para ler arquivo linha por linha em Java: \n");

        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            stream.forEach(System.out::println);
        }
        catch (IOException ex) {
            System.out.println("\nOcorreu um erro.");
            System.out.println("\nTrajetória percorrida pelo erro: \n");
            ex.printStackTrace();
            System.out.println("\n");
        }
        System.out.printf("\n");
    }
}
