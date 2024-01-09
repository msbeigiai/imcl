package com.msbeigi.dir;

import com.msbeigi.extention.FileOrDirNotExistException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteOps extends PathOps {
    private static String operator;

    public static void deleteExecute(String commandOps) throws FileOrDirNotExistException {
        Pattern filePattern = Pattern.compile("-[A-Za-z]+\\.[A-Za-z]+", Pattern.CASE_INSENSITIVE);
        Pattern dirPattern = Pattern.compile("[A-Za-z]+", Pattern.CASE_INSENSITIVE);
        Matcher fileMatcher = filePattern.matcher(commandOps);
        Matcher dirMatcher = dirPattern.matcher(commandOps);

        if (fileMatcher.matches()) {
            operator = commandOps.replaceAll("-", "");
        } else if (dirMatcher.matches())
            operator = commandOps + "/";
        if (!PATH.contains(operator)) {
            throw new FileOrDirNotExistException();
        }

        PATH.remove(operator);
    }
}
