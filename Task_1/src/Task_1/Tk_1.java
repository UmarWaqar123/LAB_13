package Task_1;
public class Tk_1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a line of text: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}
