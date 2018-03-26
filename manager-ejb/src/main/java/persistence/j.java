package persistence;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: j
 *
 */
@Entity

public class j implements Serializable {

	   
	@Id
	private Integer id;
	private static final long serialVersionUID = 1L;

	public j() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
   
}
