package com.hp.gagawa.elements;

import com.hp.gagawa.FertileNode;

/**
(c) Copyright 2008 Hewlett-Packard Development Company, L.P.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.*/


public class Select extends FertileNode {

	public Select(){
		super("select");
	}


	public Select setDisabled(String value){setAttribute("disabled", value); return this;}
	public String getDisabled(){return getAttribute("disabled");}
	public boolean removeDisabled(){return removeAttribute("disabled");}

	public Select setMultiple(String value){setAttribute("multiple", value); return this;}
	public String getMultiple(){return getAttribute("multiple");}
	public boolean removeMultiple(){return removeAttribute("multiple");}

	public Select setName(String value){setAttribute("name", value); return this;}
	public String getName(){return getAttribute("name");}
	public boolean removeName(){return removeAttribute("name");}

	public Select setSize(String value){setAttribute("size", value); return this;}
	public String getSize(){return getAttribute("size");}
	public boolean removeSize(){return removeAttribute("size");}

	public Select setId(String value){setAttribute("id", value); return this;}
	public String getId(){return getAttribute("id");}
	public boolean removeId(){return removeAttribute("id");}

	public Select setCSSClass(String value){setAttribute("class", value); return this;}
	public String getCSSClass(){return getAttribute("class");}
	public boolean removeCSSClass(){return removeAttribute("class");}

	public Select setTitle(String value){setAttribute("title", value); return this;}
	public String getTitle(){return getAttribute("title");}
	public boolean removeTitle(){return removeAttribute("title");}

	public Select setStyle(String value){setAttribute("style", value); return this;}
	public String getStyle(){return getAttribute("style");}
	public boolean removeStyle(){return removeAttribute("style");}

	public Select setDir(String value){setAttribute("dir", value); return this;}
	public String getDir(){return getAttribute("dir");}
	public boolean removeDir(){return removeAttribute("dir");}

	public Select setLang(String value){setAttribute("lang", value); return this;}
	public String getLang(){return getAttribute("lang");}
	public boolean removeLang(){return removeAttribute("lang");}

	public Select setXMLLang(String value){setAttribute("xml:lang", value); return this;}
	public String getXMLLang(){return getAttribute("xml:lang");}
	public boolean removeXMLLang(){return removeAttribute("xml:lang");}

	public Select setAccesskey(String value){setAttribute("accesskey", value); return this;}
	public String getAccesskey(){return getAttribute("accesskey");}
	public boolean removeAccesskey(){return removeAttribute("accesskey");}

	public Select setTabindex(String value){setAttribute("tabindex", value); return this;}
	public String getTabindex(){return getAttribute("tabindex");}
	public boolean removeTabindex(){return removeAttribute("tabindex");}

}