Intent

Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
The new operator considered harmful.

Problem

If an application is to be portable, it needs to encapsulate platform dependencies. These "platforms" might include: windowing system, operating system, database, etc. Too often, this encapsulation is not engineered in advance, and lots of #ifdef case statements with options for all currently supported platforms begin to procreate like rabbits throughout the code.

The Abstract Factory defines a Factory Method per product. 
Each Factory Method encapsulates the new operator and the concrete, platform-specific, product classes. 
Each "platform" is then modeled with a Factory derived class.