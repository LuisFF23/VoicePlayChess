package Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PerfilRepository extends TxtRepository{
    
    public void createPerfil(String perfil, String conteudo) throws IOException {
        write(perfil, conteudo);
    }
    
    public String readPerfil(String perfil) throws FileNotFoundException {
        String conteudo = read(perfil);
        return conteudo;
    }
    
    public void updatePerfil(String perfil, String conteudo) throws IOException {
        String caminho = perfil+"txt";
        File file = new File(caminho);
        if (file.exists()) {
            file.delete();    
        }
            write(perfil, conteudo);
    }
    
    public void deletePerfil(String perfil) {
        String caminho = perfil+"txt";
        File file = new File(caminho);
        file.delete();
    }
}
