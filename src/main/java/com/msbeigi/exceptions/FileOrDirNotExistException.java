package com.msbeigi.exceptions;

public class FileOrDirNotExistException extends Exception {
    @Override
    public String getMessage() {
        return "File or directory you are deleting is not exists.";
    }
}
