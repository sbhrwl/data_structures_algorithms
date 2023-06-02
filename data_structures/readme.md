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
- Exercises
  - [LinkedListCycle](linkedlist/exercises/LinkedListCycle.java), [refer](https://stackoverflow.com/questions/2936213/how-does-finding-a-cycle-start-node-in-a-cycle-linked-list-work)
  - [Palindrome](linkedlist/exercises/Palindrome.java)

## Set 
- A set is a collection of **unique elements** with **no specific order**.
- Sets are typically used when you want
  - to check if an element is a member of a group (presence or absence) or 
  - to remove duplicates from a list.

## Map
- A map (also called a **dictionary or associative array**) is a collection of **key-value pairs**.
- Each key is associated with a value, and you can use the key to look up the corresponding value.
- Maps are useful when you want to store data that is structured in this way.
- [Introduction to Hashing Data Structure](Hashmap/lectures/1.IntroductionToHashingDataStructure.pdf), [notes](Hashmap/lectures/notes/1.IntroductionToHashingDataStructure.pdf)
- [Functions in HashMap](Hashmap/lectures/2.FunctionInHashMap.pdf), [exercise](Hashmap/exercises/hashMapFunctions.java)
- [Collision Handling in HashMap](Hashmap/lectures/3.CollisionHandlingInHashMap.pdf), [notes](Hashmap/lectures/2.CollisionHandlingInHashMap.pdf)
- [Types of HashMaps in Java](Hashmap/lectures/4.TypesOfHashMapsInJava.pdf), [notes](Hashmap/lectures/notes/3.TypesOfHashMapsInJava.pdf), [exercise](Hashmap/exercises/hashMapFunctions.java)
- [Problem- Two Sum](Hashmap/lectures/5.TwoSum.pdf), [notes](Hashmap/lectures/notes/4.TwoSum.pdf), [exercise](Hashmap/exercises/twoSum.java)
- [Problem- First non repeating character in a String](Hashmap/lectures/6.FirstNonRepeatingCharacterInString.pdf), [notes](Hashmap/lectures/notes/5.FirstNonRepeatingCharacterInString.pdf), [exercise](Hashmap/exercises/firstOccurence.java)

## Stack
- A stack is a collection of elements in which elements are **added and removed from the same end**. 
- This follows the "last in, first out" (LIFO) principle. 
- Stacks are often used 
  - To keep track of the order of operations in an algorithm or 
  - To implement undo/redo functionality in an application.
- [Introduction to Stack](Stack/lectures/1.IntroductionToStack.pdf), [notes](Stack/lectures/1.IntroductionToStack.pdf)
- [Stack class in java](Stack/lectures/2.StackClassInJava.pdf), [exercise](Stack/exercises/StackOperations.java), [exercise](Stack/exercises/stackImplementation.java)
- [Problem- Valid parenthesis](Stack/lectures/3.ValidParenthesis.pdf), [notes](Stack/lectures/notes/2.ValidParenthesis.pdf), [exercise](Stack/exercises/validParenthesis.java)
- [Problem- Largest rectangle in histogram](Stack/lectures/4.LargestRectangleInHistogram.pdf), [notes](Stack/lectures/notes/3.LargestRectangleInHistogram.pdf), [exercise](Stack/exercises/LargestRectangleInHistogram.java)

## Queue
- A queue is a collection of elements in which the elements are **added at one end and removed from the other end**. 
- This follows the "first in, first out" (FIFO) principle. 
- Queues are often used to implement processes that require tasks to be completed in a specific order.
- [Introduction to Queue](Queue/lectures/1.IntroductionToQueue.pdf), [notes](Queue/lectures/notes/1.IntroductionToQueue.pdf), [exercise](Queue/exercises/queueImplementation.java)
- [Implementation of Stack using Queue](Queue/lectures/2.ImplementationOfStackUsingQueue.pdf), [notesQueue](Queue/lectures/notes/2.ImplementationOfStackUsingQueue.pdf), [exercise](Queue/exercises/stackusingQueue.java)
- [Implementation of Queue using Stack](Queue/lectures/3.ImplementationOfQueueUsingStack.pdf), [notes](Queue/lectures/notes/3.ImplementationOfQueueUsingStack.pdf), [exercise](Queue/exercises/queueusingStack.java)
- [Deque](Queue/lectures/4.Deque.pdf), [notes](Queue/lectures/notes/4.Deque.pdf), [exercise](Queue/exercises/dequeImp.java)
- [Sliding Window Concept](Queue/lectures/5.SlidingWindowConcept.pdf), [notes](Queue/lectures/notes/5.SlidingWindowConcept.pdf), [exercise](Queue/exercises/slidingWindow.java)

## Tree 
- A tree is a **hierarchical** data structure consisting of nodes connected by edges.
- Each node has a parent node (except for the root node) and zero or more child nodes.
- Trees are often used to represent hierarchical relationships, such as the **file system** on a computer or the **structure of a web page**.

In summary, the list, set, map, stack, queue and tree are all data structures used in computer science that can be classified according to their
- order, 
- uniqueness of elements, 
- key-value association, and 
- order of processing
