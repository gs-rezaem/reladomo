/*
  Copyright 2016 Goldman Sachs.
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing,
  software distributed under the License is distributed on an
  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  KIND, either express or implied.  See the License for the
  specific language governing permissions and limitations
  under the License.
 */

package com.gs.fw.common.mithra.generator.filesystem;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class PlainFile implements FauxFile
{
    private Path path;

    public PlainFile(String path)
    {
        this.path = FileSystems.getDefault().getPath(path);
    }

    public PlainFile(PlainFile parent, String path)
    {
        this.path = parent.path.resolve(path);
    }

    @Override
    public boolean exists()
    {
        return Files.exists(this.path);
    }

    @Override
    public String getName()
    {
        return this.path.getName(this.path.getNameCount() - 1).toString();
    }

    @Override
    public boolean mkdirs()
    {
        try
        {
            return recursiveMkdirs(this.path);
        }
        catch (IOException e)
        {
            throw new RuntimeException("Could not create directory "+this.path.toString(), e);
        }
    }

    private static boolean recursiveMkdirs(Path p) throws IOException
    {
        if (p != null && !Files.exists(p))
        {
            recursiveMkdirs(p.getParent());
            Files.createDirectories(p);
            return true;
        }
        return false;
    }

    @Override
    public long length()
    {
        try
        {
            return Files.size(this.path);
        }
        catch (IOException e)
        {
            throw new RuntimeException("Could not get size of file "+this.path.toString(), e);
        }
    }

    @Override
    public boolean canWrite()
    {
        return Files.isWritable(this.path);
    }

    @Override
    public boolean isDirectory()
    {
        return Files.isDirectory(this.path);
    }

    @Override
    public OutputStream newFileOutputStream() throws IOException
    {
        return Files.newOutputStream(this.path);
    }

    @Override
    public InputStream newFileInputStream() throws FileNotFoundException
    {
        try
        {
            return Files.newInputStream(this.path);
        }
        catch(FileNotFoundException e)
        {
            throw e;
        }
        catch (IOException e)
        {
            throw new RuntimeException("Could not open file for reading "+path.toString(), e);
        }
    }

    @Override
    public String getParent()
    {
        return pathToString(this.path.getParent());
    }

    private static String pathToString(Path path)
    {
        int nameCount = path.getNameCount();
        String result = path.getRoot() != null ? path.getRoot().toString() : "";
        if (nameCount > 0)
        {
            result += path.getName(0).toString();
        }
        for(int i=1;i<nameCount;i++)
        {
            result += File.separator+path.getName(i).toString();
        }
        return result;
    }

    @Override
    public String getPath()
    {
        return pathToString(this.path);
    }
}
