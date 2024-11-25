package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Advertisement;

@Controller
public class AdvertisementController {
	
	@RequestMapping("/getdetails")
	String getAdvertisementpage(Advertisement aobj)
	{
		return "advertisement";
	}
	
	@RequestMapping("/display")
	public String displayAdvertisementDetails(@ModelAttribute Advertisement aobj, Model model) {
	    model.addAttribute("advertisementType", aobj.getAdvertisementType());
	    return "success"; // Ensure this is lowercase
	}

}
