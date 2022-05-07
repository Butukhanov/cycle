package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    public void test() {
        SQRService service = new SQRService();
        int actual = service.squreCount(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }
}