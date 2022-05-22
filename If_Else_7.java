public class If_Else_7 {
    public static void main(String[] args) {
       ​‌‍‌ //​ ⁡⁢⁣⁣​‌‌‍‍𝙏𝙝𝙚 𝙞𝙛 𝙎𝙩𝙖𝙩𝙚𝙢𝙚𝙣𝙩​⁡
        if (20 > 18) {
            System.out.println("20 is greater than 18"); // obviously
        }
        // ​‌‌‍⁡⁢⁣⁣𝙏𝙝𝙚 𝙚𝙡𝙨𝙚 𝙎𝙩𝙖𝙩𝙚𝙢𝙚𝙣𝙩⁡​
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // ⁡⁢⁣⁣​‌‌‍‍‍𝗧𝗵𝗲 𝗲𝗹𝘀𝗲 𝗶𝗳 𝗦𝘁𝗮𝘁𝗲𝗺𝗲𝗻𝘁​⁡
        if (time < 10) {
            System.out.println("Good morning.");
          } else if (time < 20) {
            System.out.println("Good day.");
          }  else {
            System.out.println("Good evening.");
    }


    // ⁡⁢⁣⁣​‌‌‍𝙅𝙖𝙫𝙖 𝙎𝙝𝙤𝙧𝙩 𝙃𝙖𝙣𝙙 𝙄𝙛...𝙀𝙡𝙨𝙚 (𝙏𝙚𝙧𝙣𝙖𝙧𝙮 𝙊𝙥𝙚𝙧𝙖𝙩𝙤𝙧)​⁡
    String result;
    result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
}}
