package Service;

import Repository.CasaRepository;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.CasaEntity;

public class CasaService {
    
    CasaRepository repository;
    public void saveCasa (String perfil, CasaEntity casa) throws IOException {
        repository.write(perfil, casa);
    }
    
    public String ReadPerfil (String perfil) throws FileNotFoundException {
        return repository.read(perfil);
    }

}
