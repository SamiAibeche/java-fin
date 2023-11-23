package com.GPTSchool.observer;
import java.util.ArrayList;
import java.util.List;

// Subject
interface WeatherStation {
    void addObserver(NewsAgency observer);
    void removeObserver(NewsAgency observer);
    void notifyObservers();
}