package com.GPTSchool.observer;
import java.util.ArrayList;
import java.util.List;

// Concrete Subject
class WeatherStationImpl implements WeatherStation {
    private final List<NewsAgency> observers = new ArrayList<>();
    private String weather;

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }

    @Override
    public void addObserver(NewsAgency observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NewsAgency observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NewsAgency observer : observers) {
            observer.update(weather);
        }
    }
}
