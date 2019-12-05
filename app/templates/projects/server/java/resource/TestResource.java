package <%= package %>.resource;

public class TestResource implements TestService {

    @Override
    public String ping(String pong) {
        return "pong-" + pong;
    }

}