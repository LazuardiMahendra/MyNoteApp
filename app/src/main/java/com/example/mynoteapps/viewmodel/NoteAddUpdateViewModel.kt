package com.example.mynoteapps.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.mynoteapps.database.Note
import com.example.mynoteapps.repository.NoteRepo

class NoteAddUpdateViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepo = NoteRepo(application)
    fun insert(note: Note) {
        mNoteRepository.insert(note)
    }

    fun update(note: Note) {
        mNoteRepository.update(note)
    }

    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }
}