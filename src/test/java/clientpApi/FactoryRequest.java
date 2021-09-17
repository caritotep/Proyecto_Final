package clientpApi;

public class FactoryRequest {
    public static Request make(String type){
        Request request;
        switch (type.toLowerCase()){
            case "get":
                request= new RequestGET();
                break;
            case "post":
                request= new RquestPost();
                break;
            case "delete":
                request= new RequestDelete();
                break;
            default:
                request= new RequestGET();
                break;
        }
        return request;
    }
}
