package com.ck.interface_example;

import java.io.Serializable;
import java.rmi.Remote;

/*2. Marker Interfaces
A marker interface is an interface that doesn’t have any 
methods or constants inside it. 
It provides run-time type information about objects, 
so the compiler and JVM have additional information about the object.

A marker interface is also called a tagging interface.

Though marker interfaces are still in use, 
they very likely point to a code smell, 
and we should use them carefully. 
The main reason for this is that they blur the lines of 
what an interface represents, since markers don’t define any behavior. 
Newer development favors annotations to solve some of the same problems.

3. JDK Marker Interfaces
Java has many built-in marker interfaces, 
such as Serializable, Cloneable, and Remote.*/


  /*Example of Marker Interfaces in Java

Serializable
Cloneable
Remote */


    //Serializable
class Marker_interface_Student_Serilizable implements Serializable
{
	int id=101;
	String name="vijay";
}



