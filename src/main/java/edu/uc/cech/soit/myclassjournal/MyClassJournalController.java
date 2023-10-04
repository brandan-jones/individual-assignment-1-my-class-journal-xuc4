package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyClassJournalController {

    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index() {
        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setNoteTitle("Note Title 1");
        journalEntry.setNotes("Note Details");
        journalEntry.setDate("10/4/2023");

        return "start";
    }

    @GetMapping("/journalEntry")
    public ResponseEntity fetchAllJournalEntries() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/journalEntry/{id}")
    public ResponseEntity fetchJournalEntityById(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/journalEntry", consumes = "application/json", produces = "application/json")
    public JournalEntry createJournalEntry(@RequestBody JournalEntry journalEntry) {
        return  journalEntry;
    }

    @DeleteMapping("/journalEntry/{id}")
    public ResponseEntity deleteJournalEntry(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }


}
