package kr.or.ksmart.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.thymeleaf.vo.Member;

@Controller
public class ExamController {
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("layout", "thymeleaf layout");
		
		return "index";
	}
	
	@GetMapping("/exam1")
	public String exam01() {
		
		return "exam01";
	}
	
	@GetMapping("/exam2")
	public String exam02(Model model) {
		
		model.addAttribute("test", "Hello thymeleaf");
		
		return "exam02";
	}
	
	@GetMapping("/exam3")
	public String exam03(Model model) {
		
		Member member = new Member("id001","pw001","관리자","홍길동","email@ksmart.or.kr");
		model.addAttribute("member", member);
		
		return "exam03";
	}
	
	@GetMapping("/exam4")
	public String exam04(Model model) {
		
		List<Member> list = new ArrayList<Member>();
		
		for(int i = 0; i < 10; i++) {
			list.add(new Member("id00"+i, "pw00"+i, "level"+i, "홍0"+i,"email"+i+"@ksmart.or.kr"));
		}
		
		model.addAttribute("list", list);
		
		return "exam04";
	}
	
	@GetMapping("/exam5")
	public String exam05(Model model) {
		
		List<Member> list = new ArrayList<Member>();
		
		for(int i = 0; i < 10; i++) {
			list.add(new Member("id00"+i, "pw00"+i, "level"+i, "홍0"+i,"email"+i+"@ksmart.or.kr"));
		}
		
		model.addAttribute("list", list);
		
		return "exam05";
	}
	
	@GetMapping("/exam6")
	public String exam06(Model model) {
		
		List<Member> list = new ArrayList<Member>();
		
		for(int i = 0; i < 10; i++) {
			list.add(new Member("id00"+i, "pw00"+i, "level"+i, "홍0"+i,"email"+i+"@ksmart.or.kr"));
		}
		
		model.addAttribute("list", list);
		
		return "exam06";
	}
	
	@GetMapping("/exam7")
	public String exam07(Model model) {
		
		model.addAttribute("now", new Date());
	    model.addAttribute("price", 123456789);
	    model.addAttribute("title", "ksmart exam07");
	    
		return "exam07";
	}
	
	@GetMapping("/exam8")
	public String exam08(Model model) {
		
		model.addAttribute("now", new Date());
		model.addAttribute("price", 123456789);
		model.addAttribute("title", "ksmart exam07");
		
		return "exam08";
	}
}
