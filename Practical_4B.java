import java.util.Scanner;

public class Practical_4B{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] logs = {
            "10:05 alice Hello there",
            "10:10 bob How are you",
            "WrongLine",
            "10:15 ram Hello everyone"
        };

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < logs.length; i++) {

            String[] parts = logs[i].split(" ", 3);

            if (parts.length == 3) {

                if (parts[2].toLowerCase().contains(keyword.toLowerCase())) {
        
                    sb.append(parts[0]);
                    sb.append(" ");
                    sb.append(parts[1]);
                    sb.append(": ");
                    sb.append(parts[2]);
                    sb.append("\n");
                    count++;
                }

            }
        }

        System.out.println("Matches: " + count);
        System.out.println(sb);
    }
}