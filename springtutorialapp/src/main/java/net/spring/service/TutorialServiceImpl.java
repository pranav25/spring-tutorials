package net.spring.service;

import net.spring.domain.Chapter1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class TutorialServiceImpl implements TutorialService {
	@Autowired 
	Chapter1 lesson1;
	
	@Override
	public String getChapterDetails() {
		return lesson1.getDescription();
	}
	
	@Override
	public Chapter1 getChapter() {
		return lesson1;
	}
	
	
}
