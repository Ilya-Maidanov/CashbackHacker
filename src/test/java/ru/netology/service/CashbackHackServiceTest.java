package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldPositiveBuy() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;

        org.junit.Assert.assertEquals(service.remain(amount), 500);

    }
    @org.junit.Test
    public void shouldBuyZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        org.junit.Assert.assertEquals(service.remain(amount), 1_000);

    }
    @org.junit.Test
    public void shouldBuyLimit() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_000;

        org.junit.Assert.assertEquals(service.remain(amount), 0);

    }
    @org.junit.Test
    public void shouldBuyMin() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        org.junit.Assert.assertEquals(service.remain(amount), 999);

    }
    @org.junit.Test
    public void shouldBuyMax() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        org.junit.Assert.assertEquals(service.remain(amount), 1);

    }
    @org.junit.Test
    public void shouldBuyOverThousand() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1_001;

        org.junit.Assert.assertEquals(service.remain(amount), 999);

    }


}