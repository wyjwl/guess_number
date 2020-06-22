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
    String generatedNumberString = numberGenerator.getNumber();

    assertEquals(4, generatedNumberString.length());
  }

  @Test
  public void shouldGenerateResultWithOnlyNumbers() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString = numberGenerator.getNumber();

    String numberRegex = "\\d+";
    assertTrue(generatedNumberString.matches(numberRegex));
  }

  @Test
  public void shouldGenerateResultWithoutDuplication() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString = numberGenerator.getNumber();

    Set<Character> characterSet = new HashSet<>();
    for (int index = 0; index < generatedNumberString.length(); index++) {
      characterSet.add(generatedNumberString.charAt(index));
    }
    assertEquals(4, characterSet.size());
  }

  @Test
  public void shouldNotAlwaysGenerateSameResult() {
    NumberGenerator numberGenerator = new NumberGenerator();
    String generatedNumberString1 = numberGenerator.getNumber();
    String generatedNumberString2 = numberGenerator.getNumber();
    String generatedNumberString3 = numberGenerator.getNumber();

    Set<String> stringSet = new HashSet<>();

    stringSet.add(generatedNumberString1);
    stringSet.add(generatedNumberString2);
    stringSet.add(generatedNumberString3);

    assertTrue(stringSet.size() >= 2);
  }
}