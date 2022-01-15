/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestSuites;

/**
 *
 * @author Qucker135
 */
import Komponenty.*;
import Aplikacja.Aplikacja_studentaTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTest.class)
@Suite.SuiteClasses(Aplikacja_studentaTest.class)
public class SlowTestsSuite {
    
}
