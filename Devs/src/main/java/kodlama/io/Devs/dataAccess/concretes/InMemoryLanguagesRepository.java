package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguagesRepository;
import kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguagesRepository implements ProgramingLanguagesRepository {
    List<ProgramingLanguage> programingLanguages;


    public InMemoryLanguagesRepository() {
        programingLanguages = new ArrayList<ProgramingLanguage>();
        programingLanguages.add(new ProgramingLanguage(1, "C#"));
        programingLanguages.add(new ProgramingLanguage(2, "Python"));
        programingLanguages.add(new ProgramingLanguage(3, "Java"));


    }

    @Override
    public List<ProgramingLanguage> getAll() {
        return programingLanguages;
    }

    @Override
    public ProgramingLanguage getById() {
        return null;
    }

    @Override
    public ProgramingLanguage getById(int id) {
        for (ProgramingLanguage programmingLanguage : programingLanguages) {
            if(programmingLanguage.getId()==id){
                return programmingLanguage;
            }
        }
        throw null;
    }

    @Override
    public void add(ProgramingLanguage programingLanguage) {
        programingLanguages.add(programingLanguage);

    }

    @Override
    public void update(ProgramingLanguage programingLanguage) {
        ProgramingLanguage updateLangues=getById(programingLanguage.getId());
        updateLangues.setName(programingLanguage.getName());
    }


    @Override
    public void delete(ProgramingLanguage programingLanguage) {
        programingLanguages.remove(programingLanguage);
    }


}

