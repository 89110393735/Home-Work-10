package ru.netology.javaqa.Radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;

    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
        this.maxVolume = 100;
        this.minVolume = 0;

    }

    public Radio(int stationsCount, int VolumeCount) {
        this.maxStation = stationsCount - 1;
        this.minStation = stationsCount + 1;
        this.maxVolume = VolumeCount - 1;
        this.minVolume = VolumeCount + 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        } else {
            currentStation = minStation;
            return;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
            return;

        } else {
            currentStation = maxStation;
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}



