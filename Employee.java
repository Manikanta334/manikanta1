class Employee
{
    int id;
    String name;
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    } 
    public String toString()
    {
        return id+" "+name;
    }
    public static void main(String args[])
    {
        Employee e = new Employee(22, "Leo");
        System.out.println(e);
    }
}
/*
 * Libraries using toString
 */