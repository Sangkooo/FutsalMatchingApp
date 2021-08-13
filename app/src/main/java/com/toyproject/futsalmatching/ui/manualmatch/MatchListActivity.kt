package com.toyproject.futsalmatching.ui.manualmatch

import com.toyproject.futsalmatching.databinding.ActivityMatchListBinding
import com.toyproject.futsalmatching.ui.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel

class MatchListActivity: BaseActivity<MatchListViewModel, ActivityMatchListBinding>() {
    override val viewModel: MatchListViewModel by viewModel<MatchListViewModel>()

    override fun getViewBinding(): ActivityMatchListBinding = ActivityMatchListBinding.inflate(layoutInflater)

    override fun observeData() {
    }

    override fun initViews() = with(binding) {
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}
