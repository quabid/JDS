package com.gmail.quebed.datasaver;

import java.nio.file.Paths;

public class PathValidatorTests {
    public boolean pathExists(String path) {
        return Paths.get(path).toFile().exists();
    }
}
