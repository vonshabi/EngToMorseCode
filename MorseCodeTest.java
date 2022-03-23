package MorseCode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseCodeTest {
    @Test
    public void TestEngToMorse() {
        //Arrange
        MorseCodeMap map = new MorseCodeMap();
        //Act
        String expected = map.EngToMorse("e");
        //Assert
        assertEquals(".", expected);
    }

    @Test
    public void TestEngToMorseBigLetters() {
        //Arrange
        MorseCodeMap map = new MorseCodeMap();
        //Act
        String expected = map.EngToMorse("E");
        //Assert
        assertEquals(".", expected);
    }

    @Test
    public void TestEngToMorseThreeLetters() {
        //Arrange
        MorseCodeMap map = new MorseCodeMap();
        //Act
        String expected = map.EngToMorse("E E E");
        //Assert
        assertEquals(". . .", expected);
    }

    @Test
    public void TestMorseToEng() {
        //Arrange
        MorseCodeMap map = new MorseCodeMap();
        //Act
        String expected = map.MorseToEng(".");
        //Assert
        assertEquals("E", expected);
    }
}
