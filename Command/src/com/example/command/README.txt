The command pattern is a behavioral design pattern in which an
object is used to represent and encapsulate all the information
needed to call a method at a later time.

This information includes the method name, the object that owns
the method and values for the method parameters.

* Allows you to store lists of code that is executed at a later time or many times.
* Client says I want a specific Command to run when execute() is
called on 1 of these encapsulated (hidden) Objects
* An Object called the Infoker transfers this Command to another
Object called Receiver to execute the right code
* TurnTWOn - DeviceButton - TurnTVOn - Televion.TurnTVOn()