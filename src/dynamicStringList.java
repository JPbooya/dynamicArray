public class dynamicStringList implements StringList {
  String[] arr = new String[5];
  int sizeCount = 0;

  public String get(int index) {
    if (index < 0 || index >= arr.length) {
      throw new IndexOutOfBoundsException();
    }

    return arr[index];
  }

  public void set(int index, String value) {
    if (index < 0 || index >= arr.length) {
      throw new IndexOutOfBoundsException();
    }

    arr[index] = value;
  }

  public void add(String value) {
    arr[sizeCount] = value;
    sizeCount++;
  }

}