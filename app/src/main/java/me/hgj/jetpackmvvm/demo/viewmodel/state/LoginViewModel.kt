package me.hgj.jetpackmvvm.demo.viewmodel.state

import android.view.View
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.map
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.callback.databind.BooleanObservableField
import me.hgj.jetpackmvvm.callback.databind.StringObservableField
import me.hgj.jetpackmvvm.callback.livedata.StringLiveData
import me.hgj.jetpackmvvm.ext.util.logd

/**
 * 作者　: hegaojian
 * 时间　: 2019/12/23
 * 描述　:登录注册的ViewModel
 */
class LoginViewModel : BaseViewModel() {

    //用户名
    var username = StringObservableField()


//
//    //用户名清除按钮是否显示   不要在 xml 中写逻辑 所以逻辑判断放在这里
//    var clearVisible = object :ObservableInt(username){
//        override fun get(): Int {
//            return if(username.get().isEmpty()){
//                View.GONE
//            }else{
//                View.VISIBLE
//            }
//        }
//    }

//    //密码显示按钮是否显示   不要在 xml 中写逻辑 所以逻辑判断放在这里
//    var passwordVisible = object :ObservableInt(password){
//        override fun get(): Int {
//            return if(password.get().isEmpty()){
//                View.GONE
//            }else{
//                View.VISIBLE
//            }
//        }
//    }


}