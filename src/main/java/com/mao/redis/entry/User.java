package com.mao.redis.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by x on 2018/3/16.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 4141839949961500127L;
    private String ud;

    private String phone;

    private String headpic;

    private String email;

    private String emailpassword;

    private String password;

    private String name;

    private Integer type;

    private Integer start;

    private String addr;

    private Date birthday;

    private String shenfenzheng;

    private String shenfenzhengimage;

    private String yingyezhizhao;

    private String yingyezhizhaoimage;

    private Date createtime;

    private String dianname;

    private String openid;

    private String createud;

    private String yihangka;

    private String yinghangtype;

    private String sex;

    private Integer isordershow;

    private Integer isduanxinshow;

    private String duanxinshowcode;

    private String dunxinshowphone;

    private String duanxinshowmenage;

    private Integer isvideoshow;

    private String isvideoshowphone;

    private Integer isemailshow;

    private String weixin;

    private String qq;

    private String city;

    private String love;

    private String wxcode;

    private String tages;

    public String getUd() {
        return ud;
    }

    public void setUd(String ud) {
        this.ud = ud == null ? null : ud.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmailpassword() {
        return emailpassword;
    }

    public void setEmailpassword(String emailpassword) {
        this.emailpassword = emailpassword == null ? null : emailpassword.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng == null ? null : shenfenzheng.trim();
    }

    public String getShenfenzhengimage() {
        return shenfenzhengimage;
    }

    public void setShenfenzhengimage(String shenfenzhengimage) {
        this.shenfenzhengimage = shenfenzhengimage == null ? null : shenfenzhengimage.trim();
    }

    public String getYingyezhizhao() {
        return yingyezhizhao;
    }

    public void setYingyezhizhao(String yingyezhizhao) {
        this.yingyezhizhao = yingyezhizhao == null ? null : yingyezhizhao.trim();
    }

    public String getYingyezhizhaoimage() {
        return yingyezhizhaoimage;
    }

    public void setYingyezhizhaoimage(String yingyezhizhaoimage) {
        this.yingyezhizhaoimage = yingyezhizhaoimage == null ? null : yingyezhizhaoimage.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDianname() {
        return dianname;
    }

    public void setDianname(String dianname) {
        this.dianname = dianname == null ? null : dianname.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getCreateud() {
        return createud;
    }

    public void setCreateud(String createud) {
        this.createud = createud == null ? null : createud.trim();
    }

    public String getYihangka() {
        return yihangka;
    }

    public void setYihangka(String yihangka) {
        this.yihangka = yihangka == null ? null : yihangka.trim();
    }

    public String getYinghangtype() {
        return yinghangtype;
    }

    public void setYinghangtype(String yinghangtype) {
        this.yinghangtype = yinghangtype == null ? null : yinghangtype.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getIsordershow() {
        return isordershow;
    }

    public void setIsordershow(Integer isordershow) {
        this.isordershow = isordershow;
    }

    public Integer getIsduanxinshow() {
        return isduanxinshow;
    }

    public void setIsduanxinshow(Integer isduanxinshow) {
        this.isduanxinshow = isduanxinshow;
    }

    public String getDuanxinshowcode() {
        return duanxinshowcode;
    }

    public void setDuanxinshowcode(String duanxinshowcode) {
        this.duanxinshowcode = duanxinshowcode == null ? null : duanxinshowcode.trim();
    }

    public String getDunxinshowphone() {
        return dunxinshowphone;
    }

    public void setDunxinshowphone(String dunxinshowphone) {
        this.dunxinshowphone = dunxinshowphone == null ? null : dunxinshowphone.trim();
    }

    public String getDuanxinshowmenage() {
        return duanxinshowmenage;
    }

    public void setDuanxinshowmenage(String duanxinshowmenage) {
        this.duanxinshowmenage = duanxinshowmenage == null ? null : duanxinshowmenage.trim();
    }

    public Integer getIsvideoshow() {
        return isvideoshow;
    }

    public void setIsvideoshow(Integer isvideoshow) {
        this.isvideoshow = isvideoshow;
    }

    public String getIsvideoshowphone() {
        return isvideoshowphone;
    }

    public void setIsvideoshowphone(String isvideoshowphone) {
        this.isvideoshowphone = isvideoshowphone == null ? null : isvideoshowphone.trim();
    }

    public Integer getIsemailshow() {
        return isemailshow;
    }

    public void setIsemailshow(Integer isemailshow) {
        this.isemailshow = isemailshow;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love == null ? null : love.trim();
    }

    public String getWxcode() {
        return wxcode;
    }

    public void setWxcode(String wxcode) {
        this.wxcode = wxcode == null ? null : wxcode.trim();
    }

    public String getTages() {
        return tages;
    }

    public void setTages(String tages) {
        this.tages = tages == null ? null : tages.trim();
    }
}
