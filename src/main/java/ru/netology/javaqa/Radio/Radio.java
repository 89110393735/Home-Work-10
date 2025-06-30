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

    public Radio(int stationsCount, int volumeCount) {
        this.maxStation = stationsCount - 1;
        this.minStation = stationsCount + 1;
        this.maxVolume = volumeCount;
        this.minVolume = volumeCount;
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

    public void maxStation() {
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

    public void minStation() {
        if (currentStation != maxStation) {
            currentStation = minStation;
            return;

        } else {
            currentStation = minStation;
            return;
        }
    }


    public void nextVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
            return;
        } else {
            currentVolume = minVolume;
            return;
        }
    }

    public void prevVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
            return;

        } else {
            currentVolume = maxVolume;
            return;
        }


    }

    public void maxVolume() {
        if (currentVolume != maxVolume) {
            currentVolume = maxVolume;
            return;

        } else {
            currentVolume = minVolume;
            return;
        }
    }

    public void minVolume() {
        if (currentVolume != maxVolume) {
            currentVolume = minVolume;
            return;
        } else {
            currentVolume = minVolume;
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



