CREATE DATABASE recipe_flavor_matcher;
USE recipe_flavor_matcher;


CREATE TABLE recipes (
recipe_id INT AUTO_INCREMENT PRIMARY KEY,
recipe_name VARCHAR(100) NOT NULL,
description TEXT
);


CREATE TABLE ingredients (
ingredient_id INT AUTO_INCREMENT PRIMARY KEY,
ingredient_name VARCHAR(100) NOT NULL UNIQUE
);


CREATE TABLE recipe_ingredients (
recipe_id INT,
ingredient_id INT,
FOREIGN KEY (recipe_id) REFERENCES recipes(recipe_id),
FOREIGN KEY (ingredient_id) REFERENCES ingredients(ingredient_id)
);


INSERT INTO recipes (recipe_name, description) VALUES
('Tomato Pasta', 'Italian pasta with tomato flavor'),
('Paneer Curry', 'Spicy Indian curry');


INSERT INTO ingredients (ingredient_name) VALUES
('Tomato'), ('Pasta'), ('Paneer'), ('Spices');


INSERT INTO recipe_ingredients VALUES
(1,1),(1,2),(2,3),(2,4);

SELECT * from recipes;

SELECT * from ingredients;

SELECT * from recipe_ingredients;