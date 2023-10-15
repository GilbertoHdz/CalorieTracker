package com.gilbertohdz.tracker_presentation.search

import com.gilbertohdz.tracker_domain.model.TrackableFood

data class TrackableFoodUiState(
  val food: TrackableFood,
  val isExpanded: Boolean = false,
  val amount: String = ""
)