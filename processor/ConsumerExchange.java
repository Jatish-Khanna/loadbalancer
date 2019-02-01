import java.util.function.Consumer;

/**
 * The node that consumes the messages between exchanges
 * @author Jatish Khanna
 *
 * @param <T> the type of consumer
 */

public interface ConsumerExchange<T> extends Consumer<T> {

  @Override
  void	accept(T t);
}
