package jp.co.sss.sys.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * エンティティクラス
 * @author Inoue Nami
 *
 */
@Entity
@Table(name = "employee")
public class Employee {

	/**
	 * 社員番号
	 */
	@Id
	private String empId;

	//ゲッターセッター
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	/**
	 * パスワード
	 */
	private String password;

	//ゲッターセッター
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 社員名
	 */
	private String empName;

	//ゲッターセッター
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/**
	 * 生年月日
	 */
	private String birthday;

	//ゲッターセッター
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	/**
	 * 性別
	 */
	private String gender;

	//ゲッターセッター
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
