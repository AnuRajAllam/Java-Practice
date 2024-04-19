package javasessions;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
//import java.util.List;

public class ArrayArrayListAssign {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[]= {1,4,5,2,3,22,31,2};
		int a[]=new int[p.length-1];
		int j=0;
		for (int i = 0; i <= p.length - 1; i++) {
			if (p[i] != 22) {
				a[j] = p[i];
				j++;
				// a[]
			}
		}

		System.out.println(Arrays.toString(a));

//Q2: Write a program to create a static Array, having following cricket data:
//--name, age, team name, DOB, gender, Strike Rate
// --Try to create multiple Object Arrays for different players 
//--Try to print all the values of each player on the console
		
		Object cricketer1[]= {"Rahul",22,"Mumbai","25-12-1995",'M',14.55};
		Object cricketer2[]= {"Rohit",22,"Mumbai","25-12-1995",'M',12.33};
		Object cricketer3[]= {"Virat",22,"Mumbai","25-12-1995",'M',100};
		System.out.println(Arrays.toString(cricketer1));
		System.out.println(Arrays.toString(cricketer1));
		

		
		//ArrayList
		//1.create a new array list, which contains all color names
		//add some colors (string)
		//and print out the colorslist using loops.
		
		ArrayList<String> colors = new ArrayList<String>();
		//colors.add
		colors.add("Red");
		colors.add("Blue");
		colors.add("Pink");
		colors.add("Yellow");
		for (String e : colors) {
			System.out.println(e);
		}
		
		//2.retrieve an element at a specified index from a given array list.
		System.out.println(colors.get(2));
		
		
		//3.update specific array element by given element.
		colors.set(2, "Green");
		System.out.println(colors);
		
		
		//4.remove the third element from an array list. 
		colors.remove(2);
		System.out.println(colors);
		
		
		//5.search an element in an array list using for loop. Once we find that element, break the loop.
		colors.add("Pink");
		colors.add("Orange");
		colors.add("Purple");
		for(String color:colors) {
			if(color.equals("Orange")) {
				System.out.println("Found the searched color " +color);
				break;
			}
		//System.out.println(color);
		}
		
		
		//6.Reverse this array List:
		ArrayList<String>studentNames=new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		//studentNames.su
		System.out.println(studentNames);
		ArrayList<String> reverseList = new ArrayList<String>();
		int s = 0;

		for (int i = studentNames.size() - 1; i >= 0; i--) {
			// System.out.println(studentNames.get(i));
			reverseList.add(studentNames.get(i));
		}
		System.out.println(reverseList);
		//method 2: recomended
		//Collections.
		Collections.reverse(studentNames);
		System.out.println(studentNames);
		
		
		//7. Write a Java program to extract a portion of an array list.
        ArrayList<String> colorsSubList=new ArrayList<String>(colors.subList(0,colors.size()-3));
		System.out.println(colorsSubList);
		
		
		//8.Write a Java program to empty an array list.
		colors.clear();
		System.out.println(colors);
		
		
		//9.to trim the virtual capacity of an array list to the current list size.
		ArrayList<String> colors1=new ArrayList<String>(10);
		System.out.println(colors1.size());
		colors1.add("Red");
		colors1.add("Yellow");
		colors1.add("Blue");
		System.out.println(colors1.size());
		colors1.trimToSize();
		System.out.println(colors1.size());
		
		//10.to print all the elements of an ArrayList using the position of the elements
		colors1.add("Purple");
		colors1.add("Green");
		for(int i=0;i<colors1.size();i++) {
			System.out.println("Element at index "+ i +" is " +colors1.get(i));
		}
		
		Cricketers cricketmem1=new Cricketers("Rahul",22,"Mumbai","25-12-1995",'M',14.55);
		Cricketers cricketmem2=new Cricketers("Rohit",22,"Mumbai","25-12-1995",'M',12.33);
		//Cricketers cricketmem3=new Cricketers("Rahul",22,"Mumbai","25-12-1995",'M',14.55);
		//Cricketers cricketmem4=new Cricketers("Rahul",22,"Mumbai","25-12-1995",'M',14.55);
		ArrayList<Cricketers> cricketlist=new ArrayList<Cricketers>();
		 
		
		
		cricketlist.add(cricketmem1);
		cricketlist.add(cricketmem2);
		
		
		Iterator<Cricketers> it=cricketlist.iterator();
		
		while(it.hasNext()) {
			Cricketers Cteam=it.next();
			System.out.println(Cteam.name);
			System.out.println(Cteam.age);
			System.out.println(Cteam.teamName);
			System.out.println(Cteam.DOB);
			System.out.println(Cteam.gender);
			System.out.println(Cteam.StrikeRate);
		}
	
		System.out.println(cricketlist);
		
	
		

	}

}
