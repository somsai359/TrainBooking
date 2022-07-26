package Travel;
import java.time.LocalDate;

public class Trainname {
public static void main(String[] args) {
	TrainService.searchTrainBetweenStations("Tirupathi", "Bangolr", LocalDate.now(), 10);
}
}
