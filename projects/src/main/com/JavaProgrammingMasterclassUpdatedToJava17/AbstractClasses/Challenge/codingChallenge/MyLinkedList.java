package main.com.JavaProgrammingMasterclassUpdatedToJava17.AbstractClasses.Challenge.codingChallenge;

public class MyLinkedList implements NodeList {
    ListItem root;

    public MyLinkedList(ListItem root){
        this.root=root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public ListItem addItem() {
        return null;
    }

    @Override
    public ListItem removeItem() {
        return null;
    }

    @Override
    public ListItem traverse() {
        return null;
    }
}
