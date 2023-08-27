package dev.ismail.movies.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //responsible for all setters and getters and two string methods
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id  //let know it's a unique identifier for this collection
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @DocumentReference //all related ids of reviews will be stored here while reviews will have a different collection
    private List<Review> reviewIds;
}
