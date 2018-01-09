package com.finrarepositories;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;

@Repository
public interface FileRepository{

    /**
     * Writes stream of file on to disk with provided name.
     * @param fileName full path + filename of file.
     * @param in InputStream of file.
     * @param isLarge boolean flag set true if file size > 2GB
     * @throws IOException
     */
    public void writeFile(String s , File f) throws IOException;
    
}