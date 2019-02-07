package main.java;

import java.util.ArrayList;
import java.util.List;

public class View {

    public static final String INPUT_STRING_DATA = "Input String value = ";
    public static final String WRONG_INPUT_STRING_DATA = "Wrong input! Repeat please! ";
    public static final String CURRENT_STRING = "String value = ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndValue(String message, String value){
        System.out.println(message + value);
    }

}
