package com.example.presenter;

import com.example.bean.DataBean;
import com.example.model.IDataModel;
import com.example.model.impl.DataModel;
import com.example.view.IDataView;

public class DataPresenter {
	
	private IDataModel mDataModel;
	private IDataView mDataView;
	
	public DataPresenter(IDataView mDataView) {
		super();
		this.mDataView = mDataView;
		mDataModel = new DataModel();
	}
	
	public void saveData(String dataString){
		//mDataModel.setDataString(dataString);
		DataBean data = new DataBean(dataString);
		mDataModel.saveData(data);
	}
	
	public void loadData(){
		DataBean data = mDataModel.loadData();
		mDataView.setDataString(data.getData());
	}
	
	

}
