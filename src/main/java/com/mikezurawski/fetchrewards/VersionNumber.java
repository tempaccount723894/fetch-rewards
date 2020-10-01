package com.mikezurawski.fetchrewards;

public class VersionNumber {
    private final long id;
    private final String first;
    private final String second;
    private final String result;
    private final String verbose;

    public VersionNumber(long id, String first, String second, String result, String verbose) {
        this.id = id;
        this.first = first;
        this.second = second;
        this.result = result;
        this.verbose = verbose;
    }

    public long getId() {
        return id;
    }

    public String getResult() {
        return result;
    }

    public String getVerbose() {
        return verbose;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

}
