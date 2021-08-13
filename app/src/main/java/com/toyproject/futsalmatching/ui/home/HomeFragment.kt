package com.toyproject.futsalmatching.ui.home

import android.content.Intent
import com.toyproject.futsalmatching.databinding.FragmentHomeBinding
import com.toyproject.futsalmatching.ui.base.BaseFragment
import com.toyproject.futsalmatching.ui.manualmatch.MatchListActivity
import com.toyproject.futsalmatching.ui.team.TeamActivity
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment: BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    companion object {

        const val TAG = "MainFragment"

        fun newInstance() = HomeFragment()
    }
    override val viewModel by viewModel<HomeViewModel>()

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun initViews() = with(binding) {
        teamStatusButton.setOnClickListener {
            startActivity(
                Intent(context, TeamActivity::class.java)
            )
        }
        manualMatchingButton.setOnClickListener {
            startActivity(
                Intent(context, MatchListActivity::class.java)
            )
        }
    }

    override fun observeData() {
    }
}
