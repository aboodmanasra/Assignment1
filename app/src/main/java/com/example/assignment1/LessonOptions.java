package com.example.assignment1;

public class LessonOptions {
    private String style;
    private String Teacher;
    private String category;

    public LessonOptions(String style, String teacher, String category) {
        this.style = style;
        Teacher = teacher;
        this.category = category;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return style + " - " + Teacher;
    }

}
