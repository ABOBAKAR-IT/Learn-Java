

public class if_else_show_grade_task {
    public static void main(String[] args) {
        System.out.println(" Enter Mask");7
        Integer mask= Integer.parseInt(System.console().readLine());
        if(mask>80)
        {
            System.out.println("Your Grade is A");
        }
     else   if(mask>70)
        {
            System.out.println("Your Grade is B");
        }
        else   if(mask>60)
        {
            System.out.println("Your Grade is C");
        }
        else   if(mask>50)
        {
            System.out.println("Your Grade is D");
        }
        else{
            System.out.println("Your Grade is F");
        }
    }
}
