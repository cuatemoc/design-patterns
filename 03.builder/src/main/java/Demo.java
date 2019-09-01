import model.Person;
import model.builders.faceted.PersonBuilderFaceted;
import model.builders.inherited.EmployeeBuilder;

public class Demo {
    public static void main(String[] args) {

        Person john = new EmployeeBuilder()
                .name("John")
                .position("Dev")
                .build();

        System.out.println(john);

        Person sam = new PersonBuilderFaceted()
                .name("Sam")
                .address()
                    .city("SF")
                    .streetAddress("Main St.")
                    .postCode("N1234")
                .job()
                    .position("Dev")
                    .companyName("Google")
                    .annualIncome(9999999)
                .build();

        System.out.println(sam);
    }
}