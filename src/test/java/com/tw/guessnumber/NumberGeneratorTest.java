package com.tw.guessnumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberGeneratorTest {

  @Test
  public void shouldGenerate4DigitString() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString = numberGenerator.generate4DigitUnrepeatedNumberString();
    assertEquals(4, generatedNumberString.length());
  }
}