package removal;

public class DoublyLinkedRemoval {
    static ListItem front = null;
    static ListItem rear = null;

    public static void main(String[] args){
        makeList();
        printReverse();
        remove("Felix");
        remove("Aiko");
        remove("Galen");
        printReverse();

    }

    public static void remove(String s) {
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


    static void printReverse(){
        ListItem item = rear;

        System.out.println("Printing in reverse");
        while (item!=null){
            System.out.println(item.data);
            item = item.prev;

        }
    }

    static void makeList(){
        addToList("Aiko");
        addToList("Boris");
        addToList("Caterina");
        addToList("Dayo");
        addToList("Elsa");
        addToList("Felix");
        addToList("Galen");

    }

    static void addToList(String s){
        if(front==null){
            front = rear = new ListItem();
            front.data = s;
            rear.prev = null;
        }
        else{
            ListItem nextOne = new ListItem();
            nextOne.data = s;
            nextOne.next = null;
            nextOne.prev = rear;
            rear.next = nextOne;
            rear = nextOne;
        }
    }
}

class ListItem{
    String data;
    ListItem next;
    ListItem prev;
}
