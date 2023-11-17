import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1 {

    public class person {
        String surname;
        String firstname;
        String street;
        String zipcode;
        String city;

        public void initialize() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter surname: ");
            this.surname = sc.nextLine();
            System.out.print("Enter first name: ");
            this.firstname = sc.nextLine();
            System.out.print("Enter street: ");
            this.street = sc.nextLine();
            System.out.print("Enter zipCode: ");
            this.zipcode = sc.nextLine();
            System.out.print("Enter city: ");
            this.city = sc.nextLine();
        }

        public void print() {
            System.out.println("Surname: " + this.surname);
            System.out.println("First name: " + this.firstname);
            System.out.println("street: " + this.street);
            System.out.println("zipCode: " + this.zipcode);
            System.out.println("city: " + this.city);
        }
    }

    public class staff extends person {
        String education;
        String position;

        public void initialize1() throws IOException {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            initialize();
            System.out.print("Enter education: ");
            this.education = sc.readLine();
            System.out.print("Enter position: ");
            this.position = sc.readLine();
        }

        public void print1() {
            print();
            System.out.println("Education: " + education);
            System.out.println("Position: " + position);
        }
    }


    class HR {
        public void main(String[] args) throws IOException {
            staff st = new staff();
            st.initialize1();
            st.print1();
        }
    }
}




