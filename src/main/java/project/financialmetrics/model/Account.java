package project.financialmetrics.model;



import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Account{

	@Id
	private int accountId;
	private String firstName;
	private String lastName;
	private String email;

}
