public class HomeWork5
{
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
    
    public static void showAllAboveForty(Employee[] employees)
    {
        for (Employee employee : employees)
        {
            if (employee.getAge() > 40)
                System.out.println(employee.getAllData());
        }
    }
}

class Employee
{
    private String firstName;
    private String secondName;
    private String jobTitle;
    private  String email;
    private String phone;
    private int salary;
    private int age;
    
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
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getSecondName()
    {
        return secondName;
    }
    
    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }
    
    public String getJobTitle()
    {
        return jobTitle;
    }
    
    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public int getSalary()
    {
        return salary;
    }
    
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
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

