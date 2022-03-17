package Part1;

public class Bank {
	// Task 2: At least 1 Customer object

	// Task 2: At least 1 Account object

	// Task 2: At least 1 call of deposit method

	// Task 2: At least 2 calls of withdraw method
}

//Task 2: Customer class
//Your code here

class Customer {
	//Task 2: Fields in Customer class
	//Your code here
	int id;
	String name;
	String phone;

		
	//Task 2: Constructor for Customer class
	//Your code here
	public Customer(int id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
}

class Account {
	double balance;
	Customer customer;
	// Task 2: Add Customer field
	// Your code here

	// Task 2: Modify the constructor
	// to account for Customer field
	Account(Customer customer, double balance) {
		this.customer = customer;
		this.balance = balance;
		// Your code here
	}

	// Task 2: deposit method
	// Your code here
	public String deposit(double deposit) {
		balance += deposit;
		String answer = "Deposit successful";
		return answer;
	}

	// Task 2: withdraw method
	// Your code here
	public String withdraw(double withdraw) {
		balance -= withdraw;
		String answer = "Withdrawal successful";
		if (balance < 0) {
			answer = "Insufficient balance";
			balance += withdraw;
		}
		return answer;
	}
}