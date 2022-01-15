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
import Baza.Katalog;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(FastTest.class)
@Categories.ExcludeCategory(TestGetter.class)
@Suite.SuiteClasses({GrupaTest.class, Katalog.class})
public class FastTestsNotGettersSuite {
    
}
