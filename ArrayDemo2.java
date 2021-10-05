//Rafayet Hossain pd 4

public class ArrayDemo2{
  public static String aryToString(int[] nums){
    String aray = "[ ";
    for (int i = 0;i<nums.length;i++){
      if (i != nums.length-1) {
        aray = aray+ nums[i] + ", ";
      } else {
        aray = aray + nums[i] + " ]";
      }
    }
    return aray;
  }
  public static int[] returnCopy(int[] ary){
    int[] newary = new int[ary.length];
    for (int i = 0; i<ary.length;i++){
      newary[i] = ary[i];
    }
    return newary;
  }
  public static int[] concatArray(int[] ary1,int[] ary2){
    int[] newary = new int[ary1.length + ary2.length];
    int count = 0;
    for (int i=0; i<ary1.length; i++) {
      newary[count] = ary1[i];
      count++;
    }
    for (int i=0; i<ary2.length; i++) {
      newary[count] = ary2[i];
      count++;
    }
    return newary;
  }
  public static void main(String[]args){
    int[] data1 = {1,2,3,4};
    int[] data2 = {1,2,3,4,5};
    int[] data3 = returnCopy(data2);

    data1[1]=999;
    data2[2]=888;
    data3[3]=777;

    System.out.println("data1 :\n"+aryToString(data1));
    System.out.println("data2 :\n"+aryToString(data2));
    System.out.println("data3 :\n"+aryToString(data3));
    System.out.println("dataconcat :\n"+aryToString(concatArray(data1, data2)));
  }
}
