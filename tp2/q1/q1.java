class Game {
    private  int app_id, age, dlcs, avg_pt;
    private  float price, upvotes;
    private String name, released_data, owners, languagens, website, developers, genres;   
    private  Boolean windows, mac, linux;  
        

    public Game() {

    }

    public Game(int app_id, int age, int dlcs, int avg_pt){
        this.app_id = app_id;
        this.age = age;
        this.dlcs = dlcs;
        this.avg_pt = avg_pt
    }

    public void setAppId(int app_id){
        this.app_id = app_id;   
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDlcs(int dlcs){
        this.dlcs = dlcs;
    }

    public void setAvgPt(int avg_pt){
        this.avg_pt = avg_pt;
    }

    public int getAppId(){
        return this.app_id;
    }

    public int getAge(){
        return this.age;
    }

    public int getDlcs(){
        return this.dlcs;
    }

    public int getAvgPt(){
        return this.avg_pt;
    }
    
    public Game(float price, float upvotes);{
        this.price = price;
        this.upvotes = upvotes;
    }

    public void setPrice(float price){
        this.price = price;   
    }

    public void setUpvotes(float upvotes){
        this.upvotes = upvotes;
    }

    public float getPrice(){
        return this.price;
    }

    public float getUpvotes(){
        return this.upvotes;
    }

    public Game(String name, String released_data, String owners, String languagens, String website, String developers, String genres){
        this.name = name;
        this.released_data = released_data;
        this.owners = owners;
        this.languagens = languagens;
        this.website = website;
        this.developers = developers;
        this.genres = genres;
}

    public void setName(String name){
        this.name = name;
    }

    public void setReleasedData(String released_data){
        this.released_data = released_data;
    }

    public void setOwners(String owners){
        this.owners = owners;
    }

    public void setLanguagens(String languagens){
        this.languagens = languagens;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public void setDevelopers(String developers){
        this.developers = developers;
    }

    public void setGenres(String genres){
        this.genres = genres;
    }

    public String getName(){
        return this.name;
    }

    public String getRealeasedData(){
        return this.released_data;
    }

    public String getOwners(){
        return this.owners;
    }

    public String getLanguagens(){
        return this.languagens;
    }

    public String getWebsite(){
        return this.website;
    }

    public String getDevelopers(){
        return this.developers;
    }

    public String getGenres(){
        return this.genres;
    }

    public Game(Boolean windows, Boolean mac, Boolean linux){
        this.windows = windows;
        this.mac = mac;
        this.linux = linux;
    }

    public void setWindows(Boolean windows){
        this.windows = windows;
    }

    public void setMac(Boolean mac){
        this.mac = mac;
    }

    public void setLinux(Boolean linux){
        this.linux = linux;
    }

    public Boolean getWindows(){
        return this.windows;
    }

    public Boolean getMac(){
        return this.mac;
    }

    public Boolean getLinux(){
        return this.linux;
    }







clone
leitor
imprimir
construtores 