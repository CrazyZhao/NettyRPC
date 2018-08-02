package com.zbl.nettyrpc.dao.entity;

public class Student {

    private Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Student)obj).id ? true : false;
    }
}
