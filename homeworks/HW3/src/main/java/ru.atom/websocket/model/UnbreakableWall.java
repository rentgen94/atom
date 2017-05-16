package ru.atom.websocket.model;

import ru.atom.geometry.Bar;
import ru.atom.geometry.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by BBPax on 06.03.17.
 */
public class UnbreakableWall extends AbstractGameObject {
    private static final Logger log = LogManager.getLogger(UnbreakableWall.class);

    public UnbreakableWall(int id, Point position) {
        super(id, position.getX(),position.getY());
        type = "Wall";
        bar = new Bar(new Point(BAR_SIZE * position.getX(), BAR_SIZE * position.getY()), BAR_SIZE);
        log.info("UnbreackableWall(id = {}) was created in ( {} ; {} ) with bar {}",
                id, position.getX(), position.getY(), bar.toString());
    }
}