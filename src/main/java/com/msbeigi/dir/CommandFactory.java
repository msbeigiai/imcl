package com.msbeigi.dir;

import com.msbeigi.exceptions.CommandNotAssignedException;
import com.msbeigi.exceptions.FileExtensionException;
import com.msbeigi.exceptions.FileOrDirNotExistException;

import java.util.StringTokenizer;

public class CommandFactory extends CommandOps implements Command {

    private final String userCommand;

    public CommandFactory(String userCommand) {
        this.userCommand = userCommand;
    }

    @Override
    public void execute() throws CommandNotAssignedException {
        StringTokenizer stringTokenizer = new StringTokenizer(userCommand);
        String command = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
        String name = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";

        if (command != null && !command.isEmpty()) {
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

                default -> throw new CommandNotAssignedException(command);

            }
        }
    }
}
