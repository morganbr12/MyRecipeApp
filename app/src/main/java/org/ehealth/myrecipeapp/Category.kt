package org.ehealth.myrecipeapp

data class Category(
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String,
)


class CategoriesRepository(var categories: List<Category>) {}