package com.tw.guessnumber;

import java.util.HashSet;
import java.util.Set;

public class InputValidator {

  public boolean isValid(String input) {
    String numberRegex = "\\d+";
    if (!input.matches(numberRegex)) {
      return false;
    }
    Set<Character> characterSet = new HashSet<>();
    for (int index = 0; index < input.length(); index++) {
      characterSet.add(input.charAt(index));
    }
    if (characterSet.size() < 4) {
      return false;
    }
    return input.length() == 4;
  }

}
