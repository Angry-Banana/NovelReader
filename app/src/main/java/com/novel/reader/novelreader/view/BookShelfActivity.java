package com.novel.reader.novelreader.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.novel.reader.novelreader.R;
import com.novel.reader.novelreader.adapter.BookShelfAdapter;
import com.novel.reader.novelreader.base.ActivityLauncher;
import com.novel.reader.novelreader.base.BaseActivity;
import com.novel.reader.novelreader.databinding.ActivityBookShelfBinding;
import com.novel.reader.novelreader.viewmodel.BookShelfViewModel;

import java.util.ArrayList;

/**
 * author : Angry-Banana
 * e-mail : scau_deng@outlook.com
 * desc   : BookShelfActivity用于展示书架页面
 */
public class BookShelfActivity extends BaseActivity {

  private BookShelfViewModel mViewModel;
  private ActivityBookShelfBinding mBinding;
  private BookShelfAdapter mAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    mViewModel = ViewModelProviders.of(this).get(BookShelfViewModel.class);
    mBinding = DataBindingUtil.setContentView(this, R.layout.activity_book_shelf);
    mBinding.setActivity(this);
    mBinding.setViewModel(mViewModel);

    initToolbar();
    initRecycleView();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.toolbar_book_shelf_menu, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.menu_search:
        ActivityLauncher.goToFindBookActivity(this);
        break;
    }
    return super.onOptionsItemSelected(item);
  }

  private void initToolbar() {
    mBinding.toolbar.toolbar.setTitle("");
    mBinding.toolbar.tvTitle.setText(R.string.book_shelf);
    mBinding.toolbar.toolbar.setNavigationIcon(R.mipmap.ic_setting);
    setSupportActionBar(mBinding.toolbar.toolbar);
  }

  private void initRecycleView() {
    ArrayList<String> nameList = new ArrayList<>();
    GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
    mAdapter = new BookShelfAdapter(nameList);
    mBinding.recycleView.setLayoutManager(layoutManager);
    mBinding.recycleView.setAdapter(mAdapter);
    mBinding.recycleView.setItemAnimator(new DefaultItemAnimator());
  }
}
