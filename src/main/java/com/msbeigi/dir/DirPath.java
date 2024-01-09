package com.msbeigi.dir;

public class DirPath extends PathOps {

    public static void appendCommand(DirOps dirOps) {
        PATH.add(dirOps.getName() + "/");
    }
}
