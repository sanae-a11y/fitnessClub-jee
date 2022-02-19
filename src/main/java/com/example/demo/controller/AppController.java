package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Activite;
import com.example.demo.entity.Adherent; 
 
import com.example.demo.entity.Commentaire;
import com.example.demo.entity.Reservation;

import com.example.demo.service.ActiviteService;
import com.example.demo.service.AdherentService; 
 
import com.example.demo.service.CommentaireService;
import com.example.demo.service.ReservationService;
 


//the role of the controller is to handle request is like servelete , its the orckestre

@Controller
public class AppController {
	
	 
	@Autowired
	private ActiviteService act_service;
	@Autowired
	private AdherentService adh_service;
	 
	@Autowired
	private ReservationService resv_service;
	@Autowired 
	CommentaireService comm_service;
	
	
	
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	

	 @GetMapping("/admin")
	 public String showEAdminPage() {
		 return "eadmin";
	 }
	
	 
	 @GetMapping("/membre")
	 public String showEMemberPage() {
		 return "emember";
	 }
	
 
	@RequestMapping("/activite")
	   public String showActvitePage(Model model) {
			
		List<Activite> listB=act_service.listAll();
		model.addAttribute("listActivite",listB);
		 
		return "activite";
		}
	
	
	
	
	//ADHERENTS
	@RequestMapping("/adherent")
	   public String showAdherentPage(Model model) {
			
		List<Adherent> listB=adh_service.listAll();
		model.addAttribute("listAdherent",listB);
		 
		return "adherent";
		}
	@RequestMapping("/new_adherent")
	public String showNewAdherentForm(Model model) {
		Adherent adherent = new Adherent();
		model.addAttribute("adherent",adherent);
		
		return "new_adherent";
		
	}
	
	@RequestMapping(value="/save_adh" ,method=RequestMethod.POST)
	public String saveAdherent(@ModelAttribute("adherent") Adherent adherent) {
		
		adh_service.save(adherent);
	 
		 return  "redirect:/adherent";
		 
	}
	
	@RequestMapping("/edit_adh/{id_adherant}")
	public ModelAndView showEditAdherentForm(@PathVariable(name="id_adherant") int id) {
		 System.out.println("Update Adherent with ID = " + id + "...");
		 ModelAndView mav = new ModelAndView("edit_adherent");
		 Adherent adherent = adh_service.get(id) ;
		 mav.addObject("adherent",adherent);
		 return mav;
		
	}
	@RequestMapping("/delete_adh/{id_adherant}")
	public String deleteAdherent(@PathVariable(name="id_adherant") int id) {
		 System.out.println("Delete Adherent with ID = " + id + "...");
		 ResponseEntity<String> test = adh_service.delete(id);
		 System.out.println("bbbbbbbbbbbbbbbbbb "+test);
		 return "redirect:/adherent";
		
	}
	
	
	 
	
	
	//Reservation
	
	@RequestMapping("/reserver/{id_activite}")
	public ModelAndView showReservationForm(@PathVariable(name="id_activite") int id) {
		 System.out.println("Update Adherent with ID = " + id + "...");
		 ModelAndView mav = new ModelAndView("reservation");
		 Activite activite = act_service.get(id) ;
		 Reservation reservation = new Reservation();
		 reservation.setActivite(activite.getNom());
		 mav.addObject("reservation",reservation);
		 return mav;
		
	}
	@RequestMapping(value="/save_resv" ,method=RequestMethod.POST)
	public String saveReservation(@ModelAttribute("reservation") Reservation reservation) {
		
	    resv_service.save(reservation);
	 
		 return  "redirect:/activite";
		 
	}
	
	@RequestMapping("/resv_admin")
	   public String showReservationPage(Model model) {
			
		List<Reservation> listR= resv_service.listAll();
		model.addAttribute("listReservation",listR);
		 
		return "resv_admin";
		}
	
	
	//	LOGIN
	@RequestMapping("/login")
	public String showLogin() {
		return "auth";
	}
	@RequestMapping("/navBar")
	public String shownavBar() {
		return "navBar";
		
	}
	
	
	//COMMENTAIRE
	@RequestMapping("/comm")
	public String showComm(Model model) {
		List<Commentaire> listB=comm_service.listAll();
		model.addAttribute("listComm",listB);
		return "avis_admin";
		
	}
	@RequestMapping("/comm_member")
	public String showCommMember(Model model) {
		List<Commentaire> listB=comm_service.listAll();
		model.addAttribute("listComm",listB);
		return "comm";
		
	}
	@RequestMapping(value="/save_comm" ,method=RequestMethod.POST)
	public String saveComm(@ModelAttribute("commentaire") Commentaire commentaire) {
		 Date d = new Date();
		 commentaire.setDate(d);
		 comm_service.save(commentaire);
		 return  "redirect:/comm_member";
		 
	}
	
	@RequestMapping("/new_comm")
	public String showNewCommentaireForm(Model model) {
		Commentaire comm = new Commentaire();
		model.addAttribute("commentaire",comm);
		
		return "new_comm";
		
	}
	@RequestMapping("/delete_comm/{id_comm}")
	public String deleteAvis(@PathVariable(name="id_comm") int id) {
		 System.out.println("Delete Adherent with ID = " + id + "...");
		 ResponseEntity<String> test = comm_service.delete(id);
		 System.out.println("bbbbbbbbbbbbbbbbbb "+test);
		 return "redirect:/comm";
		
	}
	
//	/save_resv	
//	@RequestMapping("/test")
//	public String test() {
//		return "new_adherent";
//		
//	}
	
	@RequestMapping("/valid_resv/{id_abonn}")
	public String validerResrv(@PathVariable(name="id_abonn") int id) {
		 System.out.println("Validate Reservation with ID = " + id + "...");
		 ResponseEntity<String> test = resv_service.delete(id);
		 System.out.println("bbbbbbbbbbbbbbbbbb "+test);
		 return "redirect:/resv_admin";
		
	}
	
	

}
