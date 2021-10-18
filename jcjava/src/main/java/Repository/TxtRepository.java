package Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class TxtRepository {
    
    public static void write(String caminho, String conteudo) throws IOException {
        FileWriter arquivo = new FileWriter(caminho+".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.println(conteudo);
    }
    
    public static String read(String caminho) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader(caminho+".txt"));
        String conteudo ="";
        while (in.hasNextLine()) {
            conteudo = conteudo+"\n"+in.nextLine();
        }
        return conteudo;
    }
    
}
