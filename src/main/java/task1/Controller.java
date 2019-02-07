package main.java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Controller {

    private Model model;
    private View view;
    private List<String> stringRestrictions;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        stringRestrictions.add("Hello");
        stringRestrictions.add("world!");
    }

    public void processUser() {

        Scanner in = new Scanner(System.in);
        boolean startProgram = true;

        while (startProgram) {

            model.addCurrentStringValue(inputStringValueWithScanner(in));

            String matchString = String.join(" ", stringRestrictions);

            if (matchString.equals(model.getValue())) {
                startProgram = false;
            }
        }

        view.printMessageAndValue(view.CURRENT_STRING, model.getValue());

    }

    private String inputStringValueWithScanner(Scanner in) {

        return stringRestrictions.stream().map(s -> receiveNextLine(in, s)).collect(Collectors.joining(" "));

    }


    private String receiveNextLine(Scanner in, String inputValue) {

        view.printMessage(View.INPUT_STRING_DATA + inputValue);

        while (!in.hasNext(inputValue)) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA + View.INPUT_STRING_DATA + inputValue);
            in.nextLine();
        }
        return in.nextLine();

    }


}
