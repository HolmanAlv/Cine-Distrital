package Model.Usuarios;

public class User implements AbstractUser {
	//Clase que guarda la informacion basica de un usuario del cine
	private String id;
	private String points;
	private String role;

	public User(String[] info) {
		//Crea una instancia de user con un arreglo que contiene su informacion basica
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
		//Retorna el id del usuario
		return id;
	}

	@Override
	public String getname() {
		//Retorna el rol del usuario
		return role;
	}

	public int getpoints() {
		//retorna los puntos del usuario
		return Integer.valueOf(points);
	}

	@Override
	public String getrole() {
		//retorna el rol del usuario
		return role;
	}

	public void addpoints(int a) {
		// Metodo para sumar puntos al usuario
		this.points = Integer.valueOf(points) + a + "";
	}

	@Override
	public void setname(String name) {
		// Metodo vacio
	}

	@Override
	public void setrole(String role) {
		// metodo vacio
	}

	@Override
	public void setid(String id) {
		//metodo para asignar un id al usuario
		this.id = id;
	}

	public void substractpoints(int a) {
		//metodo para restar puntos al usuario
		this.points = Integer.valueOf(points) - a + "";
	}

	@Override
	public String getP() {
		//metodo para obtener los puntos del usuario
		return this.points;
	}

	@Override
	public void setP(String P) {
		//metodo para asignar una cantidad de puntos determinada al usuario
		this.points = P;
	}

}
