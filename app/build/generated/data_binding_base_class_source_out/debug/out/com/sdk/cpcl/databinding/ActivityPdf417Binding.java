// Generated by view binder compiler. Do not edit!
package com.sdk.cpcl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdk.cpcl.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPdf417Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnPrint;

  @NonNull
  public final TextView itemName3;

  @NonNull
  public final ScrollView previewDashboardV;

  @NonNull
  public final RadioButton rbPdf417CompressionMode;

  @NonNull
  public final RadioButton rbPdf417HierarchicalMode;

  @NonNull
  public final RadioButton rbPdf417RatioMode;

  @NonNull
  public final RadioButton rbPdf417StandardMode;

  @NonNull
  public final RadioGroup rgPdf417ErrorMode;

  @NonNull
  public final RadioGroup rgPdf417Options;

  @NonNull
  public final Spinner spnPdf417ErrorLevel;

  @NonNull
  public final Spinner spnpdf417moduleWidth;

  @NonNull
  public final Spinner spnpdf417rowHeight;

  @NonNull
  public final EditText txtpdf417Data;

  @NonNull
  public final EditText txtpdf417dataColumns;

  @NonNull
  public final EditText txtpdf417dataRows;

  private ActivityPdf417Binding(@NonNull LinearLayout rootView, @NonNull Button btnPrint,
      @NonNull TextView itemName3, @NonNull ScrollView previewDashboardV,
      @NonNull RadioButton rbPdf417CompressionMode, @NonNull RadioButton rbPdf417HierarchicalMode,
      @NonNull RadioButton rbPdf417RatioMode, @NonNull RadioButton rbPdf417StandardMode,
      @NonNull RadioGroup rgPdf417ErrorMode, @NonNull RadioGroup rgPdf417Options,
      @NonNull Spinner spnPdf417ErrorLevel, @NonNull Spinner spnpdf417moduleWidth,
      @NonNull Spinner spnpdf417rowHeight, @NonNull EditText txtpdf417Data,
      @NonNull EditText txtpdf417dataColumns, @NonNull EditText txtpdf417dataRows) {
    this.rootView = rootView;
    this.btnPrint = btnPrint;
    this.itemName3 = itemName3;
    this.previewDashboardV = previewDashboardV;
    this.rbPdf417CompressionMode = rbPdf417CompressionMode;
    this.rbPdf417HierarchicalMode = rbPdf417HierarchicalMode;
    this.rbPdf417RatioMode = rbPdf417RatioMode;
    this.rbPdf417StandardMode = rbPdf417StandardMode;
    this.rgPdf417ErrorMode = rgPdf417ErrorMode;
    this.rgPdf417Options = rgPdf417Options;
    this.spnPdf417ErrorLevel = spnPdf417ErrorLevel;
    this.spnpdf417moduleWidth = spnpdf417moduleWidth;
    this.spnpdf417rowHeight = spnpdf417rowHeight;
    this.txtpdf417Data = txtpdf417Data;
    this.txtpdf417dataColumns = txtpdf417dataColumns;
    this.txtpdf417dataRows = txtpdf417dataRows;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPdf417Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPdf417Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pdf417, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPdf417Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPrint;
      Button btnPrint = ViewBindings.findChildViewById(rootView, id);
      if (btnPrint == null) {
        break missingId;
      }

      id = R.id.itemName3;
      TextView itemName3 = ViewBindings.findChildViewById(rootView, id);
      if (itemName3 == null) {
        break missingId;
      }

      id = R.id.preview_dashboard_v;
      ScrollView previewDashboardV = ViewBindings.findChildViewById(rootView, id);
      if (previewDashboardV == null) {
        break missingId;
      }

      id = R.id.rb_pdf417_compressionMode;
      RadioButton rbPdf417CompressionMode = ViewBindings.findChildViewById(rootView, id);
      if (rbPdf417CompressionMode == null) {
        break missingId;
      }

      id = R.id.rb_pdf417_hierarchicalMode;
      RadioButton rbPdf417HierarchicalMode = ViewBindings.findChildViewById(rootView, id);
      if (rbPdf417HierarchicalMode == null) {
        break missingId;
      }

      id = R.id.rb_pdf417_RatioMode;
      RadioButton rbPdf417RatioMode = ViewBindings.findChildViewById(rootView, id);
      if (rbPdf417RatioMode == null) {
        break missingId;
      }

      id = R.id.rb_pdf417_standardMode;
      RadioButton rbPdf417StandardMode = ViewBindings.findChildViewById(rootView, id);
      if (rbPdf417StandardMode == null) {
        break missingId;
      }

      id = R.id.rg_pdf417_errorMode;
      RadioGroup rgPdf417ErrorMode = ViewBindings.findChildViewById(rootView, id);
      if (rgPdf417ErrorMode == null) {
        break missingId;
      }

      id = R.id.rg_pdf417_options;
      RadioGroup rgPdf417Options = ViewBindings.findChildViewById(rootView, id);
      if (rgPdf417Options == null) {
        break missingId;
      }

      id = R.id.spn_pdf417_errorLevel;
      Spinner spnPdf417ErrorLevel = ViewBindings.findChildViewById(rootView, id);
      if (spnPdf417ErrorLevel == null) {
        break missingId;
      }

      id = R.id.spnpdf417moduleWidth;
      Spinner spnpdf417moduleWidth = ViewBindings.findChildViewById(rootView, id);
      if (spnpdf417moduleWidth == null) {
        break missingId;
      }

      id = R.id.spnpdf417rowHeight;
      Spinner spnpdf417rowHeight = ViewBindings.findChildViewById(rootView, id);
      if (spnpdf417rowHeight == null) {
        break missingId;
      }

      id = R.id.txtpdf417Data;
      EditText txtpdf417Data = ViewBindings.findChildViewById(rootView, id);
      if (txtpdf417Data == null) {
        break missingId;
      }

      id = R.id.txtpdf417dataColumns;
      EditText txtpdf417dataColumns = ViewBindings.findChildViewById(rootView, id);
      if (txtpdf417dataColumns == null) {
        break missingId;
      }

      id = R.id.txtpdf417dataRows;
      EditText txtpdf417dataRows = ViewBindings.findChildViewById(rootView, id);
      if (txtpdf417dataRows == null) {
        break missingId;
      }

      return new ActivityPdf417Binding((LinearLayout) rootView, btnPrint, itemName3,
          previewDashboardV, rbPdf417CompressionMode, rbPdf417HierarchicalMode, rbPdf417RatioMode,
          rbPdf417StandardMode, rgPdf417ErrorMode, rgPdf417Options, spnPdf417ErrorLevel,
          spnpdf417moduleWidth, spnpdf417rowHeight, txtpdf417Data, txtpdf417dataColumns,
          txtpdf417dataRows);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
