package com.example.games2;

import android.graphics.Rect;

import com.example.games2.sprites.Obstacle;

import java.util.ArrayList;

public interface GameManagerCallback {
    void updatePosition(Rect birdPosition);

    void updatePosition(Obstacle obstacle, ArrayList<Rect> positions);

    void removeObstacle(Obstacle obstacle);
}
