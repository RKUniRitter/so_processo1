
public class Processo {

	int pid;
	int cpu_time;
	int io_time;
	
	public Processo(int p, int ct, int it) {
		pid = p;
		cpu_time = ct;
		io_time = it;
	}
	
	public String toString() {
		return "PID: " +this.pid +", CPU: " +cpu_time +", IO: " +io_time;
	}
	
}
