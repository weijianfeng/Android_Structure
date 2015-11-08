package com.example.ui;

import com.example.bean.DataBean;
import com.example.model.impl.DataModel;
import com.example.presenter.DataPresenter;
import com.example.view.IDataView;
import com.example.view.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener, IDataView{

	//private DataModel mDataModel;   mvp view这层不会出现model交互
	private DataPresenter mDataPresenter;
	private TextView mDataText;
	private Button mLoadButton;
	private Button mSaveButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		mDataPresenter = new DataPresenter(this);
	}

	private void initView() {
		// TODO Auto-generated method stub
		mDataText = (TextView) findViewById(R.id.tv_data);

		mLoadButton = (Button) findViewById(R.id.bt_load);
		mSaveButton = (Button) findViewById(R.id.bt_save);
		mLoadButton.setOnClickListener(this);
		mSaveButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		//通过model获取数据，此处还是view与model有交互。
		case R.id.bt_load:
			mDataPresenter.loadData();
			break;

		case R.id.bt_save:
			//这个存入的值应该是从空间拿到的值。这里硬编码做个模拟
			mDataPresenter.saveData(getDataSring());

		default:
			break;
		}
	}

	@Override
	public String getDataSring() {
		//这个存入的值应该是从空间拿到的值。这里硬编码做个模拟
		return "data";
	}

	@Override
	public void setDataString(String data) {
		//从mDataPresenter.loadData();拿到的值
		mDataText.setText(data);
		
	}
}
