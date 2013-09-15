Design of decorator pattern
==============

You start with an interface which creates a blue print for the class which will have decorators. Then implement that interface with basic functionalities. Till now we have got an interface and an implementation concrete class. Create an abstract class that contains (aggregation relationship) an attribute type of the interface. The constructor of this class assigns the interface type instance to that attribute. This class is the decorator base class. Now you can extend this class and create as many concrete decorator classes. The concrete decorator class will add its own methods. After / before executing its own method the concrete decorator will call the base instance’s method. Key to this decorator design pattern is the binding of method and the base instance happens at runtime based on the object passed as parameter to the constructor. Thus dynamically customizing the behavior of that specific instance alone.


he Streams in Java - subclasses of InputStream and OutputStream are perfect examples of the decorator pattern.

As an example, writing a file to disk:

File toWriteTo = new File("C:\\temp\\tempFile.txt");
OutputStream outputStream = new FileOutputStream(toWriteTo);    

outputStream.write("Sample text".getBytes());
Then should you require some extra functionality regarding the writing to disk:

File toWriteTo = new File("C:\\temp\\tempFile.txt");
OutputStream outputStream = 
             new GZIPOutputStream(new FileOutputStream(toWriteTo));

outputStream.write("Sample text".getBytes());
By simply "chaining" the constructors, you can create quite powerful ways of writing to disk. The beauty in this way is that you can add different (in this example) OutputStream implementations later on. Also, each implementation doesn't know how the others work - they all just work to the same contract. This also makes testing each implementation very easy in isolation.

There are plenty of "real world" examples of where the decorator pattern can be used. Off the top of my head, some examples:
Reading and writing to disk (above)
Construction of UI elements, such as adding scrollbars on to text areas etc
