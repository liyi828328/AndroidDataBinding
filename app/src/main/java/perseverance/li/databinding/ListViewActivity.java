package perseverance.li.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import perseverance.li.databinding.model.ListItem;

/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-23 15:16
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-23 15 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class ListViewActivity extends AppCompatActivity {

    private RecyclerView mRecycleListView;
    private ArrayList<ListItem> mData = new ArrayList<>();

    //TODO: logo 来自我github上的一个项目
    //TODO: github : https://github.com/liyi828328/logo
    private String url = "https://github.com/liyi828328/logo/raw/master/logo_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        initData();
        initView();
    }

    private void initData() {
        //网络上的logo只有60个
        for (int i = 0; i < 60; i++) {
            ListItem item = new ListItem();
            //网络上的logo命名是logo_1 logo_2 ... logo_10 ... 直接拼接就可以
            item.setShopLogoUrl(url + i);
            item.setShopName("我是商品名称： " + i);
            item.setShopAddr("北京市朝阳区北三环东路： " + i + "号");
            mData.add(item);
        }
    }

    private void initView() {
        mRecycleListView = (RecyclerView) findViewById(R.id.recycle_listview);
        mRecycleListView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));
        MyAdapter adapter = new MyAdapter();
        mRecycleListView.setAdapter(adapter);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ListItemBinding mBinding;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        public void setBinding(ListItemBinding binding) {
            this.mBinding = binding;
        }

        public ListItemBinding getmBinding() {
            return this.mBinding;
        }
    }

    private class MyAdapter extends RecyclerView.Adapter<ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            ListItemBinding listItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                    R.layout.list_item, parent, false);
            ViewHolder holder = new ViewHolder(listItemBinding.getRoot());
            holder.setBinding(listItemBinding);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            ListItemBinding binding = holder.getmBinding();
            binding.setVariable(BR.listItem, mData.get(position));
            String imageUrl = mData.get(position).getShopLogoUrl();
            binding.setImageUrl(imageUrl);
            binding.executePendingBindings();
        }

        @Override
        public int getItemCount() {
            return mData.size();
        }
    }
}
