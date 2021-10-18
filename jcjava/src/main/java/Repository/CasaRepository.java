package Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import model.CasaEntity;

public abstract class CasaRepository {
    
    public void write(String perfil, CasaEntity casa) throws IOException {
        FileWriter arquivo = new FileWriter(perfil+".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        String conteudo = read(perfil);
        conteudo = conteudo + casa.toString();
        gravar.println(conteudo);
    }
    
    public String read(String perfil) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader(perfil+".txt"));
        String conteudo ="";
        while (in.hasNextLine()) {
            conteudo = conteudo+"\n"+in.nextLine();
        }
        return conteudo;
    }
    
    public void ctrlZ(String perfil) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader(perfil+".txt"));
        String conteudo ="";
        int contador = -1;
        while (in.hasNextLine()) {
            contador++;
        }
        for (int i = 0; i < contador; i++) {
            conteudo = conteudo+"\n"+in.nextLine();
        }
    }
    
}
