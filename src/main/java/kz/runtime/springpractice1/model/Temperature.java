package kz.runtime.springpractice1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Temperature {
    private double value;
    String convertTo;
}