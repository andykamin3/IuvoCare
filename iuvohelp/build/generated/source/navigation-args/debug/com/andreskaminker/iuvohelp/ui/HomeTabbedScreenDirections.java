package com.andreskaminker.iuvohelp.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.andreskaminker.iuvohelp.R;

public class HomeTabbedScreenDirections {
  private HomeTabbedScreenDirections() {
  }

  @NonNull
  public static NavDirections actionHomeTabbedScreenToUserConfigFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeTabbedScreen_to_userConfigFragment);
  }

  @NonNull
  public static NavDirections actionHomeTabbedScreenToAddMedicationFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeTabbedScreen_to_addMedicationFragment);
  }

  @NonNull
  public static NavDirections actionHomeTabbedScreenToCalendarFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeTabbedScreen_to_calendarFragment);
  }

  @NonNull
  public static NavDirections actionHomeTabbedScreenToAddAppointmentFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeTabbedScreen_to_addAppointmentFragment);
  }
}
