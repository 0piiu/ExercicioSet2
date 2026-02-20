package entities;

public class User implements Comparable<User>{
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public User() {
		
	}

	public User(Integer userId) {
		this.userId = userId;
	}

	@Override
	public int compareTo(User other) {
		// TODO Auto-generated method stub
		return getUserId().compareTo(other.getUserId());
	}
	
	
}
