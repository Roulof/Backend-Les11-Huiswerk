import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

@RestController
public class TelevisionsController {

    // GET request om alle televisies op te halen
    @GetMapping("/televisions")
    public ResponseEntity<String> getAllTelevisions() {
        // Dummy data voorbeeld, hier zou je een oproep naar je service laag maken
        return ResponseEntity.ok("All televisions fetched");
    }

    // GET request om een specifieke televisie op te halen
    @GetMapping("/televisions/{id}")
    public ResponseEntity<String> getTelevision(@PathVariable("id") Long id) {
        // Dummy data voorbeeld, hier zou je een oproep naar je service laag maken
        return ResponseEntity.ok("Details for television with ID " + id);
    }

    // POST request om een nieuwe televisie toe te voegen
    @PostMapping("/televisions")
    public ResponseEntity<String> addTelevision(@RequestBody String televisionData) {
        // Dummy data voorbeeld, hier zou je een oproep naar je service laag maken
        return ResponseEntity.created(null).body("New television added with data: " + televisionData);
    }

    // PUT request om een bestaande televisie te updaten
    @PutMapping("/televisions/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable("id") Long id, @RequestBody String televisionData) {
        // Dummy data voorbeeld, hier zou je een oproep naar je service laag maken
        return ResponseEntity.ok("Television with ID " + id + " updated with data: " + televisionData);
    }

    // DELETE request om een televisie te verwijderen
    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Void> deleteTelevision(@PathVariable("id") Long id) {
        // Dummy data voorbeeld, hier zou je een oproep naar je service laag maken
        return ResponseEntity.noContent().build();
    }
}