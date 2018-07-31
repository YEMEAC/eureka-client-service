package hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author Yeison Melo */

@RestController
class PingController {

  @GetMapping("/ping")
  public ResponseEntity<Boolean> ping() {
    return ResponseEntity.ok(true);
  }
}
