package com.tw.guessnumber;

import java.util.Scanner;

public class GuessNumber {

  private  int RETRY_TIMES = 6;
  private  NumberGenerator numberGenerator = new NumberGenerator();
  private  InputValidator inputValidator = new InputValidator();
  private  ResultGenerator resultGenerator = new ResultGenerator();

  public void startGame() {

    String userString;

    String answer = numberGenerator.getNumber();

    int remainTimes = RETRY_TIMES;

    Scanner input = new Scanner(System.in);

    while (remainTimes > 0) {
      userString = input.nextLine();

      if (!inputValidator.isValid(userString)) {
        System.out.println("wrong input, try again");
        remainTimes--;
        continue;
      }

    }

  }

}
