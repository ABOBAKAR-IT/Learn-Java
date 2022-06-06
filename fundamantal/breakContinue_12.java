public class breakContinue_12 {
    public static void main(String[] args) {
        //⁡⁢⁣⁣​‌‌‍𝘽𝙧𝙚𝙖𝙠 ​⁡
        // The break statement can also be used to jump out of a loop.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
          }  

        //   ⁡⁢⁣⁣​‌‌‍𝙅𝙖𝙫𝙖 𝘾𝙤𝙣𝙩𝙞𝙣𝙪𝙚​⁡
        //   The continue statement breaks one iteration (in the loop), if a specified condition occurs,
        //    and continues with the next iteration in the loop.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
          }  
    }
}
