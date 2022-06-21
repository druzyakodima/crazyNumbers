package checkNumber;

import menuAndAnswer.EnterARequest;

public final class CheckInputNumber {

    private EnterARequest enterARequest;

    public void checkNumber(String inputNumber) {
        String[] array = inputNumber.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith("-") && i == 0) {
                printExFirstNumber();
            }
            if (i == 1 && array[i].contains("-")) {
                System.out.println("The second parameter should be a natural number.");
                enterARequest = new EnterARequest();
                enterARequest.request();
            }
        }
    }

    private void printExFirstNumber() {
        System.out.println("The first parameter should be a natural number or zero.");
        enterARequest = new EnterARequest();
        enterARequest.request();

    }
}
