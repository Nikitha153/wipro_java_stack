package test;

		import java.util.ArrayList;

		public class ArraylistDemo {

			public static void main(String[] args) {
				// Create an ArrayList of Strings
				ArrayList<String> months = new ArrayList<>();

				// Add all the months of the year
				months.add("January");
				months.add("February");
				months.add("March");
				months.add("April");
				months.add("May");
				months.add("June");
				months.add("July");
				months.add("August");
				months.add("September");
				months.add("October");
				months.add("November");
				months.add("December");

				// Print all the months using a for-each loop
				for (String month : months) {
					System.out.println(month);
				}
			}
		}
