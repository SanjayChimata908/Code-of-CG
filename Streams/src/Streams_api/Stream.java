package Streams_api;

import java.util.ArrayList;
import java.util.List;

public class Stream {
	public static void main(String[] args) {
	List<String> languages = new ArrayList <String>();
	
	languages.add("English");
	languages.add("GERMAN");
	languages.add("FREANCH");
	
	//languages.stream().forEach(System.out::println);
	languages.stream().map(item->item.toUpperCase()).forEach(System.out::println);
	
	}

}
