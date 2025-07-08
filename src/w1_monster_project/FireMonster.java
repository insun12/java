package w1_monster_project;

import w1_monster_project.FireMonster;

public class FireMonster extends Monster {
    private int fireSkillDamage;

    public FireMonster(String name, int hp, int attack, int defense, int fireSkillDamage) {
        super(name, hp, attack, defense);
        this.fireSkillDamage = fireSkillDamage;
    }

    public int getFireSkillDamage() {
        return fireSkillDamage;
    }

    public void setFireSkillDamage(int fireSkillDamage) {
        this.fireSkillDamage = fireSkillDamage;
    }

    @Override
    public void info() {
        super.info(); // 부모 클래스의 info 출력
        System.out.println(" - 불속성 스킬 데미지: " + fireSkillDamage);
    }
    
}