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
import Baza.KatalogTest;
import Baza.KontoStudentaTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(FastTest.class)
@Suite.SuiteClasses({GrupaTest.class, KatalogTest.class, KursTest.class, KontoStudentaTest.class})
public class AllFastTestsSuite {}
