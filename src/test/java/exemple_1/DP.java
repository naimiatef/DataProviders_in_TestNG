package exemple_1;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DP {

	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "Première valeur" }, { "Deuxième valeur" } };
	}

	@Test(dataProvider = "data-provider")
	public void myTest(String val) {
		System.out.println("Le paramètre passé est : " + val);
	}

	/*
	 * Les deux valeurs apparaissent dans la sortie. Cela signifie que même si nous avons exécuté le fichier une fois, 
	 * la méthode de cas de test s’est exécutée deux fois avec des valeurs différentes.
	 */
}
