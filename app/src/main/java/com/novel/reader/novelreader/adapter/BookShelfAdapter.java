package com.novel.reader.novelreader.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.novel.reader.novelreader.R;

import java.util.List;

/**
 * author : Angry-Banana
 * e-mail : scau_deng@outlook.com
 * desc   : BookShelfActivity中的书架RecyclerView的Adapter
 */
public class BookShelfAdapter extends RecyclerView.Adapter<BookShelfAdapter.BookShelfViewHolder> {
  private List<String> nameList;

  public BookShelfAdapter(List<String> nameList) {
    this.nameList = nameList;
  }

  @Override
  public BookShelfViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book_shelf,
            parent, false);
    return new BookShelfViewHolder(view);
  }

  @Override
  public void onBindViewHolder(BookShelfViewHolder holder, int position) {
    holder.photo.setImageResource(R.drawable.book);
    holder.name.setText(nameList.get(position));
  }

  @Override
  public int getItemCount() {
    return nameList == null ? 0 : nameList.size();
  }

  class BookShelfViewHolder extends RecyclerView.ViewHolder {
    ImageView photo;
    TextView name;

    public BookShelfViewHolder(View itemView) {
      super(itemView);
      photo = itemView.findViewById(R.id.iv_photo);
      name = itemView.findViewById(R.id.tv_name);
    }
  }
}
