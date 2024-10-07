


### Main Interfaces in the Java Collection Framework:
    - List
    - Set
    - Queue
    - Map

### 1. List Interface 

The List interface is an ordered collection that allows duplicate elements. Elements in a List can be accessed by their index.

Common Implementations:
ArrayList: A resizable array implementation of the List interface.
LinkedList: A doubly linked list implementation of the List interface.
Vector: Synchronized version of ArrayList.
Key Features:
Order: Maintains the insertion order.
Duplicates: Allows duplicate elements.
Index-based access: You can access elements by index.

#### Example: 
```` java
    import java.util.*;
    public class ListExample {
    public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");

    arrayList.add("Apple"); // Duplicate allowed
            System.out.println("ArrayList: " + arrayList);
        }
    }

//Output:  ArrayList: [Apple, Banana, Apple]
````

#### Differences:
    - ArrayList: 
        Backed by an array, good for fast access by index but slower for insertions and deletions.
    
    - LinkedList:
        Better for frequent insertions and deletions, but slower access by index due to traversal.


### 2. Set Interface

The Set interface represents a collection that does not allow duplicate elements. It models the mathematical set abstraction.

#### Common Implementations:
HashSet: Implements Set with no guarantee of order.
LinkedHashSet: Preserves the insertion order.
TreeSet: Implements Set with sorted order using a tree structure.

#### Key Features:
No duplicates: Ensures that no two elements are the same.
Order: May or may not maintain order (depending on the implementation).

Example :

```java
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate not allowed
        
        System.out.println("HashSet: " + hashSet);
    }
}

//HashSet: [Apple, Banana] // Order is not guaranteed/
```

### Differences:
#### HashSet:
No guarantee of order, backed by a hash table, fast for add, remove, and lookup operations.

#### LinkedHashSet: 

Maintains insertion order, slower than HashSet but still efficient.

#### TreeSet: 
Maintains natural order (sorted), slower than both HashSet and LinkedHashSet.


### 3. Queue Interface :

   The Queue interface represents a collection designed for holding elements prior to processing. It is typically used for FIFO (First In, First Out) operations, but some implementations allow different orders.

#### Common Implementations:
LinkedList: Implements both List and Queue. Can be used as both a queue (FIFO) and list.

#### PriorityQueue: 
Elements are ordered based on their natural ordering or by a comparator.
#### Key Features:
Order: Typically, elements are ordered FIFO, but it depends on the implementation.
Duplicates: Allows duplicates.
Special methods: Methods like offer(), poll(), peek() are available for queue management.


Example:

```java
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        System.out.println("Queue: " + queue);

        System.out.println("Polling the first element: " + queue.poll()); // Removes and returns the head
        System.out.println("Queue after poll: " + queue);
    }
}

//Queue: [Apple, Banana, Orange]
//Polling the first element: Apple
//Queue after poll: [Banana, Orange]
```


#### Differences:
#### LinkedList: 
Can act as both Queue and List, allowing elements to be added or removed from both ends.
#### PriorityQueue:
Orders elements based on their priority, not insertion order.


### 4. Map Interface
   The Map interface represents a collection of key-value pairs, where each key is unique, and each key maps to exactly one value.

#### Common Implementations:
#### HashMap: 
Provides a hash table-based implementation of Map. Allows null keys and values.
#### LinkedHashMap: 
Extends HashMap and maintains the insertion order.
#### TreeMap:
A Map implementation that keeps its entries sorted according to the natural ordering of its keys.
#### Key Features:
#### Unique keys: 
Each key is unique, but the values can be duplicated.
#### Order: 
Depends on the implementation.
#### Special methods: 
put(), get(), containsKey(), remove() are used to manage the map.


Example:

```java
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Apple", 30); // Duplicate key, will overwrite previous value

        System.out.println("HashMap: " + hashMap);
    }
}

//Output: HashMap: {Apple=30, Banana=20}
```


#### Differences:
HashMap: Fast for lookups and insertions, no guarantee of order.
LinkedHashMap: Maintains the order of insertion, slightly slower than HashMap.
TreeMap: Keeps the keys sorted, slower than both HashMap and LinkedHashMap.



#### Conclusion
Each collection in the Java Collection Framework is designed to address different types of problems:

####   List  is useful for maintaining ordered collections and allows duplicates.
#### Set is useful for maintaining unique elements.
#### Queue is designed for task scheduling and processing.
#### Map is used for storing key-value pairs where keys are unique.
The differences lie in the data structure's internal implementation (arrays, linked lists, hash tables, trees), which dictates their behavior and performance characteristics. Choosing the right collection depends on your specific requirements for ordering, duplicates, and performance.