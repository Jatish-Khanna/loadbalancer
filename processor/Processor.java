package processor;

/**
*/

public interface Processor {
package processor;

/**
 * An interface defines the processor - A processor is a unit that process all
 * the messages for a exchange - Different implementation of processors are
 * possible (synch, async, or random)
 * 
 * @author Jatish Khanna
 * 
 *
 */

public interface Processor {

	void process(Exchange exchange);

}
  void process(Exchange exchange);
  
}
