public class handling {

    public static void main(String[] args) {

        try {

            int[] arr = {1,2,3};

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Index");

        } finally {

            System.out.println("Finally block executed.");

        }
    }
}
