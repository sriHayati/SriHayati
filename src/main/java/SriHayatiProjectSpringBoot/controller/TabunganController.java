package SriHayatiProjectSpringBoot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SriHayatiProjectSpringBoot.dao.TabunganDao;
import SriHayatiProjectSpringBoot.model.TabunganModel;

@RestController
@RequestMapping("/ban")
public class TabunganController {
	@Autowired
	TabunganDao TabDao;
	
	@PostMapping("/tabungan")
	public TabunganModel createTabungan(@Valid @RequestBody TabunganModel tm) {
		return TabDao.save(tm);
	}
	
	@GetMapping("/tabungan")
	public List<TabunganModel> getSemuaTabungan(){
		return TabDao.findAll();
	}
}
