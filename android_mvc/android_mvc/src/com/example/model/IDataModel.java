package com.example.model;

import com.example.bean.DataBean;

public interface IDataModel {

	DataBean loadData();

	void saveData(DataBean data);
}
