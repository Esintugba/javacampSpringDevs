package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.ProgramingLanguagesService;
import kodlama.io.Devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/programlanguage")

public class ProgramingLanguagesControllers {
    private ProgramingLanguagesService programingLanguagesService;

    @Autowired
    public ProgramingLanguagesControllers(ProgramingLanguagesService programingLanguagesService){
        this.programingLanguagesService=programingLanguagesService;
    }
    @GetMapping("/getAll")
    public List<ProgramingLanguage> getAll(){
        return programingLanguagesService.getAll();
    }
}
