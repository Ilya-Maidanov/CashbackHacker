package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldPositiveBuy() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;

        org.testng.Assert.assertEquals(service.remain(amount), 500);

    }
    @org.testng.annotations.Test
    public void shouldBuyZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        org.testng.Assert.assertEquals(service.remain(amount), 1_000);

    }
    @org.testng.annotations.Test
    public void shouldBuyLimit() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;

        org.testng.Assert.assertEquals(service.remain(amount), 0);

    }
    @org.testng.annotations.Test
    public void shouldBuyMin() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        org.testng.Assert.assertEquals(service.remain(amount), 999);

    }
    @org.testng.annotations.Test
    public void shouldBuyMax() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        org.testng.Assert.assertEquals(service.remain(amount), 1);

    }
    @org.testng.annotations.Test
    public void shouldBuyOverThousand() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_001;

        org.testng.Assert.assertEquals(service.remain(amount), 999);

    }


}