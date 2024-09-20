package org.ehealth.myrecipeapp

data class Category(
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String,
)


class CategoriesResponse(var categories: List<Category>) {}