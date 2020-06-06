package org.example.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BasketBallCoach implements Coach {
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "practice back volley today.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}