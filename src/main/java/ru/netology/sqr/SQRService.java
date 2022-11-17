package ru.netology.sqr;

public class SQRService {

    public int squareQuantity(int envelopeStart, int envelopeEnd) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= envelopeStart) {
                if (i * i <= envelopeEnd) {
                    quantity = quantity +1;
                } else {
                    break;
                }
            }
        }
        return quantity;
    }
}
