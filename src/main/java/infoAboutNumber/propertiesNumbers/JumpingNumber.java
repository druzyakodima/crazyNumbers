package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

public final class JumpingNumber implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {
        String[] arrNumbersString = inputNumber.split("");
        boolean isJumping = true;
        if (inputNumber.length() != 1) {
            long[] numbers = new long[arrNumbersString.length];

            for (int i = 0; i < arrNumbersString.length; i++) {
                numbers[i] = Long.parseLong(arrNumbersString[i]);
            }

            if ((numbers[0] - numbers[1] == 1 || numbers[0] - numbers[1] == -1) && numbers.length == 2) {
                return true;
            }else {
                isJumping = false;
            }

            for (int i = 1; i < numbers.length - 1; i++) {
                long checkNextNumbers = numbers[i] - numbers[i + 1];
                long checkPrevious = numbers[i] - numbers[i - 1];
                if( (checkNextNumbers == 1 ||checkNextNumbers == -1) && (checkPrevious == 1 ||checkPrevious == -1) ) {
                    isJumping = true;
                } else {
                    return false;
                }
            }
        }
        return isJumping;
    }
}

