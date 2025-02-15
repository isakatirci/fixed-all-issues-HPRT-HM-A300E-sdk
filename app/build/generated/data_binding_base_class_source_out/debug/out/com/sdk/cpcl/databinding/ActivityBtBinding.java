// Generated by view binder compiler. Do not edit!
package com.sdk.cpcl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdk.cpcl.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBtBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout activityBt;

  @NonNull
  public final RecyclerView recyHistory;

  @NonNull
  public final SwipeRefreshLayout swipeRefresh;

  private ActivityBtBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout activityBt,
      @NonNull RecyclerView recyHistory, @NonNull SwipeRefreshLayout swipeRefresh) {
    this.rootView = rootView;
    this.activityBt = activityBt;
    this.recyHistory = recyHistory;
    this.swipeRefresh = swipeRefresh;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBtBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBtBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bt, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBtBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout activityBt = (RelativeLayout) rootView;

      id = R.id.recy_history;
      RecyclerView recyHistory = ViewBindings.findChildViewById(rootView, id);
      if (recyHistory == null) {
        break missingId;
      }

      id = R.id.swipe_refresh;
      SwipeRefreshLayout swipeRefresh = ViewBindings.findChildViewById(rootView, id);
      if (swipeRefresh == null) {
        break missingId;
      }

      return new ActivityBtBinding((RelativeLayout) rootView, activityBt, recyHistory,
          swipeRefresh);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
