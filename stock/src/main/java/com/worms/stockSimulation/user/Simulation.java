package com.worms.stockSimulation.user;

import com.worms.stockSimulation.stock.service.StockService;
import com.worms.stockSimulation.user.service.UserService;

import java.util.Scanner;

public class Simulation {

    private static final UserService us = new UserService();
    private static final StockService ss = new StockService();

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
                case 1: us.findAllUsers();break;
                case 2: us.findUserBy(chooseUserId()); break;
                case 3: break;
                case 4: ss.findAllStocks();break;
                case 5: break;
                case 9:
                    System.out.println("프로그램을 종료하겠습니다!");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }

    private static String chooseUserId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾으시려는 회원의 아이디를 입력해주세요: ");
        return sc.nextLine();
    }
}
