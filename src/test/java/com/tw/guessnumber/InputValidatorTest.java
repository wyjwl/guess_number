package com.tw.guessnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputValidatorTest {

  @Test
  public void shouldReturnFalseWhenInputLengthIsNotEqual4() {
    InputValidator inputValidator = new InputValidator();
    assertFalse(inputValidator.isValid("12345"));
  }

  @Test
  public void shouldReturnFalseWhenInputContainsNonDigitCharacter() {
    InputValidator inputValidator = new InputValidator();
    assertFalse(inputValidator.isValid("af43"));
  }

}