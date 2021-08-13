package com.toyproject.futsalmatching.ui.team

import com.toyproject.futsalmatching.databinding.ActivityTeamBinding
import com.toyproject.futsalmatching.ui.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel

class TeamActivity: BaseActivity<TeamViewModel, ActivityTeamBinding>() {
    override val viewModel: TeamViewModel by viewModel<TeamViewModel>()

    override fun getViewBinding(): ActivityTeamBinding = ActivityTeamBinding.inflate(layoutInflater)

    override fun observeData() {
//        TODO("Not yet implemented")
    }

    override fun initViews() = with(binding) {
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}
