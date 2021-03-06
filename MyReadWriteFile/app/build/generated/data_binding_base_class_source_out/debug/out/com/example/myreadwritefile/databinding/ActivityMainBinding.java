// Generated by view binder compiler. Do not edit!
package com.example.myreadwritefile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.myreadwritefile.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout activityMain;

  @NonNull
  public final Button buttonNew;

  @NonNull
  public final Button buttonOpen;

  @NonNull
  public final Button buttonSave;

  @NonNull
  public final EditText editFile;

  @NonNull
  public final EditText editTitle;

  @NonNull
  public final LinearLayout headerLinear;

  private ActivityMainBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout activityMain, @NonNull Button buttonNew, @NonNull Button buttonOpen,
      @NonNull Button buttonSave, @NonNull EditText editFile, @NonNull EditText editTitle,
      @NonNull LinearLayout headerLinear) {
    this.rootView = rootView;
    this.activityMain = activityMain;
    this.buttonNew = buttonNew;
    this.buttonOpen = buttonOpen;
    this.buttonSave = buttonSave;
    this.editFile = editFile;
    this.editTitle = editTitle;
    this.headerLinear = headerLinear;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout activityMain = (RelativeLayout) rootView;

      id = R.id.button_new;
      Button buttonNew = rootView.findViewById(id);
      if (buttonNew == null) {
        break missingId;
      }

      id = R.id.button_open;
      Button buttonOpen = rootView.findViewById(id);
      if (buttonOpen == null) {
        break missingId;
      }

      id = R.id.button_save;
      Button buttonSave = rootView.findViewById(id);
      if (buttonSave == null) {
        break missingId;
      }

      id = R.id.edit_file;
      EditText editFile = rootView.findViewById(id);
      if (editFile == null) {
        break missingId;
      }

      id = R.id.edit_title;
      EditText editTitle = rootView.findViewById(id);
      if (editTitle == null) {
        break missingId;
      }

      id = R.id.header_linear;
      LinearLayout headerLinear = rootView.findViewById(id);
      if (headerLinear == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, activityMain, buttonNew, buttonOpen,
          buttonSave, editFile, editTitle, headerLinear);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
