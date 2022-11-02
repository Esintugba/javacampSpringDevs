package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguagesRepository;
import kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrograminglLanguagesManager implements ProgramingLanguagesService {
    private ProgramingLanguagesRepository programingLanguagesRepository;

    @Autowired
    public PrograminglLanguagesManager(ProgramingLanguagesRepository programingLanguagesRepository){
        this.programingLanguagesRepository=programingLanguagesRepository;
    }
    public List<ProgramingLanguage> getAll(){
        return programingLanguagesRepository.getAll();
    }

    @Override
    public ProgramingLanguage getById(int id) throws Exception {
        return null;
    }

    @Override
    public void add(ProgramingLanguage programingLanguage) throws Exception {
        if (!programingLanguage.getName().isEmpty()) {
            for (ProgramingLanguage language1 : programingLanguagesRepository.getAll()) {
                if (language1.getName().equalsIgnoreCase(programingLanguage.getName())) {
                    System.out.printf("Programa dili isimleri aynı olamaz");
                }
            }
            programingLanguagesRepository.add(programingLanguage);
        } else {
            System.out.println("Dil alanı boş bırakılamaz");
        }

    }

    private boolean checkName(String name) {
        List<ProgramingLanguage> ProgramingLanguages = this.programingLanguagesRepository.getAll();
        boolean result = false;

        for(ProgramingLanguage programingLanguage :ProgramingLanguages){
            if(programingLanguage.getName().equalsIgnoreCase(name)) {
                result = true;
            }
        }

        return result;
    }

    @Override
    public void update(ProgramingLanguage programingLanguage) throws Exception {
        if (!programingLanguage.getName().equals("")) {
            programingLanguagesRepository.update(programingLanguage);
        } else {
            throw new RuntimeException("Dil alanı boş bırakılamaz.");
        }
    }

    public boolean isExist(ProgramingLanguage programingLanguage) {
        boolean control = false;
        for (ProgramingLanguage lng : programingLanguagesRepository.getAll()) {
            if (lng.getName().equals(programingLanguage.getName()) || lng.getId() == programingLanguage.getId()) {
                control = true;
            }
        }
        return control;
    }
    @Override
    public void delete(ProgramingLanguage programingLanguage) throws Exception {
        programingLanguagesRepository.delete(programingLanguage);
    }
}
