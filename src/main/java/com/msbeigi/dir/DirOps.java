package com.msbeigi.dir;

import com.msbeigi.extention.FileExtensionException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public abstract void opsCreationExtension(final String fileName) throws FileExtensionException;
}
