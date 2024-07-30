package org.feature.memoryapi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertTrue;

@ExtendWith(MockitoExtension.class)
public class MemoryMappedFileTest {

    public static String data;

    @Before
    public void setup(){
        data =  "Hello, Memory-Mapped File!";
    }

    @Test
    public void memoryAPIImplementation(){
        Assert.assertTrue(MemoryMappedFile.implementation(data),true);
    }

}
