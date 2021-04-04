package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.beans.Contact;
import in.ashokit.service.IContactService;

@Controller
public class ContactOprationController {
	IContactService service;
	  
	
	public ContactOprationController(IContactService service) {
		
		this.service = service;
	}

@GetMapping("/edit")
	public String editContact(@RequestParam("cid")Integer contactId,Model model) {
		
		Contact contactObj = service.getContactbyId(contactId);
		model.addAttribute("contact", contactObj);
		
		
		return "contact";
		
	}
@GetMapping("/delete")
  public String deleteContact(@RequestParam("cid")Integer contactId,Model model) {
	  Boolean isDeleted = service.deleteContact(contactId);
	  if(isDeleted) {
		  model.addAttribute("sucessMsg", "ContactDeleted");
		  
	  }else {
		  model.addAttribute("FailureMsg","ContactNotDeleted");
	  }
	return "redirect:view-Contacts";
	  
  }

}
