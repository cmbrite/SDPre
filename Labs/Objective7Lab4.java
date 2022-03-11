public class Objective7Lab4 {
  public static void main(String[] args) {
    int counter = 1;
    int sum = 1;


    while(counter < 20) {
      counter = counter + 1;
      sum = counter + sum;
    }
    System.out.println(sum);
  }
}
