package com.msbeigi.extention;

public class DeleteException extends Exception {
    @Override
    public String getMessage() {
        return "to delete a file or directory the name should be mentioned. like rm -filename.txt or rm director/";
    }
}
