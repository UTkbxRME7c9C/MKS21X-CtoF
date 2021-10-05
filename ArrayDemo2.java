public class ArrayDemo2{
  public static String aryToString(int[] nums){
    String aray = "[ ";
    for (int i = 0;i<nums.length;i++){
      if (i != nums.length-1) {
        aray = aray+ nums[i] + ", ";
      } else {
        aray = aray + nums[i] + " ]"
      }
    }
  }

  public static void main(String[]args){

    int[] data1 = {1,2,3,4};
    int[] data2 = {1,2,3,4};
    int[] data3 = data2;

    data1[1]=999;
    data2[2]=888;
    data3[3]=777;

    System.out.println("data1 :\n"+aryToString(data1));
    System.out.println("data2 :\n"+aryToString(data2));
    System.out.println("data3 :\n"+aryToString(data3));


  }
}
