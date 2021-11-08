package top.duyunjian.blog;

import lombok.*;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Photos {
    private String id;
    private String url;
    private LocalDateTime localDateTime;


}