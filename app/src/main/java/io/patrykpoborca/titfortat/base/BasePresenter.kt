package io.patrykpoborca.titfortat.base

import rx.Subscription

/**
 * Created by patrykpoborca on 12/27/15.
 */
open class BasePresenter<T : BasePresenterView> : SubscriptionHandler{

    val basePresenterView: T;

    constructor(basePresenterView: T){
        this.basePresenterView = basePresenterView;
    }

    public fun onAttach(){}

    public fun onDettach(){}

    override fun registerSubscription(subscription: Subscription) {
        basePresenterView.registerSubscription(subscription);
    }
}