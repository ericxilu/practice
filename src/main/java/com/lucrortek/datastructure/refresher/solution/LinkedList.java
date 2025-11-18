package com.lucrortek.datastructure.refresher.solution;

/**
 * Singly Linked List implementation with basic operations.
 * Supports insert (head/tail), delete, search, print, size, clear, and reverse.
 */
public class LinkedList {
    // Head node of the list
    private Node head;
    // Number of elements in the list
    private int size;

    /**
     * Node class represents each element in the linked list.
     * Contains integer data and reference to the next node.
     */
    private static class Node {
        int data;      // Value stored in node
        Node next;     // Reference to next node
        Node(int data) { this.data = data; }
    }

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Inserts a new node with given data at the end of the list.
     * @param data Value to insert
     */
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            // Traverse to the last node
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
        size++;
    }

    /**
     * Inserts a new node with given data at the head of the list.
     * @param data Value to insert
     */
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Deletes the first node with matching data.
     * @param data Value to delete
     * @return true if node deleted, false if not found
     */
    public boolean delete(int data) {
        if (head == null) return false;
        if (head.data == data) {
            head = head.next;
            size--;
            return true;
        }
        Node curr = head;
        // Find node before the one to delete
        while (curr.next != null && curr.next.data != data) curr = curr.next;
        if (curr.next == null) return false;
        curr.next = curr.next.next;
        size--;
        return true;
    }

    /**
     * Searches for a node with the given data.
     * @param data Value to search
     * @return true if found, false otherwise
     */
    public boolean search(int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) return true;
            curr = curr.next;
        }
        return false;
    }

    /**
     * Prints all elements in the list.
     * If list is empty, prints a message.
     */
    public void print() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    /**
     * Returns the number of elements in the list.
     * @return size of the list
     */
    public int size() {
        return size;
    }

    /**
     * Removes all elements from the list.
     */
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Reverses the linked list in-place.
     */
    public void reverse() {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    /**
     * Main method to demonstrate linked list operations.
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);           // Insert at end
        list.insert(2);
        list.insert(3);
        list.print();             // Output: 1 2 3
        System.out.println("Size: " + list.size());
        list.insertAtHead(0);     // Insert at head
        list.print();             // Output: 0 1 2 3
        list.delete(2);           // Delete value 2
        list.print();             // Output: 0 1 3
        System.out.println("Search 3: " + list.search(3)); // Search for 3
        list.reverse();           // Reverse list
        list.print();             // Output: 3 1 0
        list.clear();             // Clear list
        list.print();             // Output: linked list is empty
    }
}
