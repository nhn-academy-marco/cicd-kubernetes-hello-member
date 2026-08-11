package net.java21.hello.member.controller;

import net.java21.hello.member.dto.MemberResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    
    @GetMapping
    public List<MemberResponse> getMembers() {
        return List.of(
                new MemberResponse("1", "John Doe", "john.doe@example.com"),
                new MemberResponse("2", "Jane Doe", "jane.doe@example.com"),
                new MemberResponse("3", "Bob Smith", "bob.smith@example.com"),
                new MemberResponse("4", "Alice Johnson", "alice.johnson@example.com"),
                new MemberResponse("5", "Charlie Brown", "charlie.brown@example.com")
        );
    }

}
