package org.example.Dto;
import org.example.Categories;
import org.example.entity.Users;

public class UsersPostDto {

        private Long id;
        private String title;
        private String content;
        private String image;
        private Categories category;
        private Long user;
        private String createAt;
        public UsersPostDto(String title, String content, String image, Categories category, Long user, String createAt) {
            this.title = title;
            this.content = content;
            this.image = image;
            this.category = category;
            this.user = user;
            this.createAt = createAt;
        }
        public UsersPostDto(){}

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getImage() {
            return image;
        }
        public void setImage(String image) {
            this.image = image;
        }

        public Categories getCategory() {
            return category;
        }

        public void setCategory(Categories category) {
            this.category = category;
        }

        public Long getUser() {
            return user;
        }

        public String getCreateAt() {
            return createAt;
        }

    public void setUser(Long user) {
        this.user = user;
    }

    public void setCreateAt(String createAt) {
            this.createAt = createAt;
        }

        @Override
        public String toString() {
            return "UsersPost{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    ", image='" + image + '\'' +
                    ", category=" + category +
                    ", userId=" + user +
                    ", createAt='" + createAt + '\'' +
                    '}';
        }

}
