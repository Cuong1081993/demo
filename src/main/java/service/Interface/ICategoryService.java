package service.Interface;

import model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getAllCategory();
    Category findCategoryById(int id);
    boolean insertCategoryBySP(String nameCategory);
}
