import array.Method;
import variable.Variable;
import datatype.*;

public class Main {
  public static void main(String[] args) {
    Variable variable = new Variable();
    variable.console();
    Primitive primitive = new Primitive();
    primitive.console();
    Reference reference = new Reference();
    reference.console();
    Method arrayMethod = new Method();
    arrayMethod.stream();
  }
}
