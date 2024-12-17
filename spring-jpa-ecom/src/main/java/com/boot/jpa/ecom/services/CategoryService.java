package com.boot.jpa.ecom.services;

import com.boot.jpa.ecom.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private EntityManager entityManager;

    public CategoryService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Category> getAllCategories(){

        // Code to fetch category
        //Use criteria API to get all category data



        // Getting criteria builder
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();




        // Getting Criteria Querry

        CriteriaQuery<Category> criteriaQuery = criteriaBuilder.createQuery(Category.class);
        Root<Category> root = criteriaQuery.from(Category.class);
        CriteriaQuery<Category> select = criteriaQuery.select(root);
criteriaQuery.select(root);


        List<Category> resultList = entityManager.createQuery(criteriaQuery).getResultList();

    return resultList;
    }




}
