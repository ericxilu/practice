package com.lucrortek.datastructure.refresher;

import java.util.Random;

public class SinglyLinkedList {

    private Node header;

    //inner class for node
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void setData(int newData) {
            this.data = newData;
        }

        public void setNext(Node node) {
            this.next = node;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Node other = (Node) obj;
            return this.data == other.data;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(data);
        }

        @Override
        public String toString() {
            return Integer.toString(data);
        }
    }

    public void add(Node newNode) {
        System.out.printf("adding new node %d%n", newNode.data);
        if (header == null) {
            System.out.printf("adding header %d%n", newNode.data);
            this.header = newNode;
        } else {
            System.out.printf("adding node %d with header node %d%n", newNode.data, header.data);
            Node curNode = header;
            while (curNode.next != null) {
                System.out.printf("traversing linked list with current node %d%n", curNode.data);
                curNode = curNode.next;
            }
            curNode.setNext(newNode);
        }
    }

    public void remove(Node delNode) {
        System.out.printf("remove node %s %n", delNode);
        Node prevNode = null;
        Node curNode = null;
        if (header != null) {
            prevNode = curNode = header;

            if (header.equals(delNode)) {
                header = header.next;
            } else {
                curNode = curNode.next;
                while (curNode != null) {
                    System.out.printf("previous node %s %n", prevNode);
                    System.out.printf("current node %s %n", curNode);
                    System.out.printf("del node %s %n", delNode);

                    if (delNode.equals(curNode)) {
                        prevNode.next = curNode.next;
                        break;
                    } else {
                        prevNode = prevNode.next;
                        curNode = curNode.next;
                    }
                }
            }
        }
    }


    public boolean contains(Node searchNode) {
        Node curNode = header;
        while (curNode != null) {
            if (searchNode.equals(curNode)) {
                return true;
            }
            curNode = curNode.next;
        }

        return false;
    }

    @Override
    public String toString() {
        Node curNode = header;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while (curNode != null) {
            sb.append("element-");
            sb.append(count);
            sb.append(" (");
            sb.append(curNode);
            sb.append(")");
            sb.append(" | ");
            curNode = curNode.next;
            count++;
        }
        return sb.toString();
    }

    public int size(){
        int size = 0;

        if(header !=null) {
            Node curNode = header;
            while (curNode != null) {
                size++;
                curNode = curNode.next;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        //test create new Singly Linkedlist by adding 1 to 10
        SinglyLinkedList linkedList = new SinglyLinkedList();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            Node node = new Node(i);
            linkedList.add(node);
        }
        System.out.println(linkedList);
        System.out.printf("linked list size is %d %n", linkedList.size());

        //test contains
        printContainsTestResult(linkedList, 1);
        printContainsTestResult(linkedList, 10);
        printContainsTestResult(linkedList, 5);
        printContainsTestResult(linkedList, -1);

        //test equals
        int compareFromInt = 5;
        int compareToInt = 5;
        if (new Node(compareFromInt).equals(new Node(compareToInt))){
            System.out.printf("compare %d with %d is equals %n", compareFromInt, compareToInt);
        } else {
            System.out.printf("there is a bug in equals!!!!!");
        }

        //test remove
        printRemoveTestResult(linkedList, 5);
        printRemoveTestResult(linkedList, 1);
        printRemoveTestResult(linkedList, 11);



    }

    public static void printContainsTestResult(SinglyLinkedList linkedList, int searchInt) {
        if (
                linkedList.contains(new Node(searchInt))) {
            System.out.printf("linked list contains %d%n", searchInt);
        } else {

            System.out.printf("linked list does not contain %d%n", searchInt);
        }
    }

    public static void printRemoveTestResult(SinglyLinkedList linkedList, int removeInt) {
        System.out.printf("linked list before removal of %d has %d elements %n", removeInt, linkedList.size());
        System.out.println(linkedList);
        linkedList.remove(new Node(removeInt));
        System.out.printf("linked list after removal of %d has %d elements %n", removeInt, linkedList.size());
        System.out.println(linkedList);

    }


}
