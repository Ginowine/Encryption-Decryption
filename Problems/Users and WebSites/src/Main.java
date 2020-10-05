abstract class BaseEntity{
    protected long id;
    protected long version;

    protected BaseEntity(long id, long version){
        this.id = id;
        this.version = version;
    }

    public abstract long getId();

    public abstract void setId(long id);

    public abstract long getVersion();

    public abstract void setVersion(long version);

}

class User extends BaseEntity {
    protected String name;

    public User(){
        super(0, 0);
    }
    public User(long id, long version, String name) {
        super(id, version);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getVersion() {
        return version;
    }

    @Override
    public void setVersion(long version) {
        this.version = version;
    }
}

class Visit extends BaseEntity{
    protected User user;
    protected WebSite site;

    public Visit(){
        super(0, 0);
    }

    public Visit(long id, long version, User user, WebSite site) {
        super(id, version);
        this.user = user;
        this.site = site;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WebSite getSite() {
        return site;
    }

    public void setSite(WebSite site) {
        this.site = site;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getVersion() {
        return version;
    }

    @Override
    public void setVersion(long version) {
        this.version = version;
    }
}

class WebSite extends BaseEntity{

    protected String url;

    public WebSite(){
        super(0, 0);
    }

    public WebSite(long id, long version, String url) {
        super(id, version);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getVersion() {
        return version;
    }

    @Override
    public void setVersion(long version) {
        this.version = version;
    }
}