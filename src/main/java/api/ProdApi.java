package api;

import java.util.Collections;
import java.util.List;

class ProdApi implements RestApi {

    @Override
    public List<String> getAllUserNames() {
        // TODO: Make a REAL call to your API backend
        return Collections.emptyList();
    }

    @Override
    public String getUserNameFromId(int id) {
        // TODO: Make a REAL call to your API backend
        return "";
    }

    @Override
    public void createUserId(String name) {
        // TODO: Make a REAL call to your API backend
    }

    @Override
    public void addNewUser(String name, int id) {
        // TODO: Make a REAL call to your API backend
    }

    @Override
    public int getStage() {
        return PROD;
    }

}
