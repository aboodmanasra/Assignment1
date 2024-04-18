package com.example.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<LessonOptions> options = new ArrayList<>();

    public Database (){
        options.add(new LessonOptions("Jazz" , "Yasmin Allari" , "Music"));
        options.add(new LessonOptions("Rock" , "brandon Lucas Hardy" , "Music"));
        options.add(new LessonOptions("Abstract Painting" , "Candy Reinhart" , "Painting"));
        options.add(new LessonOptions("Acrylic Painting" , "Mohammed kahled" , "Painting"));
        options.add(new LessonOptions("Sculpture" , "Alaa Al Madi" , "conceptualism"));
        options.add(new LessonOptions("Hip Hop" , "Eminem" , "Music"));

    }
public List <LessonOptions> getLessonsOptions (String cat){
        List <LessonOptions> result = new ArrayList<>();
        for (LessonOptions l: options ){
            if (l.getCategory().equals(cat)){
                result.add(l);
            }
        }
return result;
}


}
