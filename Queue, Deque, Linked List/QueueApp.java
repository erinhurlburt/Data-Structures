/*
*  File name: QueueApp.java
*  Purpose  : Tests queue.java
*  Author  : Erin Hurlburt and Connor Savage
*  Date    : 2021-10-13
*/

class QueueApp {
   
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);
 
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
 
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
 
        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
 
        //while( !theQueue.isEmpty() ) {
        //    long n = theQueue.remove();
        //    //System.out.print(n);
        //    System.out.print(n );
        //}
        //System.out.println("");

        boolean test = true;
        theQueue.display(test);
    }
}

 