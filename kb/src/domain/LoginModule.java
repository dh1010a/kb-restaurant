package domain;

import java.util.Scanner;

public class LoginModule {
    private String id;
    private String pw;

    public void login() {
        System.out.println("로그인을 진행해주세요");
        Scanner scanner = new Scanner(System.in);
        System.out.print("id를 입력해주세요 : ");
        this.id = scanner.nextLine();
        System.out.print("password를 입력해주세요 : ");
        this.pw = scanner.nextLine();

        if (this.id.equals("root") && this.pw.equals("1234")) {
            System.out.println("로그인에 성공하였습니다");
        } else {
            System.out.println("로그인에 실패하였습니다 다시 진행해주세요");
        }
    }
}
