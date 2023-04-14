package merona.nabdbackend.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import merona.nabdbackend.board.entity.Board;
import merona.nabdbackend.user.entity.User;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardSaveRequestDto {
    private User user;
    private String title;
    private String contents;
    // 주소

    public Board boardFormDto() {
        return new Board(user, title, contents);
    }

    public void setUser(User user){
        this.user = user;
    }

}
