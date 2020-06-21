package com.tw.guessnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResultGeneratorTest {

  private String answer = "5647";

  @Test
  public void shouldReturn0A0BWhen0NumberPositionMatchAndNoNumberMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("0A0B", resultGenerator.getResult("1239", answer));
    assertEquals("0A0B", resultGenerator.getResult("3809", answer));
    assertEquals("0A0B", resultGenerator.getResult("0821", answer));
    assertEquals("0A0B", resultGenerator.getResult("8093", answer));
  }

  @Test
  public void shouldReturn0A1BWhen0NumberPositionMatchAnd1NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("0A1B", resultGenerator.getResult("7239", answer));
    assertEquals("0A1B", resultGenerator.getResult("6239", answer));
    assertEquals("0A1B", resultGenerator.getResult("4239", answer));
    assertEquals("0A1B", resultGenerator.getResult("0539", answer));
  }

  @Test
  public void shouldReturn0A2BWhen0NumberPositionMatchAnd2NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("0A2B", resultGenerator.getResult("7539", answer));
    assertEquals("0A2B", resultGenerator.getResult("6401", answer));
    assertEquals("0A2B", resultGenerator.getResult("9256", answer));
    assertEquals("0A2B", resultGenerator.getResult("4739", answer));
  }


  @Test
  public void shouldReturn0A3BWhen0NumberPositionMatchAnd3NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("0A3B", resultGenerator.getResult("7569", answer));
    assertEquals("0A3B", resultGenerator.getResult("4760", answer));
    assertEquals("0A3B", resultGenerator.getResult("4658", answer));
    assertEquals("0A3B", resultGenerator.getResult("0674", answer));
  }


  @Test
  public void shouldReturn0A4BWhen0NumberPositionMatchAnd4NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("0A4B", resultGenerator.getResult("4567", answer));
    assertEquals("0A4B", resultGenerator.getResult("4576", answer));
    assertEquals("0A4B", resultGenerator.getResult("7456", answer));
    assertEquals("0A4B", resultGenerator.getResult("6574", answer));
  }


}