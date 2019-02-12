package strategy;

import java.util.List;
import processor.Processor;

/**
 * A strategy for loadbalancing to distribute messages across processors
 *
 *
 */

public interface LoadBalancingStrategy {
  /**
   * Add a new processor to balance load
   * @param processor the node which handles load 
   */
  void addProcessor(Processor processor);
  
  
  /**
   * Remove a processor which from the balancing strategy
   * @param processor the node to be removed from the load balancer
   */
  void removeProcessor(Processor processor);
  
  /**
   * List all the processsor managing the load
   * @return List<Processor> represents the list of processors balancing the load
   */
  List<Processor> listProcessor();
}
