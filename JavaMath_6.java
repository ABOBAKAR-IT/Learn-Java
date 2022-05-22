public class JavaMath_6 {
    public static void main(String[] args) {
//         ⁡⁢⁣⁣​‌‌‍ 𝗠𝗮𝘁𝗵.𝗺𝗮𝘅(𝘅,𝘆)​⁡
// The Math.max(x,y) method can be used to find the highest value of x and y:
System.out.println(Math.max(5, 10)); 
// ⁡⁢⁣⁣​‌‌‍𝙈𝙖𝙩𝙝.𝙢𝙞𝙣(𝙭,𝙮)​⁡
// The Math.min(x,y) method can be used to find the lowest value of x and y:
System.out.println(Math.min(5, 10)); 


//​‌‌‍ ⁡⁢⁣⁣𝗠𝗮𝘁𝗵.𝘀𝗾𝗿𝘁(𝘅)⁡​
// The Math.sqrt(x) method returns the square root of x:

System.out.println(Math.sqrt(64));

// ⁡⁢⁣⁣​‌‌‍𝙈𝙖𝙩𝙝.𝙖𝙗𝙨(𝙭)⁡​
// The Math.abs(x) method returns the absolute (positive) value of x:
System.out.println(Math.abs(-4.7));  


//​‌‌‍ ⁡⁢⁣⁣𝙍𝙖𝙣𝙙𝙤𝙢 𝙉𝙪𝙢𝙗𝙚𝙧𝙨⁡​
// Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

System.out.println(Math.random());  

// To get more control over the random number, e.g. you only want a random number between 0 and 100, you can use the following formula:

int randomNum = (int)(Math.random() * 101);  // 0 to 100
System.out.println(randomNum);




    }
}
