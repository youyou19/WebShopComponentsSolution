package shop.customers.service;

public class AccountDTO {
	private String accountNumber;
	private String username;
	private String password;

	public AccountDTO(String accountNumber, String username, String password) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
		this.password = password;
	}

	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "account:"+accountNumber+" , "+username+" , "+password;
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
