

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

