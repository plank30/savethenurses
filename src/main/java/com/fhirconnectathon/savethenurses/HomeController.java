package com.fhirconnectathon.savethenurses;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.fhirconnectathon.savethenurses.json.patient.Patient;
import com.fhirconnectathon.savethenurses.services.rest.RequestPatientData;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		//model.addAttribute("serverTime", formattedDate );
		
		RequestPatientData rpd = new RequestPatientData();
		Patient patient = rpd.getPatient();
		model.addAttribute("firstName", patient.getName().get(0).getGiven().get(0));
		model.addAttribute("lastName", patient.getName().get(0).getFamily().get(0));
		model.addAttribute("addressLine", patient.getAddress().get(0).getLine().get(0));
		model.addAttribute("addressCity", patient.getAddress().get(0).getCity());
		model.addAttribute("addressState", patient.getAddress().get(0).getState());
		model.addAttribute("addressZip", patient.getAddress().get(0).getPostalCode());
		model.addAttribute("phone", patient.getTelecom().get(0).getValue());
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date formattedDateOfBirth = null;
		String formattedDateOfBirth2 = null;
		System.out.println(patient.getBirthDate());
		try {
			formattedDateOfBirth = format.parse(patient.getBirthDate().substring(0, 10));
			formattedDateOfBirth2 = format.format(formattedDateOfBirth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("dob", formattedDateOfBirth2);
		model.addAttribute("patientId1", patient.getIdentifier().get(0).getValue());
		model.addAttribute("patientId2", patient.getIdentifier().get(1).getValue());
		
		return "home";
	}
	
}
