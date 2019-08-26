import java.util.ArrayList;

public class ProcessoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processo p1 = new Processo(1, 10, 10);
		//System.out.println(p1.toString());

		Processo p2 = new Processo(2, 20, 20);
		//System.out.println(p2.toString());
		
		ArrayList<Processo> lp = new ArrayList<Processo>();
		lp.add(p1);
		lp.add(p2);
		
		for (Processo processo : lp) {
			System.out.println(processo.toString());
		}
	}

}
