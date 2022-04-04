package Models;

import java.util.List;

public class Panier_Model {

    public List<ArticlesEntity> list;

    public Panier_Model() {

    }

    public List<ArticlesEntity> getList() {
        return list;
    }

    public void setList(List<ArticlesEntity> list) {
        this.list = list;
    }
}
