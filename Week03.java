package week3array;

import java.util.Arrays;

public class Week03 {

	public static void main(String[] args) {
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Ben Stiller";
		String studentName3 = "Lon Ware";
		String studentName4 = "Brian Ware";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		System.out.println(studentName4);
		         //variable & Array start
		String[] students = new String[4];
		
		students[0] = "Tom Sawyer";
		students[1] = "Ben Stiller";
		students[2] = "Lon Ware";
		students[3] = "Brian Ware";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[3]);
		
		for (int i = 0; i < students.length; i++){
			System.out.println(students[i]);
		}
		
		System.out.println("Enhance For loop");
		// for each student in students array
        for (String student : students) {
        	System.out.println(student);
        }
        //multiples of 3 example
        int[] multiplesOf3 = new int[10];
        
        for (int i = 1; i <= multiplesOf3.length; i++) {
        	multiplesOf3[i-1] = i * 3;
        	System.out.println("numbers: " + multiplesOf3[i - 1]);
        }
        //multiples of 5 example
        int[] multiplesOf5 = new int[10];
        
        for (int i = 0; i < multiplesOf5.length; i++) {
        	multiplesOf5[i] = (i + 1) * 5;
        	System.out.println(multiplesOf5[i]);
        }
        // code not working below this line
        int[] sum = new int[5];
        int[] numbers = {2, 4, 6, 8, 10};
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;
        
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        
        for (int i = 0; i < 10; i++);{
        System.out.println(Arrays.toString(sum));

        }

	}

}
