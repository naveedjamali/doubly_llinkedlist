public class DoublyLinkedList {

    ListItem front = null;
    ListItem rear = null;

    public void addToList(String s) {

        if (front == null) {
            front = rear = new ListItem();
            front.data = s;
            rear.prev = null;
        } else {

        ListItem nextOne = new ListItem();
        nextOne.data = s;
        nextOne.prev=rear;
        rear.next = nextOne;
        rear = nextOne;

        }
    }

    public void remove(String s) {
        ListItem listPtr = front;
        while (listPtr != null) {
            if (listPtr.data.equals(s)) {
                break;
            }
            listPtr = listPtr.next;
        }
        if(listPtr!=null){

            // listPtr is pointing to front;
            if(listPtr==front){

                front = front.next;
                front.next.prev = null;

            }
            else if(listPtr==rear){
                //listPtr is pointing to rear;
                rear = rear.prev;
                rear.next=null;


            }
            else {
                //listPtr is at somewhere in the middle of the list

                listPtr.prev.next = listPtr.next;
                listPtr.next.prev = listPtr.prev;


            }
            // garbage collection will remove this.
            listPtr=null;
            System.out.println("\""+s+"\" Removed from list");
        }
        else{
            System.out.println("\""+s+"\" does not exist in the list");
        }
    }

    public void printList() {
        //Forward Direction.
        System.out.print("List:");
        ListItem listPtr = front;
        while (listPtr != null) {
            System.out.println(" " + listPtr.data);
            listPtr = listPtr.next;
        }
        System.out.println();
    }

    public void printReverse() {
        //Similar to what we had before
        //Reverse Direction.
        System.out.print("List:");
        ListItem listPtr = rear;
        while (listPtr != null) {
            System.out.println(" " + listPtr.data);
            listPtr = listPtr.prev;
        }
        System.out.println();
    }

}

class ListItem {

    String data = null;
    ListItem next = null;
    ListItem prev = null;
}
