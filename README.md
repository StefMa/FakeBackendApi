# Fake backend api
## The problem
Have you ever tried to start a (client) implementation which needs to talk to a backend but your backend isn't ready?
Yeah, that is a problem. To solve this you need a kind of a fake implementation. A possible solution can you find here.
## The solution
First think is to design your api with your backend co-workings. 
Now you know your calls and all thinks you need. In this example we have a kind of `personal information` backend.
```java
interface RestApi {

    List<String> getAllUserNames();

    String getUserNameFromId(int id);

    void createUserId(String name);

    void addNewUser(String name, int id);

    int getStage();

}
```
This is an interface because you need to multiple implementation for this (some people call it `programming against an interface`).

For a very well written api we need at least three implementations. The first one the `FakeApi` which implements our `RestApi`. 
Your methods can here return fakes or mocks. The second one is the `ProdApi`. This class implements `RestApi` too but uses real backend communication (if ready) instead of fakes.
The last one is for hiding the implementations above. Because the client - which use the client api - don't need any information which conrecte object they use.
For that we have the `Api` class which only delegates all there calls to the concrete objects. 