package com.company.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.admin.command.AdminCriteria;
import com.company.admin.command.AdminVO;
import com.company.admin.service.AdminService;

@Controller
@RequestMapping("/food/*")
public class Site_FoodController {

	@Autowired
	private AdminService service;

	@RequestMapping("/Food_Map")
	public String Food_Map() {
		return "/food/Food_Map";
	}

	@RequestMapping("/Udo_Food")
	public String Udo_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Udo_Food";
	}

	@RequestMapping("/Seongsan_Food")
	public String Seongsan_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Seongsan_Food";
	}

	@RequestMapping("/Pyoseon_Food")
	public String Pyoseon_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Pyoseon_Food";
	}

	@RequestMapping("/Namwon_Food")
	public String Namwon_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Namwon_Food";
	}

	@RequestMapping("/Seogwipo_Food")
	public String Seogwipo_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Seogwipo_Food";
	}

	@RequestMapping("/Jungmun_Food")
	public String Jungmun_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Jungmun_Food";
	}

	@RequestMapping("/Andeok_Food")
	public String Andeok_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Andeok_Food";
	}

	@RequestMapping("/Daejung_Food")
	public String Daejung_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Daejung_Food";
	}

	@RequestMapping("/Gapa_Food")
	public String Gapa_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Gapa_Food";
	}

	@RequestMapping("/Mara_Food")
	public String Mara_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Mara_Food";
	}

	@RequestMapping("/Hankyung_Food")
	public String Hankyung_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Hankyung_Food";
	}

	@RequestMapping("/Chagwi_Food")
	public String Chagwi_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Chagwi_Food";
	}

	@RequestMapping("/Biyang_Food")
	public String Biyang_Food(Model model, AdminCriteria adcri) {

		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Biyang_Food";
	}

	@RequestMapping("/Hanlim_Food")
	public String Hanlim_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Hanlim_Food";
	}

	@RequestMapping("/Aewol_Food")
	public String Aewol_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Aewol_Food";
	}

	@RequestMapping("/Jeju_Food")
	public String Jeju_food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Jeju_Food";
	}

	@RequestMapping("/Jocheon_Food")
	public String Jocheon_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Jocheon_Food";
	}

	@RequestMapping("/Gujwa_Food")
	public String Gujwa_Food(Model model, AdminCriteria adcri) {
		ArrayList<AdminVO> falist = service.adGetList(adcri);

		model.addAttribute("fa_list", falist);
		return "/food/Gujwa_Food";
	}

}
