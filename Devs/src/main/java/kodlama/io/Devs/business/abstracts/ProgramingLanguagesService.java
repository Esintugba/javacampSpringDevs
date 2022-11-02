package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguagesService  {
    List<ProgramingLanguage> getAll();

    ProgramingLanguage getById(int id) throws Exception;
    void add(ProgramingLanguage language) throws Exception;
    void update(ProgramingLanguage language) throws Exception;
    void delete(ProgramingLanguage language) throws Exception;
}
