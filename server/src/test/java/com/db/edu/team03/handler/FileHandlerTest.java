package com.db.edu.team03.handler;

import com.db.edu.team03.server.handler.FileHandler;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.io.File;


public class FileHandlerTest {
    File file = mock(File.class);
    FileHandler fileHandler = new FileHandler(file);

    @Test
    public void shouldReadHistoryFromFile() {
    }
}
