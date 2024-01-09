package com.msbeigi.dir;

public class FilePath extends PathOps {
    public static void appendCommand(DirOps dirOps) {
        PATH.add(dirOps.getName());
    }
}
