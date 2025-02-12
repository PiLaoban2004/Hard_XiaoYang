package com.yzx.MyExtends.work;

public class Lecture extends Teacher{
    public Lecture() {
    }

    public Lecture(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    @Override
    public void work() {
        System.out.println("负责讲课");
    }
}
