package checkNumber;

public final class CheckExit {
    public void exit(String inputNumber) {
        if (inputNumber.equals("0")) {
            System.out.println("Goodbye!");
            System.exit(1);
        }
    }
}
