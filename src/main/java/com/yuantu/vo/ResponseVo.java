package com.yuantu.vo;

public class ResponseVo {
  //    返回状态
  private Boolean success;
  //    返回信息
  private String message;
  //    返回内容
  private Object content;

  public static ResponseVo buildSuccess(){
    ResponseVo responseVo = new ResponseVo();
    responseVo.setSuccess(true);
    return responseVo;
  }

  public static ResponseVo buildSuccess(Object content){
    ResponseVo responseVo = new ResponseVo();
    responseVo.setSuccess(true);
    responseVo.setContent(content);
    return responseVo;
  }

  public static ResponseVo buildFailure(String message){
    ResponseVo responseVo = new ResponseVo();
    responseVo.setSuccess(false);
    responseVo.setMessage(message);
    System.out.println(message);
    return responseVo;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "ResponseVo{" +
      "success=" + success +
      ", message='" + message + '\'' +
      ", content=" + content +
      '}';
  }
}
