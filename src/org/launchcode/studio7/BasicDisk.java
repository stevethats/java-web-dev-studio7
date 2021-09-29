package org.launchcode.studio7;

public abstract class BasicDisk {

    private String name;
    private String content;
    private double rpm;
    private String diskType;

    public BasicDisk(String name, String content, double rpm, String diskType) {
        this.name = name;
        this.content = content;
        this.rpm = rpm;
        this.diskType = diskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
