import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class dynamicStringListTest {
  @Test
  void testForGetMethod() {
    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.arr[0] = "Hello";

    String actual = constructor.get(0);

    assertEquals("Hello", actual);
  }

  @Test 
  void testForGetMethodIfIndexIsOutOfBounds() {
    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.arr[0] = "Hello";

    assertThrows(IndexOutOfBoundsException.class, () -> {
      constructor.get(3);
    });
  }

  @Test
  void testForAddMethod() {
    dynamicStringList constructor = new dynamicStringList(new String[5]);

    constructor.add("Hello");

    String actual = constructor.get(0);

    assertEquals("Hello", actual);
  }

  @Test
  void testForAddMethodButArrayReachesMaxCapacity() {
    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.add("Hello"); constructor.add("Hi");
    constructor.add("Hey"); constructor.add("Greetings");

    String actual = constructor.get(3);

    assertEquals("Greetings", actual);
  }

  @Test
  void testForSetMethod() {
    dynamicStringList constructor = new dynamicStringList(new String[5]);
    constructor.add("Hello");
    constructor.add("Hey");

    constructor.set(1, "Hi");
    String actual = constructor.get(1);

    assertEquals("Hi", actual);
  }

  @Test
  void testForSetMethodIfIndexIsOutOfBounds() {
    dynamicStringList constructor = new dynamicStringList(new String[2]);
    constructor.add("Hello");
    constructor.add("Hey");

    assertThrows(IndexOutOfBoundsException.class, () -> {
      constructor.set(2, "Hi");
    });
  }

  @Test
  void testForRemoveMethod() {
    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.add("Hello");
    constructor.add("Hey");
    constructor.add("Hi");

    String actual = constructor.remove(2);

    assertEquals("Hi", actual);
  }

  @Test
  void testForRemoveMethodIfIndexIsOutOfBounds() {
    dynamicStringList constructor = new dynamicStringList(new String[4]);
    constructor.add("Hello");
    constructor.add("Hey");
    constructor.add("Hi");

    assertThrows(IndexOutOfBoundsException.class, () -> {
      constructor.remove(-1);
    });
  }

  @Test 
  void testForRemoveMethodIfRemoveFromTheMiddle() {
    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.add("Hello");
    constructor.add("Hey");
    constructor.add("Hi");

    String actual = constructor.remove(1);

    assertEquals("Hey", actual);
    assertEquals("Hi", constructor.get(1));
  }

  @Test void testForSizeAfterAdding() {
    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.add("Hello");
    constructor.add("Hey");
    constructor.add("Hi");

    int actual = constructor.size();

    assertEquals(3, actual);
  }

  @Test void testForSizeBeforeRemoving() {
     dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.add("Hello");
    constructor.add("Hey");
    constructor.add("Hi");

    constructor.remove(2);

    int actual = constructor.size();

    assertEquals(2, actual);
  }

  @Test void testForCapacitiyAfterMax() {
    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.add("Hello");
    constructor.add("Hey");
    constructor.add("Hi");
    constructor.add("bye");

    int actual = constructor.capacity();

    assertEquals(6, actual);
  }
}
