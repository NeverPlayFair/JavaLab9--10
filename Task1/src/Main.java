public class Main {
    public static void main(String[] args) {
        ExceptionTest example = new ExceptionTest();
        try {
            example.generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Exception type: NullPointerException!");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
