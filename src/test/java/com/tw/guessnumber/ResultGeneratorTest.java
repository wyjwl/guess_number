package com.tw.guessnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResultGeneratorTest {

  private String answer = "5647";

  @Test
  public void shouldReturn0A0BWhenNoNumberPositionMatchAndNoNumberMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("0A0B", resultGenerator.getResult("1239", answer));
    assertEquals("0A0B", resultGenerator.getResult("3809", answer));
    assertEquals("0A0B", resultGenerator.getResult("0821", answer));
    assertEquals("0A0B", resultGenerator.getResult("8093", answer));
  }

  @Test
  public void shouldReturn0A1BWhenNoNumberPositionMatchAnd1NumberMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("0A1B", resultGenerator.getResult("7239", answer));
    assertEquals("0A1B", resultGenerator.getResult("6239", answer));
    assertEquals("0A1B", resultGenerator.getResult("4239", answer));
    assertEquals("0A1B", resultGenerator.getResult("0539", answer));
  }
}