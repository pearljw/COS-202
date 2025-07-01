package basics;

public class ArrayExample{
    public static void main(String[] args) {
        int[] myArray = {1,3,5,7,9};
        int[] anotherArray = new int[10];
        String[] gender = {"Female", "Male"};


    // To change the value of 3 to 13, we can do this
        myArray[1] = 13;
        myArray[3] = 13;
        anotherArray[5] = 17;

        // or we could use a for loop to collect the numbers
        for(int i = 0; i < anotherArray.length; i++) {
            System.out.println("Insert Item at: "+i);
            anotherArray[i] = input.nextInt();
        }

        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] == 13){
                System.out.println("Found it");
                break;
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Item at: "+i+ " is " +myArray[i]);
            anotherArray[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < myArray.length; i++);
        int i = 0;
        sum += myArray[i];
        System.out.println(sum);

         try {
            anotherArray[i] = input.nextInt();
        }catch (InputMismatchException inputMismatchException) {
            System.out.println("Enter only numbers");
        }catch (ArrayIndexOutOfBoundsException arrayOutOBound){
            System.out.println("Too many inputs into the array");
        }catch (Exception exception) {
            System.out.println("Something unexpected");
        }
    }
}

// Data structures follow a set of rules
// Queue: follows first in, first out
// Stack: Last in, first out
// Stacks and queues are central data structure
// Algorithms are an unambiguous set of steps or instructions that solve a problem
// An array is a homogeneous collection of data, arrays have fixed sixes
// First item in an array is called index 0
// We can use n-1 to get the last number in the array

// When it comes to a stack we are always dealing with the topmost stack, we are adding at the top and removing at the
// top. When there is nothing in a stack the top of the stack is equals to -1
// When inserting a new item we are adding top + 1. -1 + 1 = 0, 0 + 1 = 1
// When a stack is full the stack overflows, before adding an item to a stack make sure the stack is not full
// How to make sure the stack is not full is when the top is not equal to the size of that particular stack
// we have to make sure it's not equal to n-1
// When we want to remove an item, we have to make sure the stack is not empty, we know it's not empty if the
// stack is not equal to -1
// Where stack can be used i our daily lives: undo button, the back button on the browser
// Navigation stack
// The term for inserting an item into a stack is push and to remove is pop, to view all the items in the stack is peep.

// QUEUE
// Our queue is horizontal
// In a queue we monitor two positions, that is the front and rear
// The value of the front and rear in an empty queue is 0.
// n is for front and r is for rear
// When adding an item the value that is moved is r
// Moving things from queues are more complex than stacks
// Example of queues are printing from a document

// synchronous whatever action we do first has to execute first before any other thing
// Adding an item to a queue is to enqueue and removing is to dequeue
















