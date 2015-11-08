package com.example.model.impl;

import com.example.app.AppContext;
import com.example.bean.DataBean;
import com.example.model.IDataModel;
import com.example.util.SharePreferenceUtil;

public class DataModel implements IDataModel {

	SharePreferenceUtil sp = new SharePreferenceUtil(
			AppContext.getAppContext(), "mydata");

	public DataBean loadData() {
		DataBean data = new DataBean();
		//模拟从持久化数据中读取
		if (sp.getData() != null) {
			data.setData("from local: " + sp.getData());
		} else {
			//模拟直接从网络获得
			data.setData("data");
		}
		return data;
	}

	public void saveData(DataBean data) {
		// TODO Auto-generated method stub
		//数据持久化
		sp.setData(data.getData());
	}

	@Override
	public void setDataString(String dataString) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDataString() {
		// TODO Auto-generated method stub
		return null;
	}
}
