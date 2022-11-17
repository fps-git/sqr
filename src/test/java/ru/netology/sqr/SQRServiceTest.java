package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/testdata.csv")
    public void autoTestWithCsvData(int envelopeStart, int envelopeEnd, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareQuantity(envelopeStart, envelopeEnd);
        Assertions.assertEquals(expected, actual);
    }
}
