/**
 * @author teterkin@gmail.com
 * @version 06/12/2017
 * @link https://github.com/teterkin/Java1/blob/master/src/HomeWork5.java
 */
public class HomeWork5
{
    /**
     * Main class
     * We add 5 fake employees for testing
     * Next we test showAllAboveForty() method, sending all-employees array as argument.
     * Method shows all the workers with age above 40 and all their data.
     * @param args
     */
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[5];
        
        employees[0] = new Employee(
                "Иван", "Иванов", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        
        employees[1] = new Employee(
                "Василий", "Петров", "Programmer",
                "petroff@mailbox.com", "2121212121", 60000, 45);
        employees[2] = new Employee(
                "Андрей", "Сидоров", "Boss",
                "asido@mailbox.com", "1212232323", 180000, 50);
        employees[3] = new Employee(
                "Петр", "Васечкин", "Intern",
                "vasechki@mailbox.com", "12123232", 25000, 25);
        employees[4] = new Employee(
                "Ульяна", "Васильева", "Programmer",
                "uva@mailbox.com", "12123224434", 60000, 30);
        
        showAllAboveForty(employees);
        
    }
    
    /**
     * Simple method to display all employees data.
     * We display only employees with age above 40.
     * @param employees - array of all employees (of class Employee).
     */
    public static void showAllAboveForty(Employee[] employees)
    {
        for (Employee employee : employees)
        {
            if (employee.getAge() > 40)
                System.out.println(employee.getAllData());
        }
    }
}

/**
 * Default class for Employee
 */
class Employee
{
    /**
     * Properties
     */
    private String firstName;
    private String secondName;
    private String jobTitle;
    private  String email;
    private String phone;
    private int salary;
    private int age;
    
    /**
     * Constructor
     * All the properties are self-explaining:
     * @param firstName
     * @param secondName
     * @param jobTitle
     * @param email
     * @param phone
     * @param salary
     * @param age
     */
    public Employee(String firstName, String secondName, String jobTitle, String email, String phone, int salary, int age)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    /**
     * getFirstName getter
     * @return first name.
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * First Name setter
     * @param firstName First Name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    /**
     * Second Name getter
     * @return Second Name
     */
    public String getSecondName()
    {
        return secondName;
    }
    
    /**
     * Second name setter
     * @param secondName Second Name
     */
    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }
    
    /**
     * Job Title getter
     * @return Job Title
     */
    public String getJobTitle()
    {
        return jobTitle;
    }
    
    /**
     * Job Title setter
     * @param jobTitle Job Title
     */
    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }
    
    /**
     * Email getter
     * @return Email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Email setter
     * @param email Email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Phone getter
     * @return Phone number
     */
    public String getPhone()
    {
        return phone;
    }
    
    /**
     * Phone setter
     * @param phone Phone number
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    /**
     * Salary getter
     * @return Salary
     */
    public int getSalary()
    {
        return salary;
    }
    
    /**
     * Salary setter
     * @param salary Salary
     */
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    /**
     * Age getter
     * @return Age
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * Age setter
     * @param age Age
     */
    public void setAge(int age)
    {
        this.age = age;
    }
    
    /**
     * getAllData method
     * @return all data for current employee.
     */
    public String getAllData()
    {
        return "\nFirst Name:  " + firstName +
                "\nSecond Name:  " + secondName +
                "\nJob Title:  " + jobTitle +
                "\nEmail:  " + email +
                "\nPhone:  " + phone +
                "\nSalary:  " + salary +
                "\nAge: " + age + "\n";
    }
}

