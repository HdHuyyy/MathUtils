
package com.mathutils;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void testFilePath() {
        FileManager manager = new FileManager();

        String path = manager.getFilePath(
                "data", "test.txt");

        String expected = Paths.get(
                "data", "test.txt").toString();

        assertEquals(expected, path);
    }
}
