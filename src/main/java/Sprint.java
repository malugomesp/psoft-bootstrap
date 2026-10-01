import java.time.LocalDate;

public class Sprint {
	private int id;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Pessoa liderTemporario;

	public Sprint(int id, LocalDate dataInicio, LocalDate dataFim) {
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public void cadastraLider(Pessoa dev) {
		this.liderTemporario = dev;
		if (dev != null) {
			dev.setPapel(new PapelLider());
		}
	}

	public int getId() {
		return id;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public Pessoa getLiderTemporario() {
		return liderTemporario;
	}
}
