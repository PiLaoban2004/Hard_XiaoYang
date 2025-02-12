package com.yzx.MyExtends.work;

public class Test {
    public static void main(String[] args) {
        Lecture l=new Lecture("001","张三","讲师");
        System.out.println(l.getId()+", "+l.getName()+l.getResponsibility());
        l.work();

        Tutor t=new Tutor("002","李四","助教");
        System.out.println(t.getId()+", "+t.getName()+t.getResponsibility());
        t.work();

        Maintainer m=new Maintainer("003","赵五","维护专员");
        System.out.println(m.getId()+", "+m.getName()+m.getResponsibility());
        m.work();

        Buyer b=new Buyer("004","六六","采购专员");
        System.out.println(b.getId()+", "+b.getName()+b.getResponsibility());
        b.work();

    }
}
