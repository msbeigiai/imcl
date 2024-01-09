package com.msbeigi.dir;

import com.msbeigi.extention.FileExtensionException;
import com.msbeigi.extention.FileOrDirNotExistException;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandFactory extends CommandOps implements Command {

    private final String userCommand;

    public CommandFactory(String userCommand) {
        this.userCommand = userCommand;
    }

    @Override
    public void execute() {
        StringTokenizer stringTokenizer = new StringTokenizer(userCommand);
        String command = stringTokenizer.nextToken();
        String name = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
        switch (command) {
            case MKDIR -> {
                Directory directory = new Directory(name);
                DirPath.appendCommand(directory);
                DirPath.currentPath();
            }

            case TOUCH -> {
                try {
                    File file = new File(name);
                    file.opsCreationExtension(name);
                    FilePath.appendCommand(file);
                } catch (FileExtensionException e) {
                    System.out.println(e.getMessage());
                }
                DirPath.currentPath();
            }

            case DELETE -> {
                try {
                    DeleteOps.deleteExecute(name);
                } catch (FileOrDirNotExistException e) {
                    System.out.println(e.getMessage());
                }
                DirPath.currentPath();
            }

            case LS -> {
                DirPath.currentPath();
            }
        }
    }

    @Override
    public String fileCreationExtension(final String fileName) throws FileExtensionException {
        final Pattern pattern = Pattern.compile("[A-Za-z]+\\.[A-Za-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(fileName);
        if (!matcher.matches()) {
            throw new FileExtensionException();
        }
        return fileName;
    }
}
