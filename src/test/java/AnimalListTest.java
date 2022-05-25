import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    void shouldReturnEmptyStringIfNoObject() {
        var animalList = new AnimalList();
        String expected = "";
        var actual = animalList.toString();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectStringIfOnlyOneObect() {
        var animalList = new AnimalList();
        animalList.add(new Animal("Tiger"));
        String expected = "Tiger";
        var actual = animalList.toString();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectStringOfList() {
        var animalList = new AnimalList();
        animalList.add(new Animal("Tiger"));
        animalList.add(new Animal("Falcon"));
        animalList.add(new Animal("Bear"));
        animalList.add(new Animal("Falcon"));
        String expected = "Tiger -> Falcon -> Bear -> Falcon";
        String actual = animalList.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectStringAfterRemovedItem() {
        var animalList = new AnimalList();
        var animal1 = new Animal("Tiger");
        var animal2 = new Animal("Bear");
        var animal3 = new Animal("Falcon");
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        String expected = "Tiger -> Falcon";
        animalList.remove(animal2);
        String actual = animalList.toString();
        Assertions.assertEquals(expected, actual);
    }
}