
public class ListFactory {

	public List getList(int opcion) {
		if(opcion==1)
		return new SinglyLinkedList<Character>();
		else if(opcion==2)
			return new DoublyLinkedList<Character>();
		else
			return new CircularList<Character>();
	}

}
