package pojo;

public class GetUserData {
    private String status;

    private User data;

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setData(User data){
        this.data = data;
    }
    public User getData(){
        return this.data;
    }
}
