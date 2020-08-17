package com.andreskaminker.iuvohelp.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.andreskaminker.iuvohelp.R;

public class AddMedicationFragmentDirections {
  private AddMedicationFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddMedicationFragmentToAddAppointmentFragment() {
    return new ActionOnlyNavDirections(R.id.action_addMedicationFragment_to_addAppointmentFragment);
  }

  @NonNull
  public static NavDirections actionAddMedicationFragmentToHomeTabbedScreen() {
    return new ActionOnlyNavDirections(R.id.action_addMedicationFragment_to_homeTabbedScreen);
  }
}
