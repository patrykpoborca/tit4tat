package io.patrykpoborca.titfortat.views.time

import io.patrykpoborca.titfortat.base.BaseFragment

/**
 * Created by patrykpoborca on 12/28/15.
 */

public class TimeFragment : BaseFragment<TimePresenter>() {




    override fun getNewPresenterInstance(): TimePresenter {
        return TimePresenter();
    }
}