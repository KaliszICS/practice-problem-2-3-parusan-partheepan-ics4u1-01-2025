public class PracticeProblem {
public static void main(String args[]) {
	}

	public static void q1() {
		//Write question 1 code here
        // Test the bubble sort
        String[] words = {"banana", "Apple", "cherry", "date", "apricot"};
        
        System.out.println("Before sorting:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        
        bubbleSortString(words);
        
        System.out.println("\nAfter sorting:");
        for (String word : words) {
            System.out.print(word + " ");
        }
        // Output: Apple apricot banana cherry date
    }
    
    public static void bubbleSortString(String[] strings) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                // Compare ignoring uppercase/lowercase
                if (strings[j].compareToIgnoreCase(strings[j + 1]) > 0) {
                    // Swap the two strings
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
    }

	}



