/*
*  File name: DequeApp.java
*  Purpose  : Tests deque.java
*  Author  : Erin Hurlburt and Connor Savage
*  Date    : 2021-10-13
*/

class DequeApp {
   
    public static void main(String[] args) {
        Deque theDeque = new Deque(5);
 
        theDeque.insertLeftNew(10);
        theDeque.insertLeftNew(20);
        theDeque.insertRightNew(50);
        theDeque.insertRightNew(60);
        theDeque.insertRightNew(70);

        theDeque.isEmpty();
        theDeque.isFull();


        theDeque.removeRightNew();
        theDeque.removeLeftNew();

        boolean test = true;
        theDeque.displayDequeArrayContents(test);


    }
}

 