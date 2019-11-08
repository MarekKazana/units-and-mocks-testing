package pl.marekkazana.unitsandmockstesting;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
class AnimalServiceTestMocks2 {

    @Mock
    AnimalRepo animalRepo;

    @InjectMocks
    AnimalService animalService;

    @Before
    public void init(){
        given(animalRepo.findAll()).willReturn(prepareMockData());
    }

    @Test
    void getAnimals() {
        List<Animal> animals = animalService.getAnimals();
        //then
        Assert.assertThat(animals, Matchers.hasSize(3));
    }

//    @Test
//    void addAnimal() {
//    }
//
//    @Test
//    void getTrue() {
//    }
//
//    @Test
//    void get() {
//    }

    private List<Animal> prepareMockData() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("dog"));
        animals.add(new Animal("cat"));
        animals.add(new Animal("rat"));
        return animals;
    }
}