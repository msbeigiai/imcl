package com.msbeigi.dir;

public abstract class DirOps {
    private String name;

    protected abstract void create();

    public DirOps(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
