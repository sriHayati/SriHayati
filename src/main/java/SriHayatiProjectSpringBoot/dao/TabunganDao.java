package SriHayatiProjectSpringBoot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SriHayatiProjectSpringBoot.model.TabunganModel;
import SriHayatiProjectSpringBoot.repository.TabunganRepository;

@Service
public class TabunganDao {
	@Autowired
	TabunganRepository TabRepository;
	
	public TabunganModel save(TabunganModel tm){
		return TabRepository.save(tm);
	}
	
	public List<TabunganModel> findAll(){
		return TabRepository.findAll();
	}
	
	public TabunganModel getFindOne(Long id) {
		return TabRepository.findOne(id);
	}
}
