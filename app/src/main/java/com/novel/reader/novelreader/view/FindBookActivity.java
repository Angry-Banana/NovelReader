package com.novel.reader.novelreader.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.novel.reader.novelreader.R;
import com.novel.reader.novelreader.base.BaseActivity;
import com.novel.reader.novelreader.databinding.ActivityFindBookBinding;

public class FindBookActivity extends BaseActivity {

    private ActivityFindBookBinding mBinding;
    private SearchView mSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_find_book);
        mBinding.setActivity(this);
        initToolBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_find_book_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.menu_search);
        mSearchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        mSearchView.onActionViewExpanded();
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setIconified(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void initToolBar() {
        mBinding.toolbar.toolbar.setTitle("");
        setSupportActionBar(mBinding.toolbar.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
