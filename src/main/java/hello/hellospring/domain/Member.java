package hello.hellospring.domain;

public class Member {

    private Long id; // system상의 아이디
    private String name;

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

}
