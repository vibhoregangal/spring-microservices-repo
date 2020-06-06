package org.example.bean;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "today is your lucky day.";
    }
}