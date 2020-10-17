package com.example.project.ui.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.project.MainActivity;
import com.example.project.R;

public class NoteEditor extends AppCompatActivity
{

    //initialize component
    EditText note_et;
    int noteId;
    //complete

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        //code
        note_et=(EditText)findViewById(R.id.note_et);

        Intent intent=getIntent();
        noteId=intent.getIntExtra("noteId",-1);

        if(noteId!=-1)
        {
//            note_et.setText(NotesFragment.notes.get(noteId));
        }


        //complete

    }
}