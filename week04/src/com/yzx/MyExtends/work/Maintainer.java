package com.yzx.MyExtends.work;

public class Maintainer extends AdminStaff{

    public Maintainer() {
    }

    public Maintainer(String id, String name, String responsibility) {
        super(id, name, responsibility);
    }

    @Override
    public void work() {
        System.out.println("负责维护");
    }
}
