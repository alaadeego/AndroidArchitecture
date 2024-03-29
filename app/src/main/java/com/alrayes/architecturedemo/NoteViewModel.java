package com.alrayes.architecturedemo;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class NoteViewModel extends AndroidViewModel {
    private  NoteRepository repository;
    private LiveData<List<Note>> allNote;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        repository = new NoteRepository( application);
        allNote= repository.getAllNotes();
    }

    public void insert(Note note)
    {
        repository.insert(note);
    }

    public void update(Note note)
    {
        repository.update(note);
    }
    public void delete(Note note)
    {
        repository.delete(note);
    }
    public void deleteAllNote( )
    {
        repository.deleteAllNote();
    }

    public  LiveData<List<Note>> getAllNote(){
        return allNote;
    }
}
