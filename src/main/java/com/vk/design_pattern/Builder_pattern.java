/*
	 * Definition:
	 * 
	 * Builder Pattern is used to create complex objects step by step.
	 * 
	 * Useful when object has many fields/parameters.
	 * 
	 * Instead of large constructor, we use builder methods.
	 *
	 *
	 * Real Life Example:
	 * 
	 * 🍔 Burger Order
	 * 
	 * Choose:
	 * 
	 * Bread, Cheese, Sauce ,Extra ,Patty
	 * 
	 * Step by step build burger.
	 *
	 */
	
	
	
	

package com.vk.design_pattern;


class User {

    private String name;
    private int age;
    private String city;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    public void show() {
        System.out.println(name + " " + age + " " + city);
    }

    static class Builder {

        private String name;
        private int age;
        private String city;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class Builder_pattern {
public static void main(String[] args) {
		
	
	User u=new User.Builder()
			.setName("vijay")
			.setAge(30)
			.setCity("mumbai").build();
	u.show();
	
	

	}
}


	

	


