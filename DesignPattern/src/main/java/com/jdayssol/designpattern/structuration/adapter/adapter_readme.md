Intent

Decouple an abstraction from its implementation so that the two can vary independently.
Publish interface in an inheritance hierarchy, and bury implementation in its own inheritance hierarchy.
Beyond encapsulation, to insulation

Problem

"Hardening of the software arteries" has occurred by using subclassing of an abstract base class to provide alternative implementations. This locks in compile-time binding between interface and implementation. The abstraction and implementation cannot be independently extended or composed.

Structure
The Client doesn't want to deal with platform-dependent details. The Bridge pattern encapsulates this complexity behind an abstraction "wrapper".

Bridge emphasizes identifying and decoupling "interface" abstraction from "implementation" abstraction.