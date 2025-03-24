package com.olapie.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class RealMethodCalledTest {

    @Test
    public void whenAddCalledRealMethodCalled() {
        List<Integer> list = mock(ArrayList.class);
        doCallRealMethod().when(list).add(any(Integer.class));
        list.add(15);
        list.size();
        verify(list, times(1)).add(0, 15);
        verify(list, times(1)).size();
        Integer result = list.get(0);
        assertEquals(15, result);
    }
}
