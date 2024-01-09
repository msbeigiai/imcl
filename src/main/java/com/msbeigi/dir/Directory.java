package com.msbeigi.dir;

public class Directory extends DirOps {

    public Directory(String name) {
        super(name);
    }

    @Override
    protected void create() {
        System.out.println("Create directory");
    }
}
