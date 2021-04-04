package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Component;

import in.ashokit.beans.Contact;
@Component
public interface IContactService {

	boolean saveOrUpdateContactDetails(Contact contact);;
	
	
	 List<Contact> getAllContacts();
	
	 Contact getContactbyId(Integer id);
	 
	
	   Boolean deleteContact(Integer id );



}



