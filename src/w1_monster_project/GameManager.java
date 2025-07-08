import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
    public static void main(String[] args) {

        Monster monster0 = new Monster("슬라임", 30, 8, 5);
        Monster monster1 = new Monster("고블린", 50, 12, 4);
        Monster monster2 = new Monster("오크", 80, 15, 7);
        Monster monster3 = new Monster("스켈레톤", 60, 14, 10);
        Monster monster4 = new Monster("트롤", 120, 18, 6);
        Monster monster5 = new Monster("골렘", 100, 20, 25);
        Monster monster6 = new Monster("와이번", 150, 25, 15);
        Monster monster7 = new Monster("리치", 130, 35, 12);
        Monster monster8 = new Monster("키메라", 200, 30, 20);
        Monster monster9 = new Monster("드래곤", 300, 40, 30);
        Monster monster10 = new Monster("이프리트", 140, 22, 18);

        ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(new Monster("슬라임", 30, 8, 5));
        monsterList.add(new Monster("고블린", 50, 12, 4));
        monsterList.add(new Monster("오크", 80, 15, 7));
        monsterList.add(new Monster("스켈레톤", 60, 14, 10));
        monsterList.add(new Monster("트롤", 120, 18, 6));
        monsterList.add(new Monster("골렘", 100, 20, 25));
        monsterList.add(new Monster("와이번", 150, 25, 15));
        monsterList.add(new Monster("리치", 130, 35, 12));
        monsterList.add(new Monster("키메라", 200, 30, 20));
        monsterList.add(new Monster("드래곤", 300, 40, 30));

        for (int i = 0; i < monsterList.size(); i++) {
            System.out.print(i + ": ");
            monsterList.get(i).info();
        }

        Scanner num = new Scanner(System.in);

        System.out.print("첫 번째 몬스터 번호: ");
        int first = num.nextInt();
        System.out.print("두 번째 몬스터 번호: ");
        int second = num.nextInt();

        Monster firstMonster = monsterList.get(first);
        Monster secondMonster = monsterList.get(second);

        while (firstMonster.getHp() > 0 && secondMonster.getHp() > 0) {
            int damage = firstMonster.getAttack() - secondMonster.getDefense();
            if (damage < 0)
                damage = 0;
            secondMonster.setHp(secondMonster.getHp() - damage);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(firstMonster.getName() + "->" + secondMonster.getName() + " " + secondMonster.getHp());


            if (secondMonster.getHp() <= 0) {
                break;
            }

            damage = secondMonster.getAttack() - firstMonster.getDefense();
            if (damage < 0)
                damage = 0;
            firstMonster.setHp(firstMonster.getHp() - damage);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(secondMonster.getName() + "->" + firstMonster.getName() + " " + firstMonster.getHp());
        }

        if (firstMonster.getHp() > 0) {
            System.out.println(firstMonster.getName() + " " + "승리");
        } else {
            System.out.println(secondMonster.getName() + " " + "승리");
        }
    }
}