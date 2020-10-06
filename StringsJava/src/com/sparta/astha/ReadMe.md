##Goal
- What are Strings?-Done
- Compact Strings
- String Pool
- Mutability vs Immutability-Done
- String Immutability-Done
- String Concatenation-Done
- String Methods-Done
- String Builder and StringBuffer

##What is a string?
      Basically a sequence of characters.
  Example- String name="Astha"
  
##About String Class in Java
- String class is special and does not need 
to be instantiated with new
- It implements CharSequence interface
- It has 15 constructors

##Immutability
- An object cannot be change once created that is immutability. 
Obviously the opposite to that is mutabaility-allowed to change.
- Once a string object is created, it is not allowed to change
- It cannot be made larger or smaller and you cannot change one of the characters inside it.
- It is like a fully packed box

##Why Immutability
-Concurrency issues-thread safe
-saves memory due to string pool
1. security-Many networking classes in Java takes string as input. If string mutable then will cause a lot of security issues

##String Concatenation
- placing one String before the other and combining them
- Expression evaluated from left to right

##String Methods
- length()
- charAt()
- indexOf()
- subString()
- toLowerCase()
- toUpperCase()
- startsWith()
- endsWith()
- replace()
- contains()
- trim(), strip()-demo by trainees

## String Pool 
- Stores single copy of each String literal as string object
-Only one string pool
-Also called a string table




 


