public class DoublyLinkedExample2 {
    public static void main(String[] args){
        DoublyLinkedList tourGroup = new DoublyLinkedList();
        tourGroup.  addToList("Aiko");
        tourGroup. addToList("Boris");
        tourGroup. addToList("Caterina");
        tourGroup. addToList("Dayo");
        tourGroup. addToList("Elsa");
        tourGroup.addToList("Felix");
        tourGroup. addToList("Galen");

        tourGroup.printReverse();
        tourGroup.remove("Felix");
        tourGroup.remove("Aiko");
        tourGroup.remove("Galen");
        tourGroup.addToList("Hector");
        tourGroup.printReverse();
    }
}
