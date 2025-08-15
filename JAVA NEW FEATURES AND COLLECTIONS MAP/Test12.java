import java.util.Random;

public class Test12
{
    public static void main(String[] args) {

        Random rd= new Random();
        int random3Digit = 100 + rd.nextInt(900); // 100 to 999
        System.out.println(random3Digit);
        long accountnumber=35471226636l;

String res=String.valueOf(accountnumber);
System.out.println(res);

//now i want to genrate 3digit number  genrate customer id for account holder
//combination of accountnumber  and random digit

String cid=res.substring(0, 3);
System.out.println("Cid:"+cid);

//noe adding random 3 digit in accountnumber


String finalcusid=res.substring(0, 3);
String result=finalcusid+random3Digit;

System.out.println("this is customer id for accoount holder:"+result);










        
    }
}