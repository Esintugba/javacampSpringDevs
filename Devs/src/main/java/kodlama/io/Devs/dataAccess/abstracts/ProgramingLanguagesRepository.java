package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguagesRepository {

    List<ProgramingLanguage> getAll();

    ProgramingLanguage getById();

    ProgramingLanguage getById(int id);

    public void add(ProgramingLanguage programingLanguage);
    public void update(ProgramingLanguage programingLanguage);
    public void delete(ProgramingLanguage programingLanguage);
}
