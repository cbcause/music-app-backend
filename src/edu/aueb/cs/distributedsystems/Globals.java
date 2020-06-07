package edu.aueb.cs.distributedsystems;

public class Globals {
    //public static final String path = "C:\\Users\\elena\\Google Drive\\DistributedSystems\\dataset3";
    public static final String path = "/home/captainlinux/IdeaProjects/MusicApp-2020/dataset3";
    public static final String myIP = "192.168.1.3";

    public static final String publisher_1_ip = myIP;
    public static final String publisher_1_datapath = "/home/captainlinux/IdeaProjects/MusicApp-2020/dataset1";
    public static final String publisher_2_ip = myIP;
    public static final String publisher_2_datapath = "/home/captainlinux/IdeaProjects/MusicApp-2020/dataset2";
    public static final String publisher_3_ip = myIP;
    public static final String publisher_3_datapath = path;
    public static final String broker_1_ip = myIP;
    public static final String broker_2_ip = myIP;
    public static final String broker_3_ip = myIP;
    public static final String consumer_1_ip = myIP;
    public static final String consumer_2_ip = myIP;

    public static int broker_server_port1 = 3300;
    public static int broker_server_port2 = 3301;
    public static int publisher_accept_port1 = 2200;
    public static int publisher_accept_port2 = 2201;
    public static int publisher_accept_port3 = 2202;
    public static int consumer_accept_port1 = 5500;
    public static int consumer_accept_port2 = 5501;
}
