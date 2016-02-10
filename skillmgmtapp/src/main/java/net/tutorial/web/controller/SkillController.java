package net.tutorial.web.controller;

import java.util.Arrays;
import java.util.List;

import net.tutorial.model.Skill;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/skills")
public class SkillController {
	Skill s1,s2;
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	public List<Skill> getSkills() {
		s1=  new Skill(1,"Java","High");
		s2=  new Skill(2,"DotNet","High");
		return Arrays.asList(s1,s2);
	}
}
