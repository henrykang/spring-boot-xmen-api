package com.example.demo.xmen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/xmen")
public class XmenController {

    private final XmenService xmenService;

    @Autowired
    public XmenController(XmenService xmenService) {
        this.xmenService = xmenService;
    }

    @GetMapping
    public List<Xmen> getXmen() {
        return xmenService.getXmen();
    }

    @PostMapping
    public void registerNewXmen(@RequestBody Xmen xmen) {
        xmenService.addNewXmen(xmen);
    }

    @DeleteMapping(path = "{xmenId}")
    public void deleteXmen(@PathVariable("xmenId") Long xmenId) {
        xmenService.deleteXmen(xmenId);
    }

    @PutMapping(path = "{xmenId}")
    public void updateXmen(
            @PathVariable("xmenId") Long xmenId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String alias) {
        xmenService.updateXmen(xmenId, name, alias);
    }
}
