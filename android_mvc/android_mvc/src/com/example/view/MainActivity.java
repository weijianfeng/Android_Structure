package com.example.view;

import com.example.bean.DataBean;
import com.example.model.impl.DataModel;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	private DataModel mDataModel;
	private TextView mDataText;
	private Button mLoadButton;
	private Button mSaveButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		mDataModel = new DataModel();
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
			DataBean data = mDataModel.loadData();
			mDataText.setText(data.getData());
			break;

		case R.id.bt_save:
			DataBean savedata = new DataBean("data");
			mDataModel.saveData(savedata);

		default:
			break;
		}
	}
}
