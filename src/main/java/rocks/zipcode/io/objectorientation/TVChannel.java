package rocks.zipcode.io.objectorientation;

import java.util.Arrays;
import java.util.function.Predicate;

public enum TVChannel {

    MSN ("MSN", 0),
    CNN ("CNN", 1),
    FOX ("FOX", 2),
    AE ("AE", 3),
    MTV ("MTV", 4),
    BET ("BET", 5),
    HBO ("HBO", 6),
    NBC ("NBC", 7),
   CBS ("CBS", 8);

    String channel;
    Integer ordinal;

    /**
     * @param ordinal; ordinal of the expected enumeration
     * @return enumeration with respective ordinal
     */
    TVChannel(String channel, Integer ordinal) {
        this.channel = channel;
        this.ordinal = ordinal;

    }

    public static TVChannel getByOrdinal(Integer ordinal) {
        return find(channel -> ordinal.equals(channel.ordinal()));
    }

    /**
     * @param name; name of the expected enumeration
     * @return enumeration with respective name
     */
    public static TVChannel getByName(String name) {
        return find(channel -> name.equals(channel.name()));
    }

    /**
     * @param predicate - clause to evaluate
     * @return the first channel which is applicable to the `predicate`
     */
    private static TVChannel find(Predicate<TVChannel> predicate) {
        return Arrays
                .stream(TVChannel.values())
                .filter(predicate)
                .findFirst()
                .get();
    }
}