import java.io.PrintStream;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
//    variable();
//    primitiveDataType();
    referenceDataType();
  }

  private static void variable(){
    int number = 5; // 변수 let
    number = 4;
    System.out.println(number); // 4

    final String hello = "Hello World!";
    System.out.println(hello);

    final int constNumber = 5; // 상수 const
    // constNumber = 4; 재할당 불가능
    System.out.println(constNumber); // 5
  }

  private static void primitiveDataType(){
    // <-- 숫자 자료형
    short s = 32767; // 2 bytes
    int i = 2000000000; // 4 bytes
    long l =99999; // 8 bytes
    float f = 5.5F; // 소수점. F를 붙여야함
    double d = 5.5;

    System.out.printf("%d %d %d %.2f %.2f%n", s, i, l, f, d); // 한줄로 표현할 방법이 더 없을까..
    System.out.println(Long.MAX_VALUE);
    //->

    // <-- 문자 자료형
    char c = 'A';

    System.out.println(c);
    // >--

    // Boolean
    boolean b = true;

    byte data = 100; // 1byte 크기의 정수값 저장함.
    System.out.println(data);
  }

  private static void referenceDataType(){
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
