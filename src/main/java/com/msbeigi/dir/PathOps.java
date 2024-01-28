package com.msbeigi.dir;

import java.util.ArrayList;
import java.util.List;

public abstract class PathOps {
    public static List<String> path = new ArrayList<>();
    protected DirOps dirOps;

    public static void currentPath() {
        if (!path.isEmpty()) {
            for (int i = 0; i < path.size(); i++) {
                System.out.printf("%s\n", path.get(i));
            }
        } else System.out.println("./");
    }

}
