package com.msbeigi.dir;

public class File extends DirOps {

    public File(String name) {
        super(name);
    }

    @Override
    protected void create() {
        System.out.println("Create file");
    }
}
