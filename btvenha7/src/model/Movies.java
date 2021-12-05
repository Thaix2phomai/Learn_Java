package model;

public class Movies {
    private String id;
    private String name;
    private String type;
    private int times;
    private String producer;
    private int releaseYear;

    public Movies(String id, String name, String type, int times, String producer, int releaseYear) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.times = times;
        this.producer = producer;
        this.releaseYear = releaseYear;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getTimes() {
        return times;
    }

    public String getProducer() {
        return producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "Mã:'" + id + '\'' +
                ", Tên phim:'" + name + '\'' +
                ", Thể loại:'" + type + '\'' +
                ", Thời lượng:" + times +
                ", Nhà sản xuất:'" + producer + '\'' +
                ", Năm phát hành:" + releaseYear +
                '}';
    }
}

