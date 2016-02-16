package api;

import java.util.List;

interface RestApi {

    int PROD = 100;

    int DEV = 101;

    List<String> getAllUserNames();

    String getUserNameFromId(int id);

    void createUserId(String name);

    void addNewUser(String name, int id);

    int getStage();

}
