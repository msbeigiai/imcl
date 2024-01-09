package com.msbeigi.dir;

import com.msbeigi.extention.FileExtensionException;

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
            }

            case TOUCH -> {
                try {
                    String matchedFileName = fileCreationExtension(name);
                    File file = new File(matchedFileName);
                    FilePath.appendCommand(file);
                } catch (FileExtensionException e) {
                    System.out.println(e.getMessage());
                }
            }

            case DELETE -> {

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
