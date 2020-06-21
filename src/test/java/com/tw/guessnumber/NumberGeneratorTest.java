package com.tw.guessnumber;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NumberGeneratorTest {

  @Test
  public void shouldGenerateResultWith4DigitString() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString = numberGenerator.generate4DigitUnrepeatedNumberString();
    assertEquals(4, generatedNumberString.length());
  }

  @Test
  public void shouldGenerateResultWithOnlyPositiveNumbers() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString = numberGenerator.generate4DigitUnrepeatedNumberString();
    String numberRegex = "\\d+";
    assertTrue(generatedNumberString.matches(numberRegex));
  }

  @Test
  public void shouldGenerateResultWithoutDuplication() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString = numberGenerator.generate4DigitUnrepeatedNumberString();
    Set<Character> characterSet = new HashSet<>();
    for(int index = 0; index < generatedNumberString.length(); index++){
      characterSet.add(generatedNumberString.charAt(index));
    }
    assertEquals(4, characterSet.size());
  }
}