package pl.marekkazana.unitsandmockstesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepo animalRepo;

    public List<Animal> getAnimals(){
        List<Animal> animals = new ArrayList<>();
        animalRepo.findAll().iterator().forEachRemaining(animals::add);
        return animals;
    }

    public Animal addAnimal(Animal animal){

        return animalRepo.save(animal);
    }
}