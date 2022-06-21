package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

public final class GapfulNumber implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {

        String[] array = inputNumber.split("");
        String fistAndLastNumber = array[0] + array[array.length - 1];
        if (array.length >= 3) {
            return Long.parseLong(inputNumber) % Long.parseLong(fistAndLastNumber) == 0;
        } else {
            return false;
        }
    }
}
