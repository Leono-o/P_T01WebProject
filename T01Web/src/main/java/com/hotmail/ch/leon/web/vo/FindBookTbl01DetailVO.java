package com.hotmail.ch.leon.web.vo;


public class FindBookTbl01DetailVO extends T01AbstractVO {

    /** ѡ�� */
    private boolean select = false;


    /** ��� */
    private String bookID = null;


    /** ���� */
    private String bookType = null;


    /** ���� */
    private String bookName = null;


    /** ��� */
    private String produceYear = null;


    /** ѡ�� ��ȡ�� */
    public boolean isSelect() {
        return select;
    }

    /** ѡ�� �ĸ�ֵ */
    public void setSelect(boolean select) {
        this.select = select;
    }

    /** ��� ��ȡ�� */
    public String getBookID() {
        return bookID;
    }

    /** ��� �ĸ�ֵ */
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    /** ���� ��ȡ�� */
    public String getBookType() {
        return bookType;
    }

    /** ���� �ĸ�ֵ */
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    /** ���� ��ȡ�� */
    public String getBookName() {
        return bookName;
    }

    /** ���� �ĸ�ֵ */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /** ��� ��ȡ�� */
    public String getProduceYear() {
        return produceYear;
    }

    /** ��� �ĸ�ֵ */
    public void setProduceYear(String produceYear) {
        this.produceYear = produceYear;
    }


}
