package com.github.ahmadshadab.core;

import com.github.ahmadshadab.daata.core.StringGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

import static com.github.ahmadshadab.daata.common.GeneratorUtils.MAX_BAG_SIZE;
import static com.github.ahmadshadab.daata.common.GeneratorUtils.MIN_BAG_SIZE;
import static org.junit.jupiter.api.Assertions.*;

public class StringGeneratorTest {

    @Test
    void testGetString(){
        String val = StringGenerator.getString();
        assertNotNull(val);
    }

    @Test
    void testGetStrings(){
        Collection<String> values = StringGenerator.getStrings();
        assertNotNull(values);
        assertTrue(values.size() >= MIN_BAG_SIZE);
        assertTrue(values.size() <= MAX_BAG_SIZE);
        values.stream().forEach(Assertions::assertNotNull);
    }

    @Test
    void testGetStringsWithSize(){
        int size = ThreadLocalRandom.current().nextInt(MIN_BAG_SIZE, 100);
        Collection<String> values = StringGenerator.getStrings(size);
        assertNotNull(values);
        assertEquals(size, values.size());
        values.stream().forEach(Assertions::assertNotNull);
    }
}
