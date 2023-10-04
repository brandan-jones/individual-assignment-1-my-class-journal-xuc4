package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JournalEntryServiceStub implements IJournalService {

    private List<JournalEntry> journalEntries = new ArrayList<>();

    @Override
    public JournalEntry save(JournalEntry journalEntry) {
        journalEntries.add(journalEntry);
        return journalEntry;

    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntries;

    }
}
