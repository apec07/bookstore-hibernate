package idv.cm.db;

import javax.persistence.*;

@Entity/*指定當前類是持久化實體類（不能省略）*/
@Table(name = "B_USER")
public class UserVO implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue   
	private int id;
	@Column(name = "user",unique=true)
	private String user;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "EMAIL")
	private String email;
//	private BookList<String> books;
	
	public UserVO() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj instanceof UserVO) {
			UserVO user = (UserVO) obj;
			return user.equals(user.getUser())&& password.equals(user.getPassword());
		}
		return false;
	}

	@Override
	public String toString() {
		return "UserVO [name=" + user + ", password=" + password + ", email=" + email + "]";
	}


	
}
