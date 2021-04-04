package in.ashokit.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="CONTACT_DETAILS")
public class Contact {
	@Id

 @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Contact_ID")
	private Integer contactId;
	@Column(name="Contact_Name")
	private String contactName;
	@Column(name="CONTACT_EMAIL")
	private String contactemail;
	@Column(name="CONTACT_NUMBER")
	private Long contactNo;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactemail() {
		return contactemail;
	}
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "ContactDetails [contactId=" + contactId + ", contactName=" + contactName + ", contactemail="
				+ contactemail + ", contactNo=" + contactNo + "]";
	}

}


