package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

public final class PalindromicNumber implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {
        if (inputNumber.length() > 0) {
            String[] arr = inputNumber.split("");
            boolean isPalindrome = true;
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length - 1 - i; j > i; j--) {
                    if (!arr[i].equals(arr[j])) {
                        isPalindrome = false;
                        break;
                    }
                    break;
                }
            }
            return isPalindrome;
        } else {
            return false;
        }

    }
}
