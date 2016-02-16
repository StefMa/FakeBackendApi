import api.Api;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Api api = new Api(Api.DEV);
        main.printApiInformation(api);

        api = new Api(Api.PROD);
        main.printApiInformation(api);
    }

    private void printApiInformation(Api api) {
        String headline = "";
        switch (api.getStage()) {
            case Api.PROD:
                headline = "-- Information from production server --";
                break;
            case Api.DEV:
                headline = "-- Information from development server --";
                break;
        }
        System.out.println(headline);

        String userNameFromId = api.getUserNameFromId(2);
        System.out.println("Username: " + userNameFromId);
        List<String> allUserNames = api.getAllUserNames();
        System.out.println("-- All user names --");
        for (String userName : allUserNames) {
            System.out.println("Username: " + userName);
        }
        System.out.println("Enf od Information\n");
    }

}
