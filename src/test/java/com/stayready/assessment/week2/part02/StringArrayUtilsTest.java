package com.stayready.assessment.week2.part02;

import org.junit.Assert;
import org.junit.Test;

public class StringArrayUtilsTest {
    @Test
    public void testGetEndingArrayFrom0() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 0;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetEndingArrayFrom1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 1;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testGetEndingArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = 98;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEndingArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {};
        int startIndex = -1;

        // when
        String[] actual = StringArrayUtils.getEndingArray(input, startIndex);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetSubArrayFrom0To2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"The", "Quick"};
        int startIndex = 0;
        int endIndex = 2;

        // when
        String[] actual = StringArrayUtils.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetSubArrayFrom1To3() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        String[] expected = {"Quick", "Brown"};
        int startIndex = 1;
        int endIndex = 3;

        // when
        String[] actual = StringArrayUtils.getSubArray(input, startIndex, endIndex);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetSubArrayOutOfBounds1() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = 98;
        int endIndex = 99;

        // when
        StringArrayUtils.getSubArray(input, startIndex, endIndex);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testGetSubArrayOutOfBounds2() {
        // given
        String[] input = {"The", "Quick", "Brown", "Fox", "Jumps"};
        int startIndex = -1;
        int endIndex = -10;

        // when
        StringArrayUtils.getSubArray(input, startIndex, endIndex);
    }
}
