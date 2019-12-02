package com.example.surviveuni.social;

import com.example.surviveuni.data.GameState;
import com.example.surviveuni.gameCentre.GameManager;

class SocialFeedbackPresenter implements SocialFeedbackView {
    private GameState gameState = GameManager.getGameState();

    private SocialFeedbackActivity socialfb;
    private String setImage;

    @Override
    public String getSetImage() {
        return setImage;
    }

    @Override
    public void checkFeedback(String feedback) {
        if (feedback.equals("Correct! Let's be friend!")) {

            gameState.changeGPA(-5);
            gameState.changeSpirit(-5);
            gameState.changeHappiness(10);
            setImage = "wow";

        } else if (feedback.equals("Sorry! Run out of playing times:( Maybe next time.")) {

            gameState.changeGPA(-5);
            gameState.changeSpirit(-5);
            gameState.changeHappiness(-5);
            setImage = "sorry";

        } else {

            gameState.changeGPA(-5);
            gameState.changeSpirit(-10);
            gameState.changeHappiness(-10);
            setImage = "angry";

        }
    }

}
