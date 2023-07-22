package datatype;

import java.util.Arrays;

public class Reference {
  public void console(){
    String hello = "hello word"; // String은 참조자료형이다..!?
    int[] array = new int[] {1,2,3,4,5};

    System.out.println(Arrays.toString(array)); // 그냥 출력하면 아마도 참조값이 출력되는 것 같음..

    int[] numArray = new int[3];
    numArray[0] = 1;
    System.out.println(Arrays.toString(numArray)); // 초기값 0

    String[] stringArray = new String[3];
    stringArray[0] = "hello";
    System.out.println(Arrays.toString(stringArray)); // 초기값 null
  }
}
