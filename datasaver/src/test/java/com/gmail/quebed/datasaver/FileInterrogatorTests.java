package com.gmail.quebed.datasaver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

public class FileInterrogatorTests {
    private final PathValidatorTests pathValidator = new PathValidatorTests();

    public FileInterrogatorTests() {
        super();
    }

    public final boolean isDirectory(String path) {
        if (pathValidator.pathExists(path)) {
            return Files.isDirectory(Paths.get(path), LinkOption.NOFOLLOW_LINKS);
        }
        return false;
    }

    public final boolean isRegularFile(String path) {
        if (pathValidator.pathExists(path)) {
            return Files.isRegularFile(Paths.get(path), LinkOption.NOFOLLOW_LINKS);
        }
        return false;
    }

    public final boolean isExecutable(String path) {
        if (pathValidator.pathExists(path)) {
            return Files.isExecutable(Paths.get(path));
        }
        return false;
    }

    public final boolean isHidden(String path) throws IOException {
        if (pathValidator.pathExists(path)) {
            return Files.isHidden(Paths.get(path));
        }
        return false;
    }

    public final boolean isReadable(String path) throws IOException {
        if (pathValidator.pathExists(path)) {
            return Files.isReadable(Paths.get(path));
        }
        return false;
    }

    public final boolean isSymbolicLink(String path) throws IOException {
        if (pathValidator.pathExists(path)) {
            return Files.isSymbolicLink(Paths.get(path));
        }
        return false;
    }

    public final boolean isWritable(String path) throws IOException {
        if (pathValidator.pathExists(path)) {
            return Files.isWritable(Paths.get(path));
        }
        return false;
    }

}
