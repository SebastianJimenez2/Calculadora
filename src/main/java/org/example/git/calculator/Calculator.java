package org.example.git.calculator;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Calculator {
    private int answer;

    public int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public int division(int a, int b) {
        return a / b;
    }

    public void timeOut(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getAnswer() {
        return this.answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }


}
