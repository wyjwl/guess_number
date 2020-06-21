package com.tw.guessnumber;

public class InputValidator {

  public boolean isValid(String input) {
    String numberRegex = "\\d+";
    if (!input.matches(numberRegex)) {
      return false;
    }
    return input.length() == 4;
  }

}
