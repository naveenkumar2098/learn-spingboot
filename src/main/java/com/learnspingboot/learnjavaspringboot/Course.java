package com.learnspingboot.learnjavaspringboot;

public class Course {

    private long id;
    private String name;
    private String author;

    //    constructors
    public Course(int id, String courseName, String authorName) {
        super();
        this.id = id;
        this.name = courseName;
        this.author = authorName;
    }

//    getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    //    toString method
    @Override
    public String toString() {
        return "Course {" +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", author ='" + author + '\'' +
                '}';
    }
}
