/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.ngokhang.mathutil.core.test;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.ngokhang.mathutil.core.MathUtility;

/**
 *
 * @author badbo
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
}
