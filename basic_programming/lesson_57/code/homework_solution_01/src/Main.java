import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

      /*
      Создайте класс пост Post - с полями:
- количество лайков likesNumber
- текст поста text
- количество репостов repostsNumber
- id - индивидуальное поле (не статическое)
- totalNumberOfPosts - всего постов - это статическое поле для расчета id
  totalNumberOfPost - можно увеличивать в конструкторе.

Создайте два TreeSet:
- первый при помощи интерфейса Comparable - по id
- второй при помощи интерфейса Comparator - по количеству лайков
  со звездочкой:
- создайте еще один TreeSet - сортированный по длине поста
       */
        System.out.println(Post.totalNumberOfPosts);
        Post post1 = new Post(0, "Отличное видео", 0);
        System.out.println(post1.id);
        Post post2 = new Post(0, "Отличное видео", 0);
        System.out.println(post2.id);

        // casting - приведение к классу
        // upcasting   - восходящее приведение - обобщение типа
        // Object светится серым - можно не писать тип в скобках при upcasting
        Object post3 = (Object) new Post(0, "Отличное видео", 0);
        // downcasting - понижающее приведение - уточнение типа
        Post post4 = (Post) post3;
        // при уточнении типа возникнуть проблемы
        Object obj = new Like();
        if (obj instanceof Post) {
            Post post5 = (Post) obj;
        }

        TreeSet<Post> posts1 = new TreeSet<>();
        posts1.add(new Post(0, "Отличное видео", 0));
        posts1.add(new Post(1, "Ужас", 0));
        posts1.add(new Post(2, "Супер хорошее настроение!", 3));
        System.out.println(posts1);


        System.out.println("*".repeat(10));
        TreeSet<Post> posts2 = new TreeSet<>(
                new Comparator<Post>() {
                    @Override
                    public int compare(Post o1, Post o2) {
                        return Integer.compare(o1.getLikesNumber(), o2.getLikesNumber());
                    }
                }.thenComparing(
                        new Comparator<Post>() {
                            @Override
                            public int compare(Post o1, Post o2) {
                                return Integer.compare(o1.getText().length(), o2.getText().length());
                            }
                        }
                ));
        posts2.add(new Post(3, "Отличное видео", 0));
        posts2.add(new Post(1, "Ужас", 0));
        posts2.add(new Post(2, "Супер хорошее настроение!", 3));
        posts2.add(new Post(1, "Какой-то другой текст", 7));
        System.out.println(posts2);

    }
}