package com.tw.guessnumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberGenerator {

  public String getNumber(){
    List<String> numberStrings = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
    Collections.shuffle(numberStrings);
    return String.join("", numberStrings.subList(0, 4));
  }

}
