package com.gmail.quebed.datasaver;

import java.nio.file.Paths;

public class PathRemoverTests {
    PathValidatorTests pathValidator = new PathValidatorTests();

    public PathRemoverTests() {
        super();
    }

    public final boolean removePath(String path) {
        if (pathValidator.pathExists(path)) {
            return Paths.get(path).toFile().delete();
        }
        return false;
    }
}