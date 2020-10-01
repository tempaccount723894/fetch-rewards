package com.mikezurawski.fetchrewards;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class VersionNumberController {
    private final AtomicLong count = new AtomicLong();

    @GetMapping("/version")
    public VersionNumber versionNumber(@RequestParam String first,
                                       @RequestParam String second) {

        String[] firstArray = first.split("\\.");
        String[] secondArray = second.split("\\.");
        int num = 0;

        int length = Math.min(firstArray.length, secondArray.length);
        for(int i = 0; i < length; i++) {
            num = new Integer(firstArray[i]).compareTo(Integer.parseInt(secondArray[i]));
            if(num != 0) {
                break;
            }
        }

        if (num == -1) {
            return new VersionNumber(count.incrementAndGet(), first, second,
                    "before", first + " is before " + second);
        } else if (num == 1) {
            return new VersionNumber(count.incrementAndGet(), first, second,
                    "after", first + " is after " + second);
        } else {
            return new VersionNumber(count.incrementAndGet(), first, second,
                    "equal",  first + " is equal " + second);
        }
    }

}
