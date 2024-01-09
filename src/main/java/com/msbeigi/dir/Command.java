package com.msbeigi.dir;

import com.msbeigi.extention.FileExtensionException;

public interface Command {
    void execute();
    String fileCreationExtension(final String fileName) throws FileExtensionException;
}
