package pbkurnianto.entity.result;

public class AddItemResult {
    private String result;
    private int created_id;

    public AddItemResult() {
    }

    public AddItemResult(String result, int idcreated) {
        this.result = result;
        this.created_id = idcreated;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getCreated_id() {
        return created_id;
    }

    public void setCreated_id(int created_id) {
        this.created_id = created_id;
    }
}
