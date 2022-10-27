package codegym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OurLinkedListTest {
    private OurLinkedList<String> ourLinkedList;
    @BeforeEach
    void setUp() {
        ourLinkedList = new OurLinkedList<>();
    }

    @Test
    void marc_addTest1() {
        ourLinkedList.add("Cat");
        assertEquals("Cat", ourLinkedList.get(0));
    }

    @Test
    void marc_addTest2() {
        ourLinkedList.add("Cat");
        ourLinkedList.add(0, "Turtle");
        assertEquals("Turtle", ourLinkedList.get(0));
        assertEquals("Cat", ourLinkedList.get(1));
    }
    @Test
    void parker_addLastTest1() {
        ourLinkedList.addLast("Cat");
        ourLinkedList.add(0, "Turtle");
        assertEquals("Turtle", ourLinkedList.get(0));
        assertEquals("Cat", ourLinkedList.get(1));
        ourLinkedList.addLast("Japanese Crested Ibis");
        assertEquals("Japanese Crested Ibis", ourLinkedList.get(2));
    }
    @Test
    void brendan_removeFirst() {
        ourLinkedList.add("cat");
        ourLinkedList.add("dog");
        ourLinkedList.removeFirst();
        assertEquals("dog", ourLinkedList.get(0));
    }

    @Test
    void brendan_removeFirst2() {
        ourLinkedList.add("tiger");
        ourLinkedList.add("alligator");
        ourLinkedList.add("cheetah");
        ourLinkedList.removeFirst();
        assertEquals("alligator", ourLinkedList.get(0));
    }

    @Test
    void brendan_removeFirst3() {
        ourLinkedList.add("tiger");
        ourLinkedList.add("alligator");
        ourLinkedList.add("cheetah");
        ourLinkedList.removeFirst();
        ourLinkedList.removeFirst();
        assertEquals("cheetah", ourLinkedList.get(0));
    }

    @Test
    void brendan_removeFirst4(){
        ourLinkedList.add("tiger");
        ourLinkedList.add("alligator");
        ourLinkedList.add("cheetah");
        assertEquals("tiger",ourLinkedList.removeFirst());
    }
    @Test
    void jacci_getFirst(){
        ourLinkedList.add("Jacci");
        ourLinkedList.add("Tom");
        ourLinkedList.add("Micah");
        assertEquals("Jacci",ourLinkedList.getFirst());
    }

    @Test
    void marc_remove1() {
        ourLinkedList.add("cat");
        ourLinkedList.add(0, "dog");
        assertEquals("dog", ourLinkedList.remove());
    }

    @Test
    void marc_remove2() {
        assertThrows(NoSuchElementException.class, () -> {ourLinkedList.remove();});
    }

}