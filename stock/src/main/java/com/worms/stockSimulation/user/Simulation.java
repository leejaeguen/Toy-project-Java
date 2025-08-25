package com.worms.stockSimulation.user;

import com.worms.stockSimulation.stock.aggregate.Stock;
import com.worms.stockSimulation.stock.service.StockService;
import com.worms.stockSimulation.user.aggregate.User;
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
                case 3:
                    User selectUser = us.findUserForTraiding(chooseUserId());
                    pickTradingOption(selectUser);
                    break;
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

    private static String chooseStockName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("구매하시려는 주식의 이름을 입력해주세요: ");
        return sc.nextLine();
    }

    private static Object pickTradingOption(User selectUser) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("====== 거래 선택 ======");
            System.out.println("1. 모든 주식 현재가 조회");
            System.out.println("2. 특정 주식 매수 신청");
            System.out.println("3. 특정 주식 매도 신청");
            System.out.println("9. 메인화면으로 돌아가기");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ss.findAllStocks();
                    break;
                case 2:
                    Stock selectStock = ss.findStockForTrading(chooseStockName());
                    ss.applyBuyStock(selectBuyPrice(selectStock));
                    break;
                case 3:
                    Stock selectStock2 = ss.findStockForTrading(chooseStockName());
                    ss.applySellStock(selectSellPrice(selectStock2));
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    flag = false;
                    break;
                default:
                    System.out.println("번호를 제대로 입력해주세요!");
            }
        }
        return selectUser;
    }

    private static void selectSellPrice(Stock selectStock2) {

        /* 설명. 희망하는 매수 금액을 입력하면 카피된 stock정보의 매수최대금액을 변경 */
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 최대 매수 금액은 " + selectStock2.getMaxStockPrice());
        System.out.print("희망하는 매수 금액을 입력해주세요: ");
        int result = sc.nextInt();
        if (result == selectStock2.getStockPrice()){
            selectStock2.setStockPrice(result);
        } else if (result < selectStock2.getStockPrice()){
            selectStock2.setMaxStockPrice(result);
        } else {
            System.out.println("현재가보다 낮은 금액을 입력해주세요!");
        }
    }

    private static void selectBuyPrice(Stock selectStock) {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 최대 매도 금액은 " +  selectStock.getMinStockPrice());
        System.out.print("희망하는 매도 금액을 입력해주세요: ");
        int result = sc.nextInt();
        if (result == selectStock.getMinStockPrice()){
            selectStock.setMinStockPrice(result);
        } else if (result > selectStock.getMinStockPrice()){
            selectStock.setMinStockPrice(result);
        } else {
            System.out.println("현재가보다 낮은 금액을 입력해주세요!");
        }

    }
}
