package intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> als = new ArrayList<String>();
		//2. Add five Strings to your list
		als.add("a");
		als.add("b");
		als.add("c");
		als.add("d");
		als.add("e");
		als.add("f");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < als.size(); i++) {
			System.out.println(als.get(i));
		}
		System.out.println("");
		//4. Print all the Strings using a for-each loop
		for (String s : als) {
			System.out.println(s);
		}
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < als.size(); i++) {
			if (i%2 == 0) {
				System.out.println(als.get(i));
			}
		}
		System.out.println("");
		
		//6. Print all the Strings in reverse order.
		for (int i = als.size()-1; i >= -0; i--) {
				System.out.println(als.get(i));
		}
		System.out.println("");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < als.size(); i++) {
			if (als.get(i).contains("e")) {
				System.out.println(als.get(i));
			}
		}
					
				}
			}

