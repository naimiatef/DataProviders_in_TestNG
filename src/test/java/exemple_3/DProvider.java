package exemple_3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

/*
 * Comment passer plusieurs paramètres dans TestNG DataProviders?
 * Dans le code suivant, j’ai passé trois valeurs a, b et result pour vérifier si la somme est égale au résultat ou non.
 */
public class DProvider {
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { 2, 3, 5 }, { 5, 7, 9 } };
	}

	@Test(dataProvider = "data-provider")
	public void myTest(int a, int b, int result) {
		int sum = a + b;
		Assert.assertEquals(result, sum);
	}
}
