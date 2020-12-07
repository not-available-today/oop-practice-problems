package com.company.stringhelper;

public class StringManipulator implements CharSequence {
    //region Properties
    private String string;
    //endregion

    //region Constructors


    public StringManipulator() {
    }

    public StringManipulator(String string) {
        this.string = string;
    }

    //endregion

    //region Public Methods
    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(start, end);
    }

    @Override
    public String toString(){
        return toString();
    }

    public String reverseString(){
        char[] original = string.toCharArray();
        char[] reversed = original.clone();
        int j = original.length - 1;
        for (int i = 0; i < original.length; i++) {
            reversed[j] = original[i];
            j--;
        }
        return this.string = new String(reversed);
    }
    //endregion

    //region Setters and Getters

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    //endregion

    public static void main(String[] args) {
        StringManipulator test = new StringManipulator("Fuck you");

        System.out.println(test.length());
        System.out.println(test.charAt(2));
        System.out.println(test.subSequence(1, 4));
        System.out.println(test.reverseString());

    }
}
