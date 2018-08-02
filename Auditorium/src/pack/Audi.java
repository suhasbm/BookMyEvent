package pack;

public class Audi {
	private int eventid;
	private String eventname;
	private String category;
	private int ticketprice;
	private int quantity;
	private String eventdate;
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	public Audi(int eventid, String eventname, String category, int ticketprice, int quantity, String eventdate) {
		super();
		this.eventid = eventid;
		this.eventname = eventname;
		this.category = category;
		this.ticketprice = ticketprice;
		this.quantity = quantity;
		this.eventdate = eventdate;
	}
	public Audi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
