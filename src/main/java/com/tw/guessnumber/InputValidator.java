package com.tw.guessnumber;

import java.util.HashSet;
import java.util.Set;

public class InputValidator {

  public boolean isValid(String input) {
    return isNumber(input) && !isDuplication(input) && is4Digit(input);
  }

  private boolean isNumber(String input){
    String numberRegex = "\\d+";
    return input.matches(numberRegex);
  }

  private boolean isDuplication(String input){
    Set<Character> characterSet = new HashSet<>();
    for (int index = 0; index < input.length(); index++) {
      characterSet.add(input.charAt(index));
    }
    return characterSet.size() < 4;
  }

  private boolean is4Digit(String input){
    return input.length() == 4;
  }

}
