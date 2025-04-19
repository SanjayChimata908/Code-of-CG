package com.example.CrudController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Crud.Model.CrudModel;
import com.example.CrudService.CrudOpsService;

@RestController
@RequestMapping("/api/users")
public class CrudOpsController {

	@Autowired
	private CrudOpsService crudservice;
	
	@GetMapping
	public List<CrudModel> ListAllUsers(){
		return crudservice.getAllUsers();
	}
	
	@GetMapping("/{Id}")
	public 	ResponseEntity<CrudModel> getUserById(@PathVariable Long Id){
		CrudModel crudmodel = crudservice.getUserById(Id).orElseThrow(() -> new RuntimeException("User Not Found"));
		return ResponseEntity.ok(crudmodel);
		
	}
	@PostMapping("/newUser")
	public CrudModel createuser(@RequestBody CrudModel crudmodel) {
		return crudservice.CreateNewUser(crudmodel);
	}
	@PutMapping("/{Id}")
	public ResponseEntity<CrudModel> Updateuser(@PathVariable Long Id, @RequestBody CrudModel userdetails){
		CrudModel crudmodel = crudservice.UpdateUser(Id, userdetails);
		return ResponseEntity.ok(crudmodel);
	}
	@DeleteMapping("/{Id}")
	public ResponseEntity<Void> DeleteUser(Long Id) {
		crudservice.DeleteUser(Id);
		return ResponseEntity.noContent().build();
	}
	
}
