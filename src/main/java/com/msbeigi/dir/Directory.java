package com.msbeigi.dir;

import com.msbeigi.extention.FileExtensionException;

public class Directory extends DirOps {

    public Directory(String name) {
        super(name);
    }

    @Override
    protected void create() {
        System.out.println("Create directory");
    }

    @Override
    public void opsCreationExtension(String fileName) throws FileExtensionException {}
}
