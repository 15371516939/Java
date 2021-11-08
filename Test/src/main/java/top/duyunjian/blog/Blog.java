package top.duyunjian.blog;

import lombok.*;

import java.util.List;

/**
 * @program:study
 * @description:
 * @author:duyunjian
 * @create:2021-11-2021/11/7 12:24:12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Blog<Photos> {
    private String title;
    private String text;
    private List<Photos> photos;




}