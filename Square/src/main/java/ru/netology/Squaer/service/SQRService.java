package ru.netology.Squaer.service;
public class SQRService {
    public int counter(int lowerNumber, int upperNumber, int minLimit, int maxLimit) {
        int counter = 0;
        for (int i = lowerNumber; i <= upperNumber; i++) {
            if (minLimit <= i * i && i * i <= maxLimit) {
            }
        }
        return counter;
    }
}