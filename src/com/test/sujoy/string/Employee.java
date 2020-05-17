package com.test.sujoy.string;
class Employee {
    private int id  = 0;
    
    public Employee(int id) {
           this.setId(id);
    }

    public int getId() {
           return id;
    }

    public void setId(int id) {
           this.id = id;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}  
}