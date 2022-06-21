package checkNumber;

import java.util.Locale;

public final class incompatibilityProperties {

    public Boolean checkingIncompatibilityProperties(String twoPropertyAndMore) {

        String[] arrayProperties = twoPropertyAndMore.split(" ");
        String stop = "ODD EVEN, -ODD -EVEN, ODD -ODD, -ODD ODD, EVEN ODD, -EVEN -ODD, EVEN -EVEN, -EVEN EVEN, DUCK SPY, DUCK -DUCK, -DUCK DUCK, SPY DUCK, SPY -SPY, -SPY SPY, SUNNY SQUARE, SUNNY -SUNNY, -SUNNY SUNNY, SQUARE SUNNY, SQUARE -SQUARE, -SQUARE SQUARE, HAPPY SAD, -HAPPY SAD, HAPPY -SAD, SAD -SAD, -SAD SAD, HAPPY -HAPPY, -HAPPY -HAPPY, -GAPFUL GAPFUL, GAPFUL -GAPFUL, PALINDROMIC -PALINDROMIC, -PALINDROMIC PALINDROMIC, -JUMPING JUMPING, JUMPING -JUMPING, -BUZZ BUZZ, BUZZ -BUZZ";

        for (int i = 0; i < arrayProperties.length - 1; i++) {
            for (int j = i + 1; j < arrayProperties.length; j++) {
                String twoProperties = arrayProperties[i].toUpperCase(Locale.ROOT) + " " + arrayProperties[j].toUpperCase(Locale.ROOT);
                if (arrayProperties[i].toUpperCase(Locale.ROOT).equals(arrayProperties[j].toUpperCase(Locale.ROOT)) && !twoProperties.contains("-")) {
                    break;
                }
                if (stop.matches("(.*)" + twoProperties + "(.*)")) {
                    System.out.printf("The request contains mutually exclusive properties: [%s]\nThere are no numbers with these properties.\n", twoProperties.trim().replace(" ", ", "));
                    return false;
                }
            }
        }

        return true;
    }

}
