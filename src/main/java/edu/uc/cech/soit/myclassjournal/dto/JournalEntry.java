package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

public @Data class JournalEntry {
    private int noteId;
    private String noteTitle;
    private String notes;
    private String date;
}
