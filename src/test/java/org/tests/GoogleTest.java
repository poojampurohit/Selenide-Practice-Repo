package org.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleTest {
	
	@Test
	public void googleSearchTest() {
		
		
		open("https://google.com");
		$(By.name("q")).setValue("selenide");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		String header=$(By.xpath("//h3[text()='Selenide: concise UI tests in Java']")).getText();
		System.out.println(header);
		int headerCount=$$(By.cssSelector(".LC20lb.DKV0Md")).size();
		System.out.println(headerCount);
		$$(By.cssSelector(".LC20lb.DKV0Md")).shouldHave(CollectionCondition.size(15));
	}
	

}
