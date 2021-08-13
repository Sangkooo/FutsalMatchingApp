package com.toyproject.futsalmatching.di

import com.toyproject.futsalmatching.ui.MainViewModel
import com.toyproject.futsalmatching.ui.home.HomeViewModel
import com.toyproject.futsalmatching.ui.manualmatch.MatchListViewModel
import com.toyproject.futsalmatching.ui.team.TeamViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { MainViewModel() }
    viewModel { HomeViewModel() }
    viewModel { TeamViewModel() }
    viewModel { MatchListViewModel() }
}
