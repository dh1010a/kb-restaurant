package domain;

import java.util.Scanner;

public class Employer {

    public Order getOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String order = sc.nextLine();

        String[] orderList = order.split(",");
        for (String menu : orderList) {
            String[] menuInfo = menu.split("-");
            String menuName = menuInfo[0];
            int menuCount = Integer.parseInt(menuInfo[1]);
            System.out.println(menuName + " " + menuCount + "개 주문하셨습니다.");
        }

        return;
    }
}
