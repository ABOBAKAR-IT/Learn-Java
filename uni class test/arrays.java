

public class arrays {
    public static void main(String[] args) {
        System.out.println("Enter a number of students");
        int s = Integer.parseInt(System.console().readLine());
        

      System.out.println("Enter a number of subjects");  
        int n = new java.util.Scanner(System.in).nextInt();
        Integer [][] subjects = new Integer[s][n];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter a mark for student " + (i + 1) + " subject " + (j + 1));
                subjects[i][j] = new java.util.Scanner(System.in).nextInt();
            }
          
    }
    for (int i = 0; i < s; i++) {
        System.out.println("Show Student " + (i + 1) + " marks");
        for (int j = 0; j < n; j++) {
        System.out.println("Subject " + (j + 1) + ": " + subjects[i][j]);
     
    }
}
}
}