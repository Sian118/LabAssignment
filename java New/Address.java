class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
    }

    public String getStreet() 
   { return street; 
                    }
     public String getCity() 
   { return city; 
                  }

    @Override
    public boolean equals(Object obj) {
        if (this == obj || getClass() !=obj.getClass()) return true;
        if (obj == null) return false;
        Address address = (Address) obj;
        return street.equals(address.street) && city.equals(address.city);
    }

 
}
