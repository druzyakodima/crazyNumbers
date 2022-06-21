package menuAndAnswer;

import checkNumber.CheckExit;
import checkNumber.CheckInputNumber;
import checkNumber.SearchProperties;
import checkNumber.incompatibilityProperties;
import infoAboutNumber.InformationalAboutTheNumber;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public final class EnterARequest {

    public void request() {

        Scanner scanner = new Scanner(System.in);
        SearchProperties searchProperties = new SearchProperties();
        String inputNumber = " ";

        while (!inputNumber.equals("0")) {
            System.out.print("\nEnter a request:");
            inputNumber = scanner.nextLine().trim();
            StringBuilder inputProperties = new StringBuilder(" ");

            String[] arrayInput = inputNumber.split(" ");
            ArrayList<String> stopProperties = new ArrayList<>();
            if (arrayInput.length > 2) {
                for (int i = 2; i < arrayInput.length; i++) {
                    inputProperties.append(arrayInput[i]).append(" ");
                    if (arrayInput[i].contains("-")) {
                        stopProperties.add("(.*)" + arrayInput[i].replace("-", "") + "(.*)");
                    }
                }
            }


            CheckExit checkExit = new CheckExit();
            CheckInputNumber checkInputNumber = new CheckInputNumber();
            InformationalAboutTheNumber informationAboutTheNumber = new InformationalAboutTheNumber();
            incompatibilityProperties incompatibilityProperties = new incompatibilityProperties();

            checkExit.exit(inputNumber);


            checkInputNumber.checkNumber(inputNumber);

            if (arrayInput.length > 2) {
                searchProperties.searchProperty(inputProperties.toString().trim());
                if (!incompatibilityProperties.checkingIncompatibilityProperties(inputProperties.toString().trim().toUpperCase(Locale.ROOT))) {
                    request();
                }
            }

            informationAboutTheNumber.infoNumber(inputNumber, stopProperties);
        }
    }
}
