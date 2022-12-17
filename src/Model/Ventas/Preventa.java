package Model.Ventas;

public class Preventa {
	private String idusuario;
	private int Tickets;
	private int TicketsP;
	private int[] Snacks;
	private int puntosusados;
	private int Total;
	private int TotalSnacks;
	private int TotalTicket;
	private int PrecioPerro = 5000;
	private int PrecioBurguer = 5000;
	private int PrecioSoda = 3000;
	private int PrecioTicket = 12000;
	private int PrecioTicketP = 15000;
    private int Ticketsdescontados=0;
	public Preventa() {
		this.idusuario = "";
		this.Tickets = 0;
		this.TicketsP=0;
		int[] init = { 0, 0, 0 };
		this.Snacks = init;
		this.puntosusados = 0;
	}

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public int getTickets() {
		return Tickets;
	}

	public void setTickets(int tickets) {
		Tickets = tickets;
	}

	public void AddTickets(int tickets) {
		this.Tickets = this.Tickets + tickets;
		setTotalTicket();
	}

	public void AddTicketsP(int tickets) {
		TicketsP = TicketsP + tickets;
		setTotalTicket();
	}

	public int[] getSnacks() {
		return Snacks;
	}

	public void setSnacks(int snacks, int i) {
		Snacks[i] = snacks;
	}

	public void addSnacks(int snacks, int i) {
		//Suma los snacks a una posicion dentro del array de snacks dependiendo de su categoria
		if (Snacks[i] >= 0) {
			Snacks[i] = Snacks[i] + snacks;
			if (Snacks[i] < 0) {
				Snacks[i] = 0;
			}
			System.out.println(Snacks[i]);

		} else {

		}
		setTotalSnacks(this.TotalSnacks);
	}

	public int getPuntosusados() {
		return puntosusados;
	}

	public void setPuntosusados(int puntosusados) {
		//Guarda la cantidad de puntos usados 
		this.puntosusados = puntosusados;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal() {
		Total = TotalTicket + TotalSnacks;

	}

	public int getTotalSnacks() {
		return TotalSnacks;
	}

	private void setTotalSnacks(int totalSnacks) {
		//Asigna el total de dinero necesario para pagar los snacks
		this.TotalSnacks = (this.Snacks[0] * PrecioPerro) + (this.Snacks[1] * this.PrecioBurguer)
				+ (this.Snacks[2] * PrecioSoda);
		setTotal();
		System.out.println(this.Snacks[2] * PrecioSoda);
	}

	public int getTicketsP() {
		return TicketsP;
	}

	public void setTicketsP(int ticketsP) {
		TicketsP = ticketsP;
	}

	public int getTotalTicket() {
		return TotalTicket;
	}

	public void setTotalTicket() {
		//Asigna el total de dinero necesario para pagar los asientos seleccionados
		this.TotalTicket = (this.TicketsP * PrecioTicketP) + (this.Tickets * PrecioTicket);
		setTotal();
		System.out.println(this.TotalTicket);
	}
	public int descuento(int puntos) {
		//Realiza el descuento de precio utilizando los puntos
		if(puntos<100) {
			return 0;
		}else {
			if(puntos>100 && (this.Tickets-this.Ticketsdescontados)>0) {
		Double gastadosD=(double)(puntos/100)-(puntos % 100)/100;
		
		System.out.println(gastadosD);
		while(this.Tickets-gastadosD<0) {
			gastadosD--;
		}
		this.Ticketsdescontados=(int) (this.Ticketsdescontados+gastadosD);
		this.TotalTicket=(int) (this.TotalTicket-gastadosD*this.PrecioTicket);
		this.puntosusados=(int) (gastadosD*100);
		return (int) (gastadosD*100);
			}
		}
		return 0;
	}

}
