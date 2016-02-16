package api;

import java.util.List;

public class Api implements RestApi {

    private RestApi mDelegateApi;

    public Api(int stage) {
        switch (stage) {
            case PROD:
                mDelegateApi = new ProdApi();
                break;
            case DEV:
                mDelegateApi = new FakeApi();
                break;
            default:
                mDelegateApi = new FakeApi();
        }
    }

    @Override
    public List<String> getAllUserNames() {
        return mDelegateApi.getAllUserNames();
    }

    @Override
    public String getUserNameFromId(int id) {
        return mDelegateApi.getUserNameFromId(id);
    }

    @Override
    public void createUserId(String name) {
        mDelegateApi.createUserId(name);
    }

    @Override
    public void addNewUser(String name, int id) {
        mDelegateApi.addNewUser(name, id);
    }

    @Override
    public int getStage() {
        return mDelegateApi.getStage();
    }
}
