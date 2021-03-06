package ol;

import com.google.gwt.core.client.js.JsType;

import ol.event.Event;
import ol.event.EventListener;

/**
 * 
 * @author Tino Desjardins
 *
 */
@JsType
public interface Observable {
    
    <T extends Event> void on(String type , EventListener<T> eventListener);
    
    <T extends Event> void once(String type , EventListener<T> eventListener);
    
    <T extends Event> void un(String type , EventListener<T> eventListener);
    
}

