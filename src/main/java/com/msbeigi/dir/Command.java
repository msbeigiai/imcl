package com.msbeigi.dir;

import com.msbeigi.exceptions.FileExtensionException;

public interface Command {
    void execute();
    String fileCreationExtension(final String fileName) throws FileExtensionException;
}
