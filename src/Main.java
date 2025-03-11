public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+tim.getAge());
        System.out.println("Pay = "+tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/05/1990", "03/03/2021", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" +joe.collectPay());
//        System.out.println("Age = "+joe.getAge());
//        System.out.println("Pay = "+joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03.01.2022", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
