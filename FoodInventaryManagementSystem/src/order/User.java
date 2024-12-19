package order;

public class User 
{

	//User Credentials
	
		
		private int userId;
		private String userName;
		private long userPhone;
		  private String userAddress;
		
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public long getUserPhone() {
			return userPhone;
		}
		public void setUserPhone(long userPhone) {
			this.userPhone = userPhone;
		}
		 public String getUserAddress() {
		        return userAddress;
		    }

		    public void setUserAddress(String userAddress) {
		        this.userAddress = userAddress;
		    }

	}
