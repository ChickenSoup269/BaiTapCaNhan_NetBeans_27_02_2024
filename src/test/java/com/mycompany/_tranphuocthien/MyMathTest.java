/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany._tranphuocthien;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thien
 */
public class MyMathTest {
   
     
    public MyMathTest() {
    }
    
     @BeforeClass
    public static void setUpClass() {
        // Setup code before the test class runs 
        System.out.println("BeforeClass - Chạy một lần cho bất kỳ test");
    }

    @AfterClass
    public static void tearDownClass() {
        // Cleanup code after the test class runs 
            System.out.println("AfterClass - Chạy một lần cho tất cả test");
    }

    @Before
    public void setUp() {
        // Setup code before each test method runs (if needed)
        System.out.println("Before - Chạy trước test");
    }

    @After
    public void tearDown() {
        // Cleanup code after each test method runs (if needed)
        System.out.println("After - Chạy sao test");
    }

    @Test
    public void testKiemtrasole() {
        System.out.println("kiemtrasole");
        
        // Test case 1: Số chẵn
        int so1 = 2;
        boolean expResult1 = false;
        boolean result1 = MyMath.kiemtrasole(so1);
        assertEquals(expResult1, result1);
        System.out.println("Test case 1 - Result: " + result1);

        // Test case 2: Số lẽ
        int so2 = 3;
        boolean expResult2 = true;
        boolean result2 = MyMath.kiemtrasole(so2);
        assertEquals(expResult2, result2);
        System.out.println("Test case 2 - Result: " + result2);
        
        // Test case 3: Số 0
        int so3 = 0;
        boolean expResult3 = false;
        boolean result3 = MyMath.kiemtrasole(so3);
        assertEquals(expResult3, result3);
        System.out.println("Test case 3 - Result: " + result3);

        // Test case 4: Số lẻ âm
        int so4 = -5;
        boolean expResult4 = true;
        boolean result4 = MyMath.kiemtrasole(so4);
        assertEquals(expResult4, result4);
        System.out.println("Test case 4 - Result: " + result4);

        // Test case 5: Số chẳn âm
        int so5 = -4;
        boolean expResult5 = false;
        boolean result5 = MyMath.kiemtrasole(so5);
        assertEquals(expResult5, result5);
        System.out.println("Test case 5 - Result: " + result5);
    }
      
}
