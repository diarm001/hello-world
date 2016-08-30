// EnumAnimal.scala
// This is an example of a Schema Definition programmed in Scala to 
// be used as GraphQL to chat with scala
// In our case Akka
// Defines enumerated data types for cat, dog + goat.

object SchemaDefinition {
  val EnumAnimal = EnumType(
    "Animal",
    Some("What could the animal be?"),
    List(
      EnumValue("CAT",
        value = Animal.CAT,
        description = Some("Meow.")),
      EnumValue("DOG",
        value = Animal.DOG,
        description = Some("Bow Wow.")),
      EnumValue("GOAT",
        value = Animal.GOAT,
        description = Some("Fancy some milk?"))))
}