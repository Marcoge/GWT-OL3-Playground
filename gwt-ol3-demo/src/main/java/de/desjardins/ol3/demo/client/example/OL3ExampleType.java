package de.desjardins.ol3.demo.client.example;

import de.desjardins.ol3.demo.client.example.Example;

/**
 * Provided example types.
 *
 * @author Tino Desjardins
 *
 */
public enum OL3ExampleType {
    
    WmsExample(new WmsExample()),
    TileExample(new TileExample()),
    ImageExample(new StaticImageExample()),
    GraticuleExample(new GraticuleExample());
    
    private Example example;
    
    private OL3ExampleType(Example example) {
        this.example = example;
    }
    
    public Example getExample() {
        return this.example;
    }
    
}

