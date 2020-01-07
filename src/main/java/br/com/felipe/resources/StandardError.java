package br.com.felipe.resources;

import java.io.Serializable;

public class StandardError implements Serializable {

    private static final long serialVersionUID = -8209351791249947931L;
    private Integer status;
    private String msg;
    private Long timeStamp;

    public StandardError(){}

    public StandardError(Integer status,String msg,Long timeStamp){
        super();
        this.status=status;
        this.msg=msg;
        this.timeStamp=timeStamp;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public String getMsg() {
        return msg;
    }
}
