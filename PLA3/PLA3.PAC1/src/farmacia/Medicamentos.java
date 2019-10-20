package farmacia;

public class Medicamentos {

	private String name;
	private String IdMedicamento;
	private double precio;
	private String descripcion;
	private String producer;
	private String categoria;
	private int stockCantidad;
	private long stockPorRegistrar;
	private boolean activo;
	
	public Medicamentos() {
		
	}
	
	public Medicamentos(String medicamentoId, String name, double precio) {
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdMedicamento() {
		return IdMedicamento;
	}
	public void setIdMedicamento(String idMedicamento) {
		IdMedicamento = idMedicamento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getStockCantidad() {
		return stockCantidad;
	}
	public void setStockCantidad(int stockCantidad) {
		this.stockCantidad = stockCantidad;
	}
	public long getStockPorRegistrar() {
		return stockPorRegistrar;
	}
	public void setStockPorRegistrar(long stockPorRegistrar) {
		this.stockPorRegistrar = stockPorRegistrar;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
	
	
}
