package day20;

import lombok.Data;

@Data

public class PhoneBook {
		
	private String name,work,number;

	public PhoneBook(String name, String work, String number) {
		this.name = name;
		
		this.work = work;
		this.number = number;
	}

	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", work=" + work + ", number=" + number
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneBook other = (PhoneBook) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;		
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (work == null) {
			if (other.work != null)
				return false;
		} else if (!work.equals(other.work))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());	
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((work == null) ? 0 : work.hashCode());
		return result;
	}
	
	}
	

