package infoAboutNumber.propertiesNumbers;

import infoAboutNumber.NumbersProperties;

public final class SquareNumber implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {
        boolean isSquare;
        long number = Long.parseLong(inputNumber);
        isSquare = number % Math.sqrt(number) == 0;
        return isSquare;
    }
}