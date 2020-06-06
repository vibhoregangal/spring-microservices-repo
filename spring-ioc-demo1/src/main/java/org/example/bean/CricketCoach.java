package org.example.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "practice spin bowling today.";
    }


    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}