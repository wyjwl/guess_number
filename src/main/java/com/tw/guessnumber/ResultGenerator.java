package com.tw.guessnumber;

public class ResultGenerator {

  public String getResult(String input, String answer) {
    int numberMatchPositionMatch = 0;
    int numberMatchPositionNotMatch = 0;
    for (int index = 0; index < input.length(); index++) {
      if (answer.contains(String.valueOf(input.charAt(index)))) {
        if (answer.charAt(index) == input.charAt(index)) {
          numberMatchPositionMatch++;
        } else {
          numberMatchPositionNotMatch++;
        }
      }
    }
    return numberMatchPositionMatch + "A" + numberMatchPositionNotMatch + "B";
  }
}
