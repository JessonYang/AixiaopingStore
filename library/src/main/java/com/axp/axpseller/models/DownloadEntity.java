package com.axp.axpseller.models;

/**
 * Created by Dong on 2016/8/8.
 */
public class DownloadEntity {
    private String downloadId;
    private Long toolSize;
    private Long completedSize;
    private String url;
    private String saveDirPath;
    private String fileName;
    private Integer downloadStatus;

    public DownloadEntity() {
    }

    public DownloadEntity(String downloadId) {
        this.downloadId = downloadId;
    }

    public DownloadEntity(String downloadId, Long toolSize, Long completedSize, String url, String saveDirPath, String fileName, Integer downloadStatus) {
        this.downloadId = downloadId;
        this.toolSize = toolSize;
        this.completedSize = completedSize;
        this.url = url;
        this.saveDirPath = saveDirPath;
        this.fileName = fileName;
        this.downloadStatus = downloadStatus;
    }

    public String getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(String downloadId) {
        this.downloadId = downloadId;
    }

    public Long getToolSize() {
        return toolSize;
    }

    public void setToolSize(Long toolSize) {
        this.toolSize = toolSize;
    }

    public Long getCompletedSize() {
        return completedSize;
    }

    public void setCompletedSize(Long completedSize) {
        this.completedSize = completedSize;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSaveDirPath() {
        return saveDirPath;
    }

    public void setSaveDirPath(String saveDirPath) {
        this.saveDirPath = saveDirPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getDownloadStatus() {
        return downloadStatus;
    }

    public void setDownloadStatus(Integer downloadStatus) {
        this.downloadStatus = downloadStatus;
    }
}
