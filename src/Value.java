import java.io.Serializable;

class Value implements Serializable {

    MusicFile musicFile;
    Boolean finalChunk = false;
    Request req;

    Value () {
        this.musicFile = null;
        this.req = null;
    }

    Value (Request r) {
        this.req = r;
        this.musicFile = new MusicFile(r.getArtist(),r.getSong(), "", "", "".getBytes());
    }

    Value (Boolean finalChunk) {
        this.musicFile = null;
        this.finalChunk = finalChunk;
        this.req = null;
    }

    Value (MusicFile m) {
        this.musicFile = m;
    }

    MusicFile getMusicFile() {
        return musicFile;
    }

    void setMusicFile(MusicFile m) {
        this.musicFile = m;
    }

    void printValue() {
        this.musicFile.printMusic();
    }

}