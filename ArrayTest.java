public class ArrayTest{
  public static void main(String[]args) {
    int[] anArray = new int[11];
    anArray[0] = 100;
    for (int i = 1;i < 11; i++) {
      anArray[i] = anArray[i-1] + 10;
    }
    System.out.println("part 1:");
    System.out.println(anArray);
    System.out.println("part 2:");
    for (int i = 1;i < 11; i++){
      System.out.print(anArray[i] + " ");
    }
  }
}
