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
    assertEquals("0A3B", resultGenerator.getResult("6458", answer));
    assertEquals("0A3B", resultGenerator.getResult("6074", answer));
  }

  @Test
  public void shouldReturn0A4BWhen0NumberPositionMatchAnd4NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("0A4B", resultGenerator.getResult("4576", answer));
    assertEquals("0A4B", resultGenerator.getResult("4576", answer));
    assertEquals("0A4B", resultGenerator.getResult("7456", answer));
    assertEquals("0A4B", resultGenerator.getResult("6574", answer));
  }

  @Test
  public void shouldReturn1A0BWhen1NumberPositionMatchAnd0NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("1A0B", resultGenerator.getResult("5981", answer));
    assertEquals("1A0B", resultGenerator.getResult("9681", answer));
    assertEquals("1A0B", resultGenerator.getResult("8940", answer));
    assertEquals("1A0B", resultGenerator.getResult("3217", answer));
  }

  @Test
  public void shouldReturn1A1BWhen1NumberPositionMatchAnd1NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("1A1B", resultGenerator.getResult("5986", answer));
    assertEquals("1A1B", resultGenerator.getResult("0651", answer));
    assertEquals("1A1B", resultGenerator.getResult("8549", answer));
    assertEquals("1A1B", resultGenerator.getResult("4017", answer));
  }

  @Test
  public void shouldReturn1A2BWhen1NumberPositionMatchAnd2NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("1A2B", resultGenerator.getResult("5469", answer));
    assertEquals("1A2B", resultGenerator.getResult("4658", answer));
    assertEquals("1A2B", resultGenerator.getResult("6540", answer));
    assertEquals("1A2B", resultGenerator.getResult("6427", answer));
  }

  @Test
  public void shouldReturn1A3BWhen1NumberPositionMatchAnd3NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("1A3B", resultGenerator.getResult("5764", answer));
    assertEquals("1A3B", resultGenerator.getResult("7654", answer));
    assertEquals("1A3B", resultGenerator.getResult("7546", answer));
    assertEquals("1A3B", resultGenerator.getResult("4567", answer));
  }

  @Test
  public void shouldReturn2A0BWhen2NumberPositionMatchAnd0NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("2A0B", resultGenerator.getResult("5690", answer));
    assertEquals("2A0B", resultGenerator.getResult("1642", answer));
    assertEquals("2A0B", resultGenerator.getResult("3847", answer));
    assertEquals("2A0B", resultGenerator.getResult("5297", answer));
  }

  @Test
  public void shouldReturn2A1BWhen2NumberPositionMatchAnd1NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("2A1B", resultGenerator.getResult("5679", answer));
    assertEquals("2A1B", resultGenerator.getResult("0645", answer));
    assertEquals("2A1B", resultGenerator.getResult("6847", answer));
    assertEquals("2A1B", resultGenerator.getResult("5437", answer));
  }

  @Test
  public void shouldReturn2A2BWhen2NumberPositionMatchAnd2NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("2A2B", resultGenerator.getResult("5674", answer));
    assertEquals("2A2B", resultGenerator.getResult("5746", answer));
    assertEquals("2A2B", resultGenerator.getResult("7645", answer));
    assertEquals("2A2B", resultGenerator.getResult("6547", answer));
  }

  @Test
  public void shouldReturn3A0BWhen3NumberPositionMatchAnd0NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("3A0B", resultGenerator.getResult("5640", answer));
    assertEquals("3A0B", resultGenerator.getResult("5697", answer));
    assertEquals("3A0B", resultGenerator.getResult("5847", answer));
    assertEquals("3A0B", resultGenerator.getResult("1647", answer));
  }

  @Test
  public void shouldReturn4A0BWhen4NumberPositionMatchAnd0NumberMatchPositionNotMatch() {
    ResultGenerator resultGenerator = new ResultGenerator();
    assertEquals("4A0B", resultGenerator.getResult("5647", answer));
  }

}