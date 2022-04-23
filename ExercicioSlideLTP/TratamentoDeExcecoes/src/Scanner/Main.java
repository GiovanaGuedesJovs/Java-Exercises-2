package Scanner;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String file = "arquivo.txt";
        
        System.out.println("\nScanner para ler arquivo linha por linha em Java: \n");

        Scanner scanner = new Scanner(new File(file));

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
        System.out.printf("\n");
    }
}
