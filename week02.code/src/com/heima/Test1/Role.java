package com.heima.Test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    public void attack(Role role) {
        //计算造成的伤害1~20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //修改一下挨揍人的血量
        int remainBoold = role.getBlood() - hurt;
        //对于剩余血量做一个验证，如果为负数了，就修改为0
        remainBoold=remainBoold<0?0:remainBoold;
        //修改一下挨揍人的血量
        role.setBlood(remainBoold);

        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "伤害，"+role.getName()+"还剩下了"+remainBoold+"点血");
    }
}
