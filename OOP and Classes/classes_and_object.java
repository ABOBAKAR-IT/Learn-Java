class Second {
    public void show() {
      classes_and_object myObj = new classes_and_object();
      System.out.println(myObj.x+1);
     // myObj.y=55;//this is not allowed
      System.out.println(myObj.y);
    }
  }

public class classes_and_object {
    int x = 5;
final int y = 10;// final works like const in c++
    public static void main(String[] args) {
      classes_and_object myObj = new classes_and_object();
      System.out.println(myObj.x);
      Second obj=new Second();
      obj.show();
    }
}

  