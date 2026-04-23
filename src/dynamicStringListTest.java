import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class dynamicStringListTest {
  @Test
  void testForGet() {

    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.arr[2] = "Hello";

    String actual = constructor.get(2);

    assertEquals(actual, "Hello");
  }

  @Test void testForgetOutOfBounds() {
    
    dynamicStringList constructor = new dynamicStringList(new String[3]);
    constructor.arr[2] = "Hello";

    assertThrows(IndexOutOfBoundsException.class, () -> {
      constructor.get(5);
    });
  }
}
