package countbits;

public class Main {

    public static void main(String[] args) {
	int number = countBits(559);
        System.out.println(number);
    }
    public static int countBits(int n){
        // Show me the code!


        int count =0;
        String binary = Integer.toBinaryString(n);



        for (int i = 0; i < binary.length(); i++) {

            String  binary_digit = String.valueOf(binary.charAt(i));

            if (binary_digit.equals("1"))
                count++;


        }
        return count ;
    }
}
