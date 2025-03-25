class School {
    private String name
    private String  address;
    private Principal principal;
    private ClassRoom[] classrooms = new ClassRoom[2];
    private int classCount = 0;

    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
    }

    public void setName(String name)
  { this.name = name; 
  }
    public void setAddress(String address)
    { this.address = address;   


 }
    public void setPrincipal(Principal principal) 
    { this.principal = principal;    
                                        }

    public String getName()
     { return name;  
                       }
    public String getAddress() 
      { return address; 
                          }
    public Principal getPrincipal() 
            { return principal; 
   }

    public void addClassRoom(ClassRoom c) {
        if (classCount < 2) {
            classrooms[classCount++] = c;
        }
    }

    public String toString() {
        String result = "School  " + name + "\nAddress " + address + "\n" + principal.toString() + "\n";
        for (int i = 0; i < classCount; i++) {
            result += classrooms[i].toString() + "\n";
        }
        return result;
    }
}