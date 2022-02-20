package emlakburada.service.concrete;

import emlakburada.model.Favorite;
import emlakburada.repository.FavoriteRepository;
import emlakburada.service.abstracts.FavoriteServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FavoriteService implements FavoriteServiceHelper {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public List<Favorite> findAll(Long id) {
        List<Favorite> favoriteList = favoriteRepository.findAll();
        List<Favorite> list = new ArrayList<>();
        for (Favorite favorite: favoriteList) {
            if(favorite.getUserId() == id){
                list.add(favorite);
            }
        }
        return list;
    }
}
