package io.patrykpoborca.titfortat.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import io.patrykpoborca.titfortat.base.BasePresenter

/**
 * Created by patrykpoborca on 12/27/15.
 */
abstract open class BaseActivity<T : BasePresenter> : AppCompatActivity(){

    private var _presenter: T? = null;
    public val presenter : T
        get(){
            if(_presenter == null){
                _presenter = getClassOfPresenter().javaClass.newInstance();
            }
          return _presenter!!;
        };

    abstract fun getClassOfPresenter() : T;
}
