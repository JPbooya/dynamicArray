public class dynamicStringList implements StringList {
  String[] arr = new String[5];

  int sizeCount = 0;
  public String get(int index) {
    if(index < 0 || index >= arr.length) {
      throw new IndexOutOfBoundsException();
    }
    return arr[index];
  }
}