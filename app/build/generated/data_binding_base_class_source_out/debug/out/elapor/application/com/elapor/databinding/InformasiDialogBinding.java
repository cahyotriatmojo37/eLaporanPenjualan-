// Generated by view binder compiler. Do not edit!
package elapor.application.com.elapor.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.RelativeLayout;
import customfonts.MyTextView;
import elapor.application.com.elapor.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class InformasiDialogBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MyTextView btnOk;

  @NonNull
  public final RelativeLayout layoutDown;

  @NonNull
  public final MyTextView textDialog;

  @NonNull
  public final MyTextView textTitle;

  private InformasiDialogBinding(@NonNull RelativeLayout rootView, @NonNull MyTextView btnOk,
      @NonNull RelativeLayout layoutDown, @NonNull MyTextView textDialog,
      @NonNull MyTextView textTitle) {
    this.rootView = rootView;
    this.btnOk = btnOk;
    this.layoutDown = layoutDown;
    this.textDialog = textDialog;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static InformasiDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static InformasiDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.informasi_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static InformasiDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_ok;
      MyTextView btnOk = rootView.findViewById(id);
      if (btnOk == null) {
        break missingId;
      }

      id = R.id.layout_down;
      RelativeLayout layoutDown = rootView.findViewById(id);
      if (layoutDown == null) {
        break missingId;
      }

      id = R.id.text_dialog;
      MyTextView textDialog = rootView.findViewById(id);
      if (textDialog == null) {
        break missingId;
      }

      id = R.id.text_title;
      MyTextView textTitle = rootView.findViewById(id);
      if (textTitle == null) {
        break missingId;
      }

      return new InformasiDialogBinding((RelativeLayout) rootView, btnOk, layoutDown, textDialog,
          textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
