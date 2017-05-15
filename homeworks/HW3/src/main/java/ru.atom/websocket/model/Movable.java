package ru.atom.websocket.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.atom.geometry.Point;

/**
 * GameObject that can move during game
 */
public interface Movable extends Positionable, Tickable {
    /**
     * Tries to move entity towards specified direction
     * @return final position after movement
     */
    Point move(Direction direction);
    
    enum Direction {
        UP {
            @Override
            public Point move(Point point, int velocity) {
                return new Point(point.getX(), (point.getY() + velocity));
            }

            @Override
            public Action makeAction() {
                return Action.MOVE_UP;
            }
        },
        DOWN {
            @Override
            public Point move(Point point, int velocity) {
                return new Point(point.getX(), (point.getY() - velocity));
            }

            @Override
            public Action makeAction() {
                return Action.MOVE_DOWN;
            }
        },
        RIGHT {
            @Override
            public Point move(Point point, int velocity) {
                return new Point((point.getX() + velocity), point.getY());
            }

            @Override
            public Action makeAction() {
                return Action.MOVE_RIGHT;
            }
        },
        LEFT {
            @Override
            public Point move(Point point, int velocity) {
                return new Point((point.getX() - velocity), point.getY());
            }

            @Override
            public Action makeAction() {
                return Action.MOVE_LEFT;
            }
        },
        IDLE {
            @Override
            public Point move(Point point, int velocity) {
                return new Point(point.getX(), point.getY());
            }

            @Override
            public Action makeAction() {
                return null;
            }
        };

        public abstract Point move(Point point, int velocity);
        public abstract Action makeAction();

        @JsonCreator
        public static Direction forValue(String value) {
            // TODO: 02.05.17   JsonHelper.toJson(Movable.Direction.DOWN) gave us "MOVE" !!!!!!
            if (value.equals("{\"direction\":\"UP\"}")) {
                return UP;
            } else if (value.equals("{\"direction\":\"DOWN\"}")) {
                return DOWN;
            } else if (value.equals("{\"direction\":\"RIGHT\"}")) {
                return RIGHT;
            } else if (value.equals("{\"direction\":\"LEFT\"}")) {
                return LEFT;
            } else {
                return IDLE;
            }
        }

        //@JsonCreator
        public static Direction forGoodValue(@JsonProperty("direction") String value) {
            // TODO: 02.05.17   JsonHelper.toJson(Movable.Direction.DOWN) gave us "MOVE" !!!!!!
            if (value.equals("UP")) {
                return UP;
            } else if (value.equals("DOWN")) {
                return DOWN;
            } else if (value.equals("RIGHT")) {
                return RIGHT;
            } else if (value.equals("LEFT")) {
                return LEFT;
            } else {
                return IDLE;
            }
        }
    }
}