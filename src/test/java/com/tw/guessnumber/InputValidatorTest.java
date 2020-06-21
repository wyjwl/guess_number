package com.tw.guessnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputValidatorTest {

  @Test
  public void shouldReturnFalseWhenInputLengthIsNotEqual4() {
    InputValidator inputValidator = new InputValidator();
    assertFalse(inputValidator.isValid("1"));
    assertFalse(inputValidator.isValid("12"));
    assertFalse(inputValidator.isValid("123"));
    assertFalse(inputValidator.isValid("12345"));
    assertFalse(inputValidator.isValid("123456"));
  }

  @Test
  public void shouldReturnFalseWhenInputContainsNonDigitCharacter() {
    InputValidator inputValidator = new InputValidator();
    assertFalse(inputValidator.isValid("af43"));
  }

  @Test
  public void shouldReturnFalseWhenInputHasDuplication() {
    InputValidator inputValidator = new InputValidator();
    assertFalse(inputValidator.isValid("4465"));
  }
}