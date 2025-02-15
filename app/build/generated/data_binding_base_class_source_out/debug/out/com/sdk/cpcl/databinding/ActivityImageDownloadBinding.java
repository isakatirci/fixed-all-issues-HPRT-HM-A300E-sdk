// Generated by view binder compiler. Do not edit!
package com.sdk.cpcl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdk.cpcl.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityImageDownloadBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnPrint;

  @NonNull
  public final Button btnSelectImage;

  @NonNull
  public final TextView itemName3;

  @NonNull
  public final ImageView logoImageView;

  @NonNull
  public final TextView txtFressSpace;

  @NonNull
  public final EditText txtImageFileName;

  @NonNull
  public final TextView txtImageSize;

  @NonNull
  public final TextView txtTotalSpace;

  private ActivityImageDownloadBinding(@NonNull LinearLayout rootView, @NonNull Button btnPrint,
      @NonNull Button btnSelectImage, @NonNull TextView itemName3, @NonNull ImageView logoImageView,
      @NonNull TextView txtFressSpace, @NonNull EditText txtImageFileName,
      @NonNull TextView txtImageSize, @NonNull TextView txtTotalSpace) {
    this.rootView = rootView;
    this.btnPrint = btnPrint;
    this.btnSelectImage = btnSelectImage;
    this.itemName3 = itemName3;
    this.logoImageView = logoImageView;
    this.txtFressSpace = txtFressSpace;
    this.txtImageFileName = txtImageFileName;
    this.txtImageSize = txtImageSize;
    this.txtTotalSpace = txtTotalSpace;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityImageDownloadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityImageDownloadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_image_download, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityImageDownloadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPrint;
      Button btnPrint = ViewBindings.findChildViewById(rootView, id);
      if (btnPrint == null) {
        break missingId;
      }

      id = R.id.btnSelectImage;
      Button btnSelectImage = ViewBindings.findChildViewById(rootView, id);
      if (btnSelectImage == null) {
        break missingId;
      }

      id = R.id.itemName3;
      TextView itemName3 = ViewBindings.findChildViewById(rootView, id);
      if (itemName3 == null) {
        break missingId;
      }

      id = R.id.logoImageView;
      ImageView logoImageView = ViewBindings.findChildViewById(rootView, id);
      if (logoImageView == null) {
        break missingId;
      }

      id = R.id.txtFressSpace;
      TextView txtFressSpace = ViewBindings.findChildViewById(rootView, id);
      if (txtFressSpace == null) {
        break missingId;
      }

      id = R.id.txtImageFileName;
      EditText txtImageFileName = ViewBindings.findChildViewById(rootView, id);
      if (txtImageFileName == null) {
        break missingId;
      }

      id = R.id.txtImageSize;
      TextView txtImageSize = ViewBindings.findChildViewById(rootView, id);
      if (txtImageSize == null) {
        break missingId;
      }

      id = R.id.txtTotalSpace;
      TextView txtTotalSpace = ViewBindings.findChildViewById(rootView, id);
      if (txtTotalSpace == null) {
        break missingId;
      }

      return new ActivityImageDownloadBinding((LinearLayout) rootView, btnPrint, btnSelectImage,
          itemName3, logoImageView, txtFressSpace, txtImageFileName, txtImageSize, txtTotalSpace);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
