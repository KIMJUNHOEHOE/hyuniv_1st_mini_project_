package com.spring.baseball;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.baseball.dao.AllPlayerDao;
import com.spring.baseball.dao.HPlayerDao;
import com.spring.baseball.dao.PPlayerDao;
import com.spring.baseball.dao.TeamDao;
import com.spring.baseball.dao.TeamPlayerDao;
import com.spring.baseball.dto.AllPlayer;
import com.spring.baseball.dto.HPlayer;
import com.spring.baseball.dto.PPlayer;

import com.spring.baseball.dto.TeamPlayer;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	HPlayerDao hplayerdao;
	@Autowired
	PPlayerDao pplayerdao;
	@Autowired
	AllPlayerDao allplayerdao;

	@Autowired
	TeamPlayerDao teamplayerdao;
	
	@RequestMapping(value="hsearch.do", method = RequestMethod.POST)
	public String hsearch(HPlayer Hplayer, Model model) {
		
			try {
							
				List<HPlayer> h_list = hplayerdao.getHPlayers(Hplayer);
							model.addAttribute("HLists", h_list);
					
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					return "home";
				}
	
	@RequestMapping(value="psearch.do", method = RequestMethod.POST)
	public String psearch(PPlayer Pplayer, Model model) {
		
			try {
				
				List<PPlayer> p_list = pplayerdao.getPPlayers(Pplayer);
				
				model.addAttribute("PLists", p_list);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return "home";
		}
	@RequestMapping(value="hlist.do", method = RequestMethod.POST)
	public String hlistsearch(HPlayer hplayer, Model model) {
		
			try {
				
				List<HPlayer> h_list = hplayerdao.getHnameOnly(hplayer);
				
				model.addAttribute("HnameLists", h_list);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return "home";
		}
	
	@RequestMapping(value="plist.do", method = RequestMethod.POST)
	public String plistsearch(PPlayer pplayer, Model model) {
		
			try {
				
				List<PPlayer> p_list = pplayerdao.getPnameOnly(pplayer);
				
				model.addAttribute("PnameLists", p_list);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return "home";
		}
	
	@RequestMapping(value="teamSearch.do", method = RequestMethod.POST)
	public String tsearch(TeamPlayer teamplayer, Model model) {
		
		try {
			if (teamplayer.getHorp().equals("pitchersearch")) {
				List<TeamPlayer> t_list = teamplayerdao.getpitchername(teamplayer);
				
				model.addAttribute("Teampicherlist", t_list);
			}
			else  {
					List<TeamPlayer> t_list = teamplayerdao.gethittername(teamplayer);
					
					model.addAttribute("Teamhitterlist", t_list);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "home";
	}
	
}
