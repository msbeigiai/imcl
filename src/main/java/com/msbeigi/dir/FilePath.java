package com.msbeigi.dir;

public class FilePath extends PathOps {
    DirOps dirOps;

    public FilePath(DirOps dirOps) {
        this.dirOps = dirOps;
    }

    public static void appendCommand(DirOps dirOps) {
        path.add(dirOps.getName());
    }
}
