public class MainSLinkedList {

    public static void main(String[] args) {

        Employee RR = new Employee("Rakesh", "Roshan", 10);
        Employee SK = new Employee("Shalu", "Koli",20);
        Employee AB = new Employee("Apoorv", "Bajpai", 30);
        Employee AI = new Employee("Anurag", "Iyar", 40);

        EmployeeLinkedList emp = new EmployeeLinkedList();

        emp.addToFront(RR);
        emp.addToFront(SK);
        emp.addToFront(AB);
        emp.addToFront(AI);

        emp.printList();



    }

}
