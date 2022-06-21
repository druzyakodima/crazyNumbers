package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

public final class SunnyNumber implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {
        boolean isSunny;
        long number = Long.parseLong(inputNumber) + 1;
        isSunny = (number) % Math.sqrt(number) == 0;
        return isSunny;
    }
}