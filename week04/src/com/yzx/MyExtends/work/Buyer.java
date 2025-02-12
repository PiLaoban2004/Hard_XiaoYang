package com.yzx.MyExtends.work;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    @Override
    public void work() {
        System.out.println("负责采购");
    }
}
