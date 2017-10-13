package cn.lfsenior.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 博客用户实体
 * @author LFSenior
 *
 *下午3:16:21
 *
 */
public class BlogUser implements Serializable{
	private static final long serialVersionUID = 6882825785076878575L;
	private Integer userId;
	private String userName;
	private Integer userAge;
	private String userAddress;
	private String userGender;
	private String userDescrip;
	private Date userBrith;
	private String userEmail;
	private String userTel;
	private String userQQ;
	private String userPwd;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserDescrip() {
		return userDescrip;
	}
	public void setUserDescrip(String userDescrip) {
		this.userDescrip = userDescrip;
	}
	public Date getUserBrith() {
		return userBrith;
	}
	public void setUserBrith(Date userBrith) {
		this.userBrith = userBrith;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserQQ() {
		return userQQ;
	}
	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
}
