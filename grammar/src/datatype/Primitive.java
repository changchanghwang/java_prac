package datatype;

public class Primitive {
  public void console(){
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
}
