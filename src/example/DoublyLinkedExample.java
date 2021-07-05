package example;

public class DoublyLinkedExample {
    static ListItem front = null;
    static ListItem rear = null;

    public static void main(String[] args){
        makeList();
        printList();
        printReverse();
        System.out.println("item #3: "+get(3));
    }

    static void printList(){
        System.out.println("Printing all items");
        ListItem item = front;
        while (item!=null){
            System.out.println(item.data);
            item = item.next;

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

    static String get (int i){
        int j=1;
        ListItem listPtr = front;
        while (listPtr!=null){
            if(j==i){
                return listPtr.data;
            }else {
                j++;
                listPtr = listPtr.next;
            }
        }
        return null;

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


