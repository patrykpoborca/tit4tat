package io.patrykpoborca.titfortat.base

import rx.Subscription

/**
 * Created by patrykpoborca on 12/28/15.
 */

interface SubscriptionHandler{
    fun registerSubscription(subscription : Subscription);
}