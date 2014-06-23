package pe.gob.essalud.sgar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@RequestMapping(value={"", "index.do"})
	public String index () {
		return "index";
	}
}
