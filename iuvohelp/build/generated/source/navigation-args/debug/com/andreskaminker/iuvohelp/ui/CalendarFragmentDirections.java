package com.andreskaminker.iuvohelp.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.andreskaminker.iuvohelp.R;

public class CalendarFragmentDirections {
  private CalendarFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCalendarFragmentToAddAppointmentFragment() {
    return new ActionOnlyNavDirections(R.id.action_calendarFragment_to_addAppointmentFragment);
  }

  @NonNull
  public static NavDirections actionCalendarFragmentToHomeTabbedScreen() {
    return new ActionOnlyNavDirections(R.id.action_calendarFragment_to_homeTabbedScreen);
  }
}
