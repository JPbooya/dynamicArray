public class dynamicStringList implements StringList {

  String[] arr;
  int sizeCount;

  public dynamicStringList(String[] arr){
    this.arr = arr;
    sizeCount = 0;
  }

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
    if (sizeCount == arr.length) {
      String[] arrCopy = new String[arr.length*2];
      for (int i = 0; i < sizeCount; i++) {
        arrCopy[i] = arr[i];
      }
      arr = arrCopy;
    }

    arr[sizeCount] = value;
    sizeCount++;
  }

  public String remove(int index) {
    if (index < 0 || index >= arr.length) {
      throw new IndexOutOfBoundsException();
    }

    String removed = arr[index];

    for (int i = sizeCount; i > index; i--) {
      arr[sizeCount - 2] = arr[sizeCount - 1];
    }

    sizeCount--;

    return removed;
  }

  public int size() {
    return sizeCount;
  }

  public int capacity() {
    return arr.length;
  }
}