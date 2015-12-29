package io.patrykpoborca.titfortat.base

import android.support.v4.app.Fragment

/**
 * Created by patrykpoborca on 12/28/15.
 */
public abstract open class BaseFragment<T : BasePresenter> : Fragment() {
    private var _presenter: T? = null;
    public val presenter : T
        get(){
            if(_presenter == null){
                _presenter = getNewPresenterInstance().javaClass.newInstance();
            }
            return _presenter!!;
        };

    abstract fun getNewPresenterInstance() : T;
}