package main.java;

public class Model {

    private String value = "";

    public String addCurrentStringValue(String addValue){
        return value = value + " " + addValue;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
