import java.util.Objects;

public class AnimalList {

    private AnimalListItem head;

    public void add(Animal value) {
        if(head == null){
            head = new AnimalListItem(value);
        } else {
            AnimalListItem current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new AnimalListItem(value));
        }
    }

    public void remove(Animal value){
        AnimalListItem current = head;
        AnimalListItem prev = null;
        if(current != null && !Objects.equals(current.getValue(), value)){
            prev = current;
            current = current.getNext();
        }

        if(current != null) {
            if(prev == null) {
                head = head.getNext();
            }else {
                prev.setNext(current.getNext());
            }
        }
    }

    @Override
    public String toString() {
        var current = head;
        StringBuilder listString = new StringBuilder();
        if(current == null) {
            return "";
        }
        if(current.getNext() == null) {
            listString.append(current.getValue().toString());
        } else {
            listString.append(current.getValue().toString());
            while(current.getNext() != null) {
                current = current.getNext();
                listString.append(" -> ").append(current.getValue().toString());
            }
        }
        return listString.toString();
    }
}
