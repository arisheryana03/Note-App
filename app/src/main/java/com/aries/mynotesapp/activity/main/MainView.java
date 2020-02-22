package com.aries.mynotesapp.activity.main;

import com.aries.mynotesapp.model.Note;

import java.util.List;

public interface MainView {

    void showLoading();
    void hideLoading();
    void onGetResult(List<Note> notes);
    void onErrorLoading(String message);
}
