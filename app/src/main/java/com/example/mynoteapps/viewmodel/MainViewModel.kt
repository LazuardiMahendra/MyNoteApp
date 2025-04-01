package com.example.mynoteapps.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mynoteapps.database.Note
import com.example.mynoteapps.repository.NoteRepo

class MainViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepo = NoteRepo(application)
    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}