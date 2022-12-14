package Model.Usuarios;

public class Worker implements AbstractUser {

	private String id;
	private String name;
	private String role;
	private String workplace;

	public Worker(String[] info) {
		try {
			Integer.valueOf(info[3]);
			System.out.println(info[3] + " no es un lugar de trabajo valido");
		} catch (Exception e) {
			this.id = info[0];
			this.name = info[1];
			this.role = info[2];
			this.workplace = info[3];
		}

	}

	@Override
	public String getid() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getrole() {
		// Metodo para obtener el rol del usuario
		return role;
	}

	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void setrole(String role) {
		// TODO Auto-generated method stub
		this.role = role;
	}

	@Override
	public void setid(String id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	@Override
	public String getP() {
		// TODO Auto-generated method stub
		return this.workplace;
	}

	@Override
	public void setP(String P) {
		// TODO Auto-generated method stub
		this.workplace = P;
	}

}
