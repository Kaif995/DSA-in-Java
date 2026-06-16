//add
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//insert

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    Node head;

    // add at end
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // print list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Main list = new Main();

        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();
    }
}

//dlt

public void delete(int key) {

    if (head == null) return;

    if (head.data == key) {
        head = head.next;
        return;
    }

    Node temp = head;

    while (temp.next != null && temp.next.data != key) {
        temp = temp.next;
    }

    if (temp.next == null) return;

    temp.next = temp.next.next;
}

//search

public boolean search(int key) {
    Node temp = head;

    while (temp != null) {
        if (temp.data == key) {
            return true;
        }
        temp = temp.next;
    }

    return false;
}