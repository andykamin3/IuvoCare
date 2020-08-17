package com.andreskaminker.iuvohelp.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.andreskaminker.iuvohelp.R;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionProfileFragmentToHomeTabbedScreen() {
    return new ActionOnlyNavDirections(R.id.action_profileFragment_to_homeTabbedScreen);
  }
}
