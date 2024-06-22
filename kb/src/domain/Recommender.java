package domain;

import java.util.Random;

public class Recommender {
    Menu[] menuList;

    public Recommender(Menu[] menuList) {
        this.menuList = menuList;
    }

    public Menu[] recommendMenu() {
        Random random = new Random();
        Menu[] recoMenu = new Menu[10];
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(menuList.length);
            recoMenu[i] = menuList[x];
        }
        return recoMenu;
    }
}

