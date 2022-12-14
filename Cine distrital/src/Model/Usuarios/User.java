package Model.Usuarios;

public class User implements AbstractUser {
	private String id;
	private String points;
	private String role;

	public User(String[] info) {
		try {
			Integer.valueOf(info[3]);
		} catch (Exception e) {
			System.out.println(info[3] + " no es un numero de puntos valido");
		}
		this.id = info[0];
		this.role = "customer";
		this.points = info[3];
	}

	@Override
	public String getid() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return role;
	}

	public int getpoints() {
		// TODO Metodo para obtener los puntos del usuario(como enteros)
		return Integer.valueOf(points);
	}

	@Override
	public String getrole() {
		// Metodo para obtener el rol del usuario
		return role;
	}

	public void addpoints(int a) {
		// Metodo para sumar puntos al usuario
		this.points = Integer.valueOf(points) + a + "";
	}

	@Override
	public void setname(String name) {
		// TODO Auto-generated method stub
		// Metodo vacio
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

	public void substractpoints(int a) {
		// TODO Auto-generated method stub
		this.points = Integer.valueOf(points) - a + "";
	}

	@Override
	public String getP() {
		// TODO Auto-generated method stub
		return this.points;
	}

	@Override
	public void setP(String P) {
		// TODO Auto-generated method stub
		this.points = P;
	}

}
