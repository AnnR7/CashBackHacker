package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

        @Test
        public void shouldCashbackHack(){

            CashbackHackService service = new CashbackHackService();
            int amount = 500;

            int actual = service.remain(amount);
            int expected = 500;

            assertEquals(actual, expected);
        }

        @Test
        public void shouldCashbackHackNearLowBoundary(){

            CashbackHackService service = new CashbackHackService();
            int amount = 999;

            int actual = service.remain(amount);
            int expected = 1;

            assertEquals(actual, expected);
        }

        @Test
        public void shouldCashbackHackNearHiBoundary(){

            CashbackHackService service = new CashbackHackService();
            int amount = 1_001;

            int actual = service.remain(amount);
            int expected = 999;

            assertEquals(actual, expected);
        }

        @Test
        public void shouldCashbackHackEqualsBoundary(){

            CashbackHackService service = new CashbackHackService();
            int amount = 1_000;

            int actual = service.remain(amount);
            int expected = 0;

            assertEquals(actual, expected);
        }

    }
