class Employee { String name; Address address; //Aggregation: Employee HAS-A Address 
  Employee(String name, Address address)
   { 
    this.name = name; 
    this.address = address;
   } 
   void display()
  { 
    System.out.println(name + " lives in " + address.city + ", " + address.state);

   } 
  }