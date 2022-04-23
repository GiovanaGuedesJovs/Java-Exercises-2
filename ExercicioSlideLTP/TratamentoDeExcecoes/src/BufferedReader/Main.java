package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        String file = "arquivo.txt";
        
        System.out.println("\nBufferedReader para ler o arquivo linha por linha em Java:\n");

        try(BufferedReader buffered = new BufferedReader(new FileReader(file))){ 
            String linha;
            while ((linha = buffered.readLine()) != null) {
                System.out.println(linha);
            }
        }
        catch (IOException ex) {
            System.out.println("\nOcorreu um erro: "+ex.getMessage()+".");
            System.out.println("\nTrajetória percorrida pelo erro: \n");
            ex.printStackTrace();
            System.out.println("\n");
        }
        System.out.printf("\n");

    }
}
