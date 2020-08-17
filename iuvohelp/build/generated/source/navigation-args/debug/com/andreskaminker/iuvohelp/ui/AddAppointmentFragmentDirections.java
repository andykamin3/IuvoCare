package com.andreskaminker.iuvohelp.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.andreskaminker.iuvohelp.R;

public class AddAppointmentFragmentDirections {
  private AddAppointmentFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddAppointmentFragmentToAddMedicationFragment() {
    return new ActionOnlyNavDirections(R.id.action_addAppointmentFragment_to_addMedicationFragment);
  }

  @NonNull
  public static NavDirections actionAddAppointmentFragmentToHomeTabbedScreen() {
    return new ActionOnlyNavDirections(R.id.action_addAppointmentFragment_to_homeTabbedScreen);
  }
}
