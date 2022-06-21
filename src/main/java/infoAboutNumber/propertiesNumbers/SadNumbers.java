package infoAboutNumber.propertiesNumbers;


import infoAboutNumber.NumbersProperties;

public final class SadNumbers implements NumbersProperties {

    public boolean checkNumbers(String inputNumber) {
        HappyNumber happyNumber = new HappyNumber();
        return !happyNumber.checkNumbers(inputNumber);
    }
}


