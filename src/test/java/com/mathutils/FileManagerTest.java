
package com.mathutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void testFilePath() {
        FileManager manager = new FileManager();

        String path = manager.getFilePath(
                "data", "test.txt");

        assertEquals("data\\test.txt", path);
    }
}
