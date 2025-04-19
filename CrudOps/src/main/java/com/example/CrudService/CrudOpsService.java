package com.example.CrudService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.Model.CrudModel;
import com.example.Crud.Rerpository.CrudRepository;

@Service
public class CrudOpsService {

	@Autowired
	private CrudRepository crudRepository;
	
	public List<CrudModel> getAllUsers(){
		return crudRepository.findAll();
	}
	public Optional<CrudModel> getUserById(Long Id){
		return crudRepository.findById(Id);
	}
	public CrudModel CreateNewUser(CrudModel crudmodel) {
		return crudRepository.save(crudmodel);
	}
	
	public CrudModel UpdateUser(Long Id, CrudModel userdetails) {
		CrudModel crudmodel = crudRepository.findById(Id).orElseThrow(() -> new RuntimeException("User not found"));
		crudmodel.setName(userdetails.getName());
		crudmodel.setEmail(userdetails.getEmail());
		return crudRepository.save(crudmodel);
	}
	public void DeleteUser(Long Id) {
		 crudRepository.deleteById(Id);
	}

}
