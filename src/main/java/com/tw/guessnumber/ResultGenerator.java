package com.tw.guessnumber;

public class ResultGenerator {

  public String getResult(String input, String answer) {
    int numberMatch = 0;
    for (int index = 0; index < input.length(); index++) {
      if (answer.contains(String.valueOf(input.charAt(index)))) {
        numberMatch++;
      }
    }
    return "0A"+ numberMatch +"B";
  }
}
