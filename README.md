# Abstract-Factory-Pattern-Furniture
this code implements the Abstract Factory Pattern. Here's how it adheres to the pattern:

Abstract Factory Class: The FurnitureFactory class is an abstract class that declares abstract methods createChair(), createTable(), and createSofa(). This class serves as the abstract factory for creating families of related furniture objects.

Concrete Factory Classes: There are concrete factory classes like ModernWoodFactory, ModernMetalFactory, ModernGlassFactory, TraditionalWoodFactory, TraditionalMetalFactory, TraditionalGlassFactory, IndustrialWoodFactory, IndustrialMetalFactory, and IndustrialGlassFactory. These classes extend the FurnitureFactory class and implement its abstract methods to create specific combinations of furniture objects.

Client Code Using Factory: In the Test1 class, we use the FurnitureCreator class to set a concrete factory based on the user's selection of style and material. Then, we use this factory to create furniture objects (chair, table, and sofa).

Creation of Products: The concrete factory classes are responsible for creating concrete instances of Chair, Table, and Sofa, which represent the products of the factory.
