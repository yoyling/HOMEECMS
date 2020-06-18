package service.impl;

import dao.CategoryDao;
import dao.impl.CategoryDaoImpl;
import entity.Category;
import service.CategoryService;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao dao = new CategoryDaoImpl();

    @Override
    public List<Category> findCategoryListByName(String flag) {
        if (flag != null && flag.equals("father")){
            return dao.findCategoryParentList();
        }else{
            return dao.findCategoryChildList();
        }
    }

    @Override
    public List<Category> findAllCategory() {
        return dao.findAllCategory();
    }
}