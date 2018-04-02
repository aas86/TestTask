import ru.testtask.alaevandrey.controller.Controller;
import ru.testtask.alaevandrey.gui.FrameView;
import ru.testtask.alaevandrey.model.DataBaseConnector;

public class Main {
    public static void main(String[] args) {
        FrameView frameView = new FrameView();
        DataBaseConnector dataBaseConnector = new DataBaseConnector();
        Controller controller = new Controller(frameView, dataBaseConnector);
        frameView.addNewListener(controller);
        frameView.startApplication();
    }
}
