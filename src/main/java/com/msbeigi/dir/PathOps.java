package com.msbeigi.dir;

import java.util.ArrayList;
import java.util.List;

public abstract class PathOps {
    public static List<String> PATH = new ArrayList<>();
    protected DirOps dirOps;

    public static void currentPath() {
        if (!PATH.isEmpty()) {
            for (int i = 0; i < PATH.size(); i++) {
                System.out.printf("%s\n", PATH.get(i));
            }
        } else System.out.println("./");
    }

}
