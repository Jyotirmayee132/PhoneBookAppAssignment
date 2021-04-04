package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.beans.Contact;
import in.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements IContactService {
	ContactRepository repo;

	public ContactServiceImpl(ContactRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean saveOrUpdateContactDetails(Contact contact) {
		Contact saveObj = repo.save(contact);
		/*
		 * if(saveObj.getContactId()!=null) { return true; }else{ return false; }
		 */

		return (saveObj.getContactId()!=null);
	}

	@Override
	public List<Contact> getAllContacts() {
		/*List<Contact> findAll = repo.findAll();
		return findAll;*/
		return repo.findAll();
				
	}

	@Override
	public Contact getContactbyId(Integer id) {
		Optional<Contact> findById = repo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		
		
		return null;
	}

	@Override
	public Boolean deleteContact(Integer id) {
		boolean isDeleted=false;
		try {
			repo.deleteById(id);
			isDeleted=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		
		return isDeleted;
	}

}
