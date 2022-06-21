package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

public final class Even implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {
        return Long.parseLong(inputNumber) % 2 == 0;
    }
}
