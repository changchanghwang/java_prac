package array;

import java.util.Arrays;

public class Method {
  public void stream(){
    int[] numArray = new int[]{1,2,3,4,5};

    int[] mapArray = Arrays.stream(numArray).map((num)-> num *  3).toArray();
    System.out.println(Arrays.toString(mapArray));

    int sum = Arrays.stream(numArray).reduce(0, (acc,cur)->acc+cur);
    System.out.println(sum);

    int[] filterArray = Arrays.stream(numArray).filter((num)->num == 1).toArray();
    System.out.println(Arrays.toString(filterArray));
  }
}
