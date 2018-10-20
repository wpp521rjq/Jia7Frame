package com.peng.j_component_base.system;

/**
 * author：WolfWang
 * date：2018/9/13 22:56
 * e-mail：1678173987@qq.com
 * description：
 */

public class CommonSystemApi {


    public CommonSystemApi() {
    }

    private static CommonSystemApi mCommonSystemApi;
    public static CommonSystemApi getInstance(){
        if(mCommonSystemApi==null){
            synchronized (CommonSystemApi.class){
                if(mCommonSystemApi==null){
                    mCommonSystemApi=new CommonSystemApi();
                }
            }
        }
        return mCommonSystemApi;
    }






}
