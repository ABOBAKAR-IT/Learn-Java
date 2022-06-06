public class Switch_8 {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
          case 6:
            System.out.println("Today is Saturday");
            break;//When Java reaches a break keyword, it breaks out of the switch block.
          case 7:
            System.out.println("Today is Sunday");
            break;
          default: //The default keyword specifies some code to run if there is no case match:
            System.out.println("Looking forward to the Weekend");
        }    
    }
}
