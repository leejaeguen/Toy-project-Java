package com.worms.stockSimulation.user;

import com.worms.stockSimulation.stock.service.stockService;
import com.worms.stockSimulation.user.service.userService;

import java.util.Scanner;

public class Simulation {

    private static final userService us = new userService();
    private static final stockService st = new stockService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 주식 시뮬레이션 =====");
            System.out.println("1. 전체 회원 정보 조회");
            System.out.println("2. 특정 회원 정보 조회");
            System.out.println("3. 특정 회원 주식 거래");
            System.out.println("4. 주식 종목 조회");
            System.out.println("5. 특정 주식 거래 현황");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9: break;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }
}
