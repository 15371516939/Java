package absclass;

/**
 * @author duyunjian
 */
public class TestEmployee  {
    public static void main(String[] args) {
        Employee employee= new JavaEE();
        employee.setId("001");
        employee.setName("Duyunjian");
        employee.work();
        System.out.println(employee);
        System.out.println("************************");
        employee =new Android();
        employee.setId("002");
        employee.setName("Tom");
        employee.work();
        System.out.println(employee);
        System.out.println("************************");
        employee =new ITOfficer();
        employee.setId("003");
        employee.setName("Jack");
        employee.work();
        System.out.println(employee);
        System.out.println("************************");
        employee =new Hardware();
        employee.setId("004");
        employee.setName("Allen");
        employee.work();
        System.out.println(employee);

    }
}
