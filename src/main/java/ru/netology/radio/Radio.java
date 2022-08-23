package ru.netology.radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;


    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public Radio(int size) {
        maxStation = minStation + size;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextCurrentStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prevCurrentStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public short setToMaxStation() {
        currentStation = maxStation;
        return 0;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public short setToMinVolume() {
        currentVolume = minVolume;
        return 0;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}


