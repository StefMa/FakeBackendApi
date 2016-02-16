package api;

import java.util.ArrayList;
import java.util.List;

class FakeApi implements RestApi {

    @Override
    public List<String> getAllUserNames() {
        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("StefMa");
        userNames.add("Lui");
        userNames.add("Peter");
        return userNames;
    }

    @Override
    public String getUserNameFromId(int id) {
        return "StefMa";
    }

    @Override
    public void createUserId(String name) {
        // Do nothing - only a fake implementation
    }

    @Override
    public void addNewUser(String name, int id) {
        // Do nothing - only a fake implementation
    }

    @Override
    public int getStage() {
        return DEV;
    }

}
