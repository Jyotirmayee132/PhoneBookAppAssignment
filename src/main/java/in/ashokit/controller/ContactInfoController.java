package in.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.beans.Contact;
import in.ashokit.service.IContactService;

@Controller
public class ContactInfoController {

	private IContactService service;

	public ContactInfoController(IContactService service) {
		super();
		this.service = service;
	}

	@GetMapping("/load-Form")
	public String loadForm(Model model) {
		Contact cobj = new Contact();
		// to send data Controller to UI
		model.addAttribute("contact", cobj);

		// return logical view name
		return "contact";
	}
	@PostMapping("/saveContact")
	public String saveContactSubmitBtn(Contact contact, Model model) {
		boolean isSaved = service.saveOrUpdateContactDetails(contact);
		if (isSaved) {
			model.addAttribute("sucessMsg", "Contact Saved");

		} else {
			model.addAttribute("Failure msg", "Contact Saved Fail");

		}

		return "contact";

}
	@GetMapping("/view-Contacts")
	public String handleViewsContactHyperLink(Model model) {
		List<Contact> allContacts = service.getAllContacts();
		model.addAttribute("contacts", allContacts);
		return "contact-display";
	}

}


