public class Main {
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

}

