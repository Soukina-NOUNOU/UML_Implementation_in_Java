
# REFLEXION - UML Implementation in Java

## Activité 1 

## Classes identifiées

| Classe   

`Foo`, `Bar`,`Baz`,`Qux`, `Grault`, `Corge` 

---

## Attributs de la classe `Foo`

| Attribut        | Type                 
|-----------------|-----------------------
| `bar`           | `Bar`                 
| `bazs`          | `List<Baz>`           
| `qux`           | `Qux`                 
| `graults`       | `List<Grault>`        
| `corge`         | `Corge`       

---

## Comportements à implémenter

### Dans `Foo` :
- `Foo(Bar bar)`-> ajoute un `Bar`
- `addBaz(Baz baz)` -> ajoute un `Baz`
- `addGrault()`-> crée un nouveau `Grault` lié à ce `Foo`

### Dans `Grault` :
- `getFoo()` → retourne le `Foo` associé


## Difficultés rencontrées

- Compréhension des relations UML
- Premiére fois avec le language Java

## Améliorations possibles

- Documentation
- Tests supplémentaires
- Refacto

## Activité 2

Au départ, j'ai eu quelques difficultés à comprendre les relations UML, surtout les liens bidirectionnels entre Foo et Corge. C'était ma première vraie expérience avec Java et j'ai dû apprendre la syntaxe en même temps que les concepts.

La partie la plus délicate a été la gestion des relations bidirectionnelles - il fallait s'assurer que quand on modifie une référence d'un côté, l'autre côté soit automatiquement mis à jour. J'ai aussi réalisé que mes getters exposaient directement les listes internes, ce qui cassait l'encapsulation.

**Tests** : Tous les tests passent en local et sur GitHub Actions

**Améliorations apportées** :
1. **Copie défensive** : Les getters retournent maintenant des copies des listes pour protéger l'état interne
2. **Validation** : Ajout de vérifications null dans le constructeur et addBaz() pour éviter les erreurs

**Pistes futures** : J'aimerais explorer l'utilisation du pattern Repository que j'ai créé, et peut-être ajouter plus de validation métier dans les interfaces.

