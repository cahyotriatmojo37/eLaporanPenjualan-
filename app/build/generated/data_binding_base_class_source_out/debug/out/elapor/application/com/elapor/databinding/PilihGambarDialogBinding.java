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

public final class PilihGambarDialogBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MyTextView txtFromCamera;

  @NonNull
  public final MyTextView txtFromGalley;

  private PilihGambarDialogBinding(@NonNull RelativeLayout rootView,
      @NonNull MyTextView txtFromCamera, @NonNull MyTextView txtFromGalley) {
    this.rootView = rootView;
    this.txtFromCamera = txtFromCamera;
    this.txtFromGalley = txtFromGalley;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PilihGambarDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PilihGambarDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.pilih_gambar_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PilihGambarDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txtFromCamera;
      MyTextView txtFromCamera = rootView.findViewById(id);
      if (txtFromCamera == null) {
        break missingId;
      }

      id = R.id.txtFromGalley;
      MyTextView txtFromGalley = rootView.findViewById(id);
      if (txtFromGalley == null) {
        break missingId;
      }

      return new PilihGambarDialogBinding((RelativeLayout) rootView, txtFromCamera, txtFromGalley);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
