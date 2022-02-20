package emlakburada.repository;

import emlakburada.model.Favorite;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FavoriteRepository {

    private static List<Favorite> favoriteList = new ArrayList<>();

    static {
        Favorite favorite = new Favorite(1L,38164784);
        favoriteList.add(favorite);
        Favorite favorite2 = new Favorite(2L,38164783);
        favoriteList.add(favorite2);
        Favorite favorite3 = new Favorite(1L,38164782);
        favoriteList.add(favorite3);
        Favorite favorite4 = new Favorite(2L,38164781);
        favoriteList.add(favorite4);
        Favorite favorite5 = new Favorite(1L,38164779);
        favoriteList.add(favorite5);
        Favorite favorite6 = new Favorite(2L,38164780);
        favoriteList.add(favorite6);
    }

    public List<Favorite>  findAll(){
        return favoriteList;
    }
}
