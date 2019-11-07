package pl.marekkazana.unitsandmockstesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api {

    private AnimalController animalController;

    @Autowired
    public Api(AnimalController animalController) {
        this.animalController = animalController;
    }

    @GetMapping("/animal")
    public List<Animal> getAnimals(){

        return animalController.getAnimals();
    }

    @PostMapping("/animal")
    public void addAnimal (@RequestBody Animal animal){

        animalController.addAnimal(animal);

    }
}
