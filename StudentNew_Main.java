public class StudentNew_Main {
    public static void main(String[] args) {
        AddressStudent address = new AddressStudent();
        StudentNew student = new StudentNew();

        address.setId(234);
        address.setAddressCity("Noida");
        address.setAddressStreet("Sector 12P");
        address.setAddressState("UP");

        student.setId(1);
        student.setName("Sakti Suman");
        student.setPercentage(89.5f);
        student.setAddress(address);

        System.out.println("Student Information: ");
        System.out.println("ID: "+student.getId());
        System.out.println("Name: "+student.getName());
        System.out.println("Percentage: "+student.getPercentage()+"%");

        System.out.println("Student Address: ");
        System.out.println("ID: "+address.getId());
        System.out.println("City: "+address.getAddressCity());
        System.out.println("Street: "+address.getAddressStreet());
        System.out.println("State: "+address.getAddressState());
    }
}
