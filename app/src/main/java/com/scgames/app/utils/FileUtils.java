package com.scgames.app.utils;


import com.google.common.io.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by guyk on 8/13/14.
 */
public class FileUtils {

    private void writeFile(final String fileName, final String contents) {
        final File newFile = new File(fileName);
        try {
            Files.write(contents.getBytes(), newFile);
        } catch (IOException fileIoEx) {
            //add logger
        }
    }
}

