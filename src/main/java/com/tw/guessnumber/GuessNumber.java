package com.tw.guessnumber;

import java.util.ArrayList;
import java.util.List;
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

    List<String> history = new ArrayList<>();

    while (remainTimes > 0) {
      userString = input.nextLine();

      if (!inputValidator.isValid(userString)) {
        System.out.println("wrong input, try again");
        remainTimes--;
        continue;
      }

      String result = resultGenerator.getResult(userString, answer);

      if ("4A0B".equals(result)) {
        history.add(userString + " " + result);
        history.forEach(System.out::println);
        System.out.println("win all correct");
        break;
      } else {
        history.add(userString + " " + result);
        history.forEach(System.out::println);
        remainTimes--;
        if (remainTimes == 0) {
          System.out.println("game over");
          System.out.println("the number is: " + answer);
        }
      }

    }

  }

}
