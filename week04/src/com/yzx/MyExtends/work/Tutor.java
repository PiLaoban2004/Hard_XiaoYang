package com.yzx.MyExtends.work;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    @Override
    public void work() {
        System.out.println("协助教学");
    }
}
