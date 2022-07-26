package Travel;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;
public class TrainService {

	private static List<Train>  alltrains = new LinkedList<>();
	
	static {
		alltrains.add(new Train(101,"Train-one","Tirupathi","Bangolr",100,800,LocalDate.now()));
		alltrains.add(new Train(101,"Train-o","Tirupathi","Bangolre",100,800,LocalDate.now()));
		alltrains.add(new Train(101,"Train-o","Tirupathi","Bangolre",100,800,LocalDate.now()));
		alltrains.add(new Train(101,"Train","Tirupathi","Bangolre",100,800,LocalDate.now()));
	}

	public TrainService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Train findTrain(int trainNumber) {
		Train temp = null;
		for(Train t : alltrains) {
			if(t.getTrainnumber()== trainNumber) {
				temp = t ;
				break;
			}
		}
		return temp;
		
	}
	
	public static void searchTrainBetweenStations(String fromStation, String toStation, LocalDate doj, int numOfSeats) {
		List<Train> searchTrainList = new LinkedList<>();
		for(Train t  : alltrains) {
			if(t.getFromStation().equals(fromStation)&&
			t.getToStation().equals(toStation)&&
			t.getDoj().equals(doj) && 
			t.getSeatsAvailable() > numOfSeats){
				searchTrainList.add(t);
				
			}
			
			if(searchTrainList.size()==0) {
				System.out.println("Sorry no matching train is not avaialble");
			}
			else {
				System.out.println("Tr.NO\tTrain name\tFrom station\tDoj\tSeats Avaiable\tFare" );
				System.out.println();
				for(Train t1 : searchTrainList) {
					System.out.printf("%4d%20s%15s%15s%12s%4d%5d",t1.getTrainnumber(),t1.getTrainName(),t1.getFromStation(),t1.getToStation(),t1.getDoj(),t1.getSeatsAvailable(),t1.getFare());
				}
			}
			
		}
	
	}
	

}
