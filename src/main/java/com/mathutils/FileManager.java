
package com.mathutils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    public String getFilePath(String folder, String filename) {
        Path path = Paths.get(folder, filename);
        return path.toString();
    }
}
