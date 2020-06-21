package com.tw.guessnumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NumberGeneratorTest {

  @Test
  public void shouldGenerate4DigitString() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString = numberGenerator.generate4DigitUnrepeatedNumberString();
    assertEquals(4, generatedNumberString.length());
  }

  @Test
  public void shouldGenerate4DigitStringWithOnlyPositiveNumbers() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString = numberGenerator.generate4DigitUnrepeatedNumberString();
    String numberRegex = "\\d+";
    assertTrue(generatedNumberString.matches(numberRegex));
  }
}