package com.company;

import java.util.Scanner;
import java.util.Random;

public class canExam {

    static boolean isGoodStudent (int lessonsDone, int lessonsAttended){
        double frequency = lessonsAttended/lessonsDone;
        return frequency>0.75;
    }

    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        int attended = input.nextInt();
        int done = input.nextInt();
        System.out.println(isGoodStudent(attended,done));
    }
}
