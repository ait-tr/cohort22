Spring and databases. Relationship in JPA. Many-to-many
=======================================================

## Many-to-Many

Отношение многие-ко-многим требует свзязующую таблицу.

The owner side is where we configure the relationship.

![](many-to-many.png)

Place

```java
@ManyToMany
@JoinTable(
    name = "event",
    joinColumns = @JoinColumn(name = "place_id"),
    inverseJoinColumn=@JoinColumn(name = "artist_id"))
private List<Artist> artists;
```

Artist

```java
@ManyToMany(mappedBy = "artists")
private List<Place> places;
```

