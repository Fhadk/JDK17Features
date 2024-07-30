package org.feature.foreignfunctioninterface;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertTrue;

@ExtendWith(MockitoExtension.class)
public class NativeSumTest {

    NativeSum nativeSum;
    int a, b;

    @Before
    public void setup() {
        nativeSum = new NativeSum();
        a = 3;
        b = 4;
    }

    @Test
    public void nativeAdd() {
        assertTrue(nativeSum.add(a, b));
    }
}
