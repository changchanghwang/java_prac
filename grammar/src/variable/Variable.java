package variable;

public class Variable {
  public void console(){
    int number = 5; // 변수 let
    number = 4;
    System.out.println(number); // 4

    final String hello = "Hello World!";
    System.out.println(hello);

    final int constNumber = 5; // 상수 const
    // constNumber = 4; 재할당 불가능
    System.out.println(constNumber); // 5
  }
}
