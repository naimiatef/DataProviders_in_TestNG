# DataProviders_in_TestNG
Remarques:
 
- il y a un problème avec les paramètres TestNG. Ils ont très bien fonctionné pour passer la valeur et exécuter les tests, mais cela ne se produit qu’une seule fois par exécution. Que se passe-t-il si je souhaite exécuter le même test avec plusieurs valeurs ? Puis-je le faire avec des paramètres? 
        -Non, je ne peux pas car il s’agit d’une opération très courante lors des tests; Il doit y avoir un moyen standard d’atteindre cet objectif. C’est là que TestNG DataProviders entre en scène

- Les DataProviders dans TestNG sont un autre moyen de passer les paramètres dans la fonction de test, l’autre étant les paramètres TestNG.
- Le TestNG DataProvider est utilisé de la manière suivante :
           -   @DataProvider (name = "name_of_dataprovider")
              public Object[][] dpMethod() {
                  return new Object [][] { values}
              } 

- Après l’introduction de cette syntaxe, il y a quelques points que vous devez prendre en compte avant d’écrire un cas de test :
  -Le DataProvider TestNG (la partie annotation) ne contient qu’un seul attribut, qui est son nom. C’est toujours un type de chaîne dans la nature. Par exemple, « name_of_dataprovider », comme mentionné ci-dessus.
  - Les fournisseurs de données ne sont pas déclarés au-dessus des fonctions telles que Paramètres TestNG mais ont leur propre méthode, qui en termes courants appelés méthode dataprovider. Par exemple, dpMethod ici.
  - Si le testeur n’a pas spécifié le nom du fournisseur de données, le nom de la méthode devient le nom du fournisseur de données par défaut.
  - TestNG dataprovider renvoie une liste 2D d’objets.
  - La méthode effectue ensuite un test piloté par les données pour chaque valeur que vous avez spécifiée.
  - Le nom du fournisseur de données appelle la méthode dataprovider et, si aucun nom n’est spécifié par le testeur, la méthode dataprovider est le nom par défaut utilisé dans le cas de @Test de réception.
