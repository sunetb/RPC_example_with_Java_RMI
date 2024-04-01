import java.io.Serializable;

public class CustomObject implements Serializable { //Serializable needed for passing objects to streams

    private static final long serialVersionUID = 20120731125400L; //ID needed for serializable
    private String data;

    public String getData (){
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
