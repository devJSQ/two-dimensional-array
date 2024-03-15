public class Main8 {
  public static void main(String[] args) {
      float[][] values = new float[2][3];

      System.out.println("Number of rows: " + values.length);
      System.out.println("Number of columns: " + values[0].length);

      System.out.println("Initial array:");
      printArray(values);

      values[1][2] = 5.5f;

      System.out.println("Array after updating:");
      printArray(values);
  }

  private static void printArray(float [][] thearray){
    for(int x = 0; x < thearray.length; x++){
      System.out.println(x + "row");
      for (int i = 0; i < thearray[x].length; i ++){
        System.out.println(thearray[x][i]);
      }
    }
  }

}

