package com.msbeigi.dir;

import com.msbeigi.extention.FileExtensionException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class File extends DirOps {

    public File(String name) {
        super(name);
    }

    @Override
    protected void create() {
        System.out.println("Create file");
    }

    @Override
    public void opsCreationExtension(String fileName) throws FileExtensionException {
        final Pattern pattern = Pattern.compile("[A-Za-z]+\\.[A-Za-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(fileName);
        if (!matcher.matches()) {
            throw new FileExtensionException();
        }
        this.setName(fileName);
    }
}
