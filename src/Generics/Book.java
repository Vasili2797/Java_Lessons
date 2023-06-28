package Generics;

public class Book<T> {

	public T name;

	public Book(T name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return (String) name; 
	}
}
