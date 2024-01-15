package com.msbeigi.dir;

import com.msbeigi.exceptions.CommandNotAssignedException;
import com.msbeigi.exceptions.FileExtensionException;

public interface Command {
    void execute() throws CommandNotAssignedException;
}
