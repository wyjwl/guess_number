package com.tw.guessnumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GuessNumberTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


  @Mock
  private NumberGenerator numberGenerator;

  @InjectMocks
  private GuessNumber guessNumber;

  @Before
  public void setUp() {
    when(numberGenerator.getNumber()).thenReturn("1234");
    System.setOut(new PrintStream(outContent));
  }

  @Test
  public void shouldPrintWrongInputWhenInputisNotValid() {
    ByteArrayInputStream in = new ByteArrayInputStream("ad45\n1145\nad45\nad45\nad45\nad45\n".getBytes());
    System.setIn(in);

    guessNumber.startGame();

    assertEquals("wrong input, try again\n"
        + "wrong input, try again\n"
        + "wrong input, try again\n"
        + "wrong input, try again\n"
        + "wrong input, try again\n"
        + "wrong input, try again\n", outContent.toString());
  }

  @Test
  public void shouldPrintCorrectWhenInputIsCorrect() {
    ByteArrayInputStream in = new ByteArrayInputStream("1234\n".getBytes());
    System.setIn(in);

    guessNumber.startGame();

    assertEquals("1234 4A0B\n" + "win all correct\n", outContent.toString());
  }

  @Test
  public void shouldGameOverAfter6WrongTries() {
    ByteArrayInputStream in = new ByteArrayInputStream("1235\n2345\n3456\n4567\n5678\n6789\n".getBytes());
    System.setIn(in);

    guessNumber.startGame();

    assertEquals("1235 3A0B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "3456 0A2B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "3456 0A2B\n"
        + "4567 0A1B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "3456 0A2B\n"
        + "4567 0A1B\n"
        + "5678 0A0B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "3456 0A2B\n"
        + "4567 0A1B\n"
        + "5678 0A0B\n"
        + "6789 0A0B\n"
        + "game over\n"
        + "the number is: 1234\n", outContent.toString());

  }

  @Test
  public void shouldListAllGuessHistories() {
    ByteArrayInputStream in = new ByteArrayInputStream("1235\n2345\n3456\n4567\n5678\n1234\n".getBytes());
    System.setIn(in);

    guessNumber.startGame();

    assertEquals("1235 3A0B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "3456 0A2B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "3456 0A2B\n"
        + "4567 0A1B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "3456 0A2B\n"
        + "4567 0A1B\n"
        + "5678 0A0B\n"
        + "1235 3A0B\n"
        + "2345 0A3B\n"
        + "3456 0A2B\n"
        + "4567 0A1B\n"
        + "5678 0A0B\n"
        + "1234 4A0B\n"
        + "win all correct\n", outContent.toString());
  }
}