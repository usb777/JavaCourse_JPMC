import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dzen
 */
public class ParallelStreams {

    public static void main(String[] args) {
        
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2") ;
        
        List<String> strings = new CopyOnWriteArrayList<>();
        
        List<String> collect = 
                Stream.iterate("+", s -> s + "+")
                .parallel()
                .limit(1000)
                // .peek(s -> System.out.println(s + " processed in the thread " + Thread.currentThread().getName()))
                 //.forEach(s -> strings.add(s));
                .collect(Collectors.toList());
        
        System.out.println("# " + collect.size());
<<<<<<< HEAD
        List<String> ownList =Stream.of("Test1", "Test2").collect(Collectors.toList());         
=======
        System.out.println(collect.get(2));
        System.out.println(collect.get(100));
>>>>>>> eee21a9441c85840dafe6c707f1bd6f53373a6f9
    }
}
