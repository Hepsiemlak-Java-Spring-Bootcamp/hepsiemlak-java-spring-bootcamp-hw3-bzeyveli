package emlakburada.service.abstracts;

import emlakburada.model.Favorite;

import java.util.List;

public interface FavoriteServiceHelper {

    List<Favorite> findAll(Long id);
}
