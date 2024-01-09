package com.msbeigi.extention;

public class FileExtensionException extends Exception {

    @Override
    public String getMessage() {
        return "file creation needs to have file extension: like .txt";
    }
}
