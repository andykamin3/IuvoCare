// Generated by view binder compiler. Do not edit!
package com.andreskaminker.iuvohelp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.andreskaminker.iuvohelp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLogInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editTextEmail;

  @NonNull
  public final EditText editTextPassword;

  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final Button logInButton;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textViewPP;

  @NonNull
  public final TextView textViewPasswordForgotten;

  @NonNull
  public final TextView textViewToS;

  private FragmentLogInBinding(@NonNull ConstraintLayout rootView, @NonNull EditText editTextEmail,
      @NonNull EditText editTextPassword, @NonNull ConstraintLayout frameLayout,
      @NonNull Button logInButton, @NonNull TextView textView1, @NonNull TextView textView4,
      @NonNull TextView textViewPP, @NonNull TextView textViewPasswordForgotten,
      @NonNull TextView textViewToS) {
    this.rootView = rootView;
    this.editTextEmail = editTextEmail;
    this.editTextPassword = editTextPassword;
    this.frameLayout = frameLayout;
    this.logInButton = logInButton;
    this.textView1 = textView1;
    this.textView4 = textView4;
    this.textViewPP = textViewPP;
    this.textViewPasswordForgotten = textViewPasswordForgotten;
    this.textViewToS = textViewToS;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLogInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLogInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_log_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLogInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextEmail;
      EditText editTextEmail = rootView.findViewById(id);
      if (editTextEmail == null) {
        break missingId;
      }

      id = R.id.editTextPassword;
      EditText editTextPassword = rootView.findViewById(id);
      if (editTextPassword == null) {
        break missingId;
      }

      ConstraintLayout frameLayout = (ConstraintLayout) rootView;

      id = R.id.logInButton;
      Button logInButton = rootView.findViewById(id);
      if (logInButton == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = rootView.findViewById(id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = rootView.findViewById(id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textViewPP;
      TextView textViewPP = rootView.findViewById(id);
      if (textViewPP == null) {
        break missingId;
      }

      id = R.id.textViewPasswordForgotten;
      TextView textViewPasswordForgotten = rootView.findViewById(id);
      if (textViewPasswordForgotten == null) {
        break missingId;
      }

      id = R.id.textViewToS;
      TextView textViewToS = rootView.findViewById(id);
      if (textViewToS == null) {
        break missingId;
      }

      return new FragmentLogInBinding((ConstraintLayout) rootView, editTextEmail, editTextPassword,
          frameLayout, logInButton, textView1, textView4, textViewPP, textViewPasswordForgotten,
          textViewToS);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
