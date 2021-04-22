package com.gmail.quebed.datasaver;

import java.io.PrintStream;

public class TestsCleaner {
    final static MyConstantsTests constants = new MyConstantsTests();
    final static PathValidatorTests pathValidator = new PathValidatorTests();
    final static PathRemoverTests pathRemover = new PathRemoverTests();
    final static PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {
        if (pathValidator.pathExists(constants.cleanupSerializedPath)) {
            printer.println("\nAbout to delete file " + constants.cleanupSerializedPath + ".");
            pathRemover.removePath(constants.cleanupSerializedPath);
            printer.println("File " + constants.cleanupSerializedPath + " deleted.");
        }

        if (pathValidator.pathExists(constants.cleanupTest1Path)) {
            printer.println("\n");
            printer.println("About to delete file " + constants.cleanupTest1Path + ".");
            pathRemover.removePath(constants.cleanupTest1Path);
            printer.println("File " + constants.cleanupTest1Path + " deleted.");
        }
    }
}
