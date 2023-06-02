# [Data structures](complexity_analysis/lectures/notes/2.DataStructure.pdf)
- Data structures enables us to store data in a structured manner.
- List, set, map, stack, queue and tree are common data structures used in computer science and programming.

## [List](linkedlist/readme.md)
- A list is a collection of elements in a specific **order**. 
- Each element is assigned an index, which is used to access it.
- Lists are typically **mutable**, which means that you can modify them by adding, removing, or changing elements.
- Lists are typically used for storing and manipulating data that needs to be **accessed and modified frequently**
- [Introduction to Linkedlist and its types](linkedlist/lectures/IntroductionToLinkedListAndItsTypes.pdf), [notes](linkedlist/lectures/notes/IntroductionToLinkedListAndItsTypes.pdf)
- [Insertion and reversal](linkedlist/lectures/InsertionAndReversal.pdf)
  - [Insertion at the beginning](linkedlist/lectures/notes/InsertionAtTheBeginning.pdf)], [exercise](linkedlist/exercises/InsertionAtTheBeginning.java)
  - [Insertion at the end](linkedlist/lectures/notes/InsertionAtTheEnd.pdf)], [exercise](linkedlist/exercises/InsertionAtTheEnd.java)
  - [Insertion after any node](linkedlist/lectures/notes/InsertionAfterAnyNode.pdf), [exercise](linkedlist/exercises/InsertionAfterAnyNode.java)
  - [Reverse a Linkedlist Iteratively](linkedlist/lectures/notes/ReverseALinkedListIteratively.pdf), [exercise](linkedlist/exercises/ReverseALinkedListIteratively.java)
  - [Reverse a Linkedlist Recursively](linkedlist/lectures/notes/ReverseALinkedListRecursively.pdf), [exercise](linkedlist/exercises/ReverseALinkedListRecursively.java)
  - [Deletion](linkedlist/lectures/notes/Deletion.pdf)], [exercise](linkedlist/exercises/Deletion.java)
- [Middle of a Linkedlist](linkedlist/lectures/MiddleOfALinkedList.pdf), [notes](linkedlist/lectures/notes/MiddleOfALinkedList.pdf), [exercise](linkedlist/exercises/MiddleOfLinkedList.java)
- [Cycle detection](linkedlist/lectures/CycleDetection.pdf), [notes](linkedlist/lectures/notes/CycleDetection.pdf), [exercise](linkedlist/exercises/CycleDetection.java)

## Set 
- A set is a collection of **unique elements** with **no specific order**.
- Sets are typically used when you want
  - to check if an element is a member of a group (presence or absence) or 
  - to remove duplicates from a list.

## Map
- A map (also called a **dictionary or associative array**) is a collection of **key-value pairs**.
- Each key is associated with a value, and you can use the key to look up the corresponding value.
- Maps are useful when you want to store data that is structured in this way.
- [Introduction to Hashing Data Structure](Hashmap/lectures/1.IntroductionToHashingDataStructure.pdf)
- [Functions in HashMap](Hashmap/lectures/2.FunctionInHashMap.pdf)
- [Collision Handling in HashMap](Hashmap/lectures/3.CollisionHandlingInHashMap.pdf)
- [Types of HashMaps in Java](Hashmap/lectures/4.TypesOfHashMapsInJava.pdf)
- [Problem- Two Sum](Hashmap/lectures/5.TwoSum.pdf)
- [Problem- First non repeating character in a String](Hashmap/lectures/6.FirstNonRepeatingCharacterInString.pdf)

## Stack
- A stack is a collection of elements in which elements are **added and removed from the same end**. 
- This follows the "last in, first out" (LIFO) principle. 
- Stacks are often used 
  - To keep track of the order of operations in an algorithm or 
  - To implement undo/redo functionality in an application.
- [Introduction to Stack](Stack/lectures/IntroductionToStack.pdf)
  - [Operations in Stack](Stack/lectures/OperationsInStack.pdf)
  - [Stack class in java](Stack/lectures/StackClassInJava.pdf)
- [Problem- Valid parenthesis](Stack/lectures/ValidParenthesis.pdf)
- [Problem- Largest rectangle in histogram](Stack/lectures/LargestRectangleInHistogram.pdf)

## Queue
- A queue is a collection of elements in which the elements are **added at one end and removed from the other end**. 
- This follows the "first in, first out" (FIFO) principle. 
- Queues are often used to implement processes that require tasks to be completed in a specific order.
- [Introduction to Queue](Stack/lectures/IntroductionToQueue.pdf)
- [Implementation of Queue using Stack](ImplementationOfQueueUsingStack.pdf)
- [Implementation of Stack using Queue](ImplementationOfStackUsingQueue.pdf)
- [Introduction to Deque and Sliding Window Concept](IntroductionToDequeAndSlidingWindowConcept.pdf)

## Tree 
- A tree is a **hierarchical** data structure consisting of nodes connected by edges.
- Each node has a parent node (except for the root node) and zero or more child nodes.
- Trees are often used to represent hierarchical relationships, such as the **file system** on a computer or the **structure of a web page**.

In summary, the list, set, map, stack, queue and tree are all data structures used in computer science that can be classified according to their
- order, 
- uniqueness of elements, 
- key-value association, and 
- order of processing
