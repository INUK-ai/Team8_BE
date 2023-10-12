package com.kakao.techcampus.wekiki.post;

import com.kakao.techcampus.wekiki.history.History;
import com.kakao.techcampus.wekiki.page.PageInfo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

public class PostResponse {

    @Getter
    @Setter
    public static class createPostDTO{

        Long postId;
        String title;
        String content;

        public createPostDTO(Post post){
            this.postId = post.getId();
            this.title = post.getTitle();
            this.content = post.getContent();
        }
    }

    @Getter
    @Setter
    public static class modifyPostDTO{

        Long postId;
        String title;
        String content;

        public modifyPostDTO(Post post){
            this.postId = post.getId();
            this.title = post.getTitle();
            this.content = post.getContent();
        }
    }

    @Getter
    @Setter
    public static class deletePostDTO{

        Long postId;
        String title;

        public deletePostDTO(Post post){
            this.postId = post.getId();
            this.title = post.getTitle();
        }
    }

    @Getter
    @Setter
    public static class getPostHistoryDTO{

        Long postId;
        String currentTitle;
        List<historyDTO> historyList;

        public getPostHistoryDTO(Post post,List<historyDTO> historyList){
            this.postId = post.getId();
            this.currentTitle = post.getTitle();
            this.historyList = historyList;
        }

        @Getter @Setter
        public static class historyDTO{

            //Long memberId;
            //String nickName;
            Long historyId;
            String title;
            String content;
            LocalDateTime created_at;

            public historyDTO(History history){
                this.historyId = history.getId();
                this.title = history.getTitle();
                this.content = history.getContent();
                this.created_at = history.getCreated_at();
            }

        }
    }

}
