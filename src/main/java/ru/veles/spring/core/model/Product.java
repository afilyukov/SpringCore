package ru.veles.spring.core.model;

public class Product {
        private final int id;
        private final String title;
        private final int cost;

        public Product(int id, String title, int cost) {
                this.id = id;
                this.title = title;
                this.cost = cost;
        }

        public int getId() {
                return id;
        }

        public int getCost() {
                return cost;
        }

        @Override
        public String toString() {
                return String.format("Product: [%d %s %d]", id, title, cost);
        }
}