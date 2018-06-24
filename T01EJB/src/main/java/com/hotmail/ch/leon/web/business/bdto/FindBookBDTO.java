package com.hotmail.ch.leon.web.business.bdto;

import java.util.List;
import com.hotmail.ch.leon.web.business.apl.bdto.LabelValueBDTO;

public class FindBookBDTO {

	/** 类型 */
	private String searchType = null;

	/** 种类 */
	private String bookType = null;

	private List<LabelValueBDTO> bookType_list = null;

	/** 出版年份 */
	private String produceYear = null;

	/** 书名 */
	private String bookName = null;

	private List<FindBookResultSubBDTO> searchRstList = null;

    /** 类型 的取得 */
    public String getSearchType() {
        return searchType;
    }

    /** 类型 的赋值 */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    /** 种类 的取得 */
    public String getBookType() {
        return bookType;
    }

    /** 种类 的赋值 */
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public List<LabelValueBDTO> getBookType_list() {
        return bookType_list;
    }

    public void setBookType_list(List<LabelValueBDTO> bookType_list) {
        this.bookType_list = bookType_list;
    }

    /** 出版年份 的取得 */
    public String getProduceYear() {
        return produceYear;
    }

    /** 出版年份 的赋值 */
    public void setProduceYear(String produceYear) {
        this.produceYear = produceYear;
    }

    /** 书名 的取得 */
    public String getBookName() {
        return bookName;
    }

    /** 书名 的赋值 */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<FindBookResultSubBDTO> getSearchRstList() {
        return searchRstList;
    }

    public void setSearchRstList(List<FindBookResultSubBDTO> searchRstList) {
        this.searchRstList = searchRstList;
    }

}
