package com.gmail.quebed.datasaver.core.constants;

import java.nio.file.FileSystems;

public class MyConstants {
    public final String OS = System.getProperty("os.name").toLowerCase();
    public final String OS_ARCH = System.getProperty("os.arch").toLowerCase();
    public final String OS_VERSION = System.getProperty("os.version").toLowerCase();
    public final String FILESEPARATOR = FileSystems.getDefault().getSeparator();
    public final String LINESEPARATOR = System.getProperty("line.separator");
    public final String USRDIR = System.getProperty("user.dir") + FILESEPARATOR;
    public final String USRHOME = System.getProperty("user.home") + FILESEPARATOR;
    public final String destinationPath = USRDIR + "serialized.ser";
}
