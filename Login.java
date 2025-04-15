package pack;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a user (credentials hardcoded)
        User admin= new User("admin", "12345");
        User adnan= new User("clerk1","123321");






        // Ask for input
        System.out.println("==== Login System ====");
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Validate login
        if (admin.login(inputUsername, inputPassword)) {
            System.out.println("✅ Login successful! Welcome, " + inputUsername + ".");
        } else {
            System.out.println("❌ Invalid username or password.");
        }
        // if (adnan.login(inputUsername, inputPassword)) {
        //     System.out.println("✅ Login successful! Welcome, " + inputUsername + ".");
        // } else {
        //     System.out.println("❌ Invalid username or password.");

        // }
        scanner.close();
    }

}
// class simple{
// public static void main(Strings[]args){
//     protected double num1;
//     protected double num2;
//     simple(){

//     }

// simple()



// }
// simple(double x,double y){
//     num1 =x;
//     num2=y;
// }
// void addition(){
//     sout(num1+num2)
// }
// void multiply(){
//     sout(num1*num2)

// }


// class verifiedsimple extends simple{
//     verified simple(){

//     }
//     verifiedsimple (double a,double b){
//         super(a,b);
//     }
// }




// }