package ru.atom.websocket.model;

import ru.atom.geometry.Bar;
import ru.atom.geometry.Point;

/**
 * Created by BBPax on 11.05.17.
 */
public class Grass extends AbstractGameObject implements Positionable {

    public Grass(int id, Point position) {
        super(id, position.getX(), position.getY());
        type = "grass";
        bar = new Bar(new Point(BAR_SIZE * position.getX(), BAR_SIZE * position.getY()), BAR_SIZE);
    }
}
