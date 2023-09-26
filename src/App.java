public class App {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee();
        emp.name = "Tomi";
        emp.city = "Aszód";
        emp.salary = 385;
        emp.status = Status.ACTIVE;
        if(emp.status == Status.ACTIVE){
            System.out.println("Aztakurvaaaaaaaaaa");
        }
    }
}
