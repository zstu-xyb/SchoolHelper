package com.burning.smile.schoolhelper.addexpress;

import android.app.Dialog;

import com.burning.smile.schoolhelper.BasePresenter;
import com.burning.smile.schoolhelper.BaseView;

/**
 * Created by smile on 2017/4/6.
 */
public interface AddExpressContract {

    interface View extends BaseView<Presenter> {
        void showLoadingView();

        void dimissLoadingView();

        void showPostSuccess(String msg);

        void showPostFailure(String msg);

        void showExpressTypeError(String msg);

        void showExpressAddressError(String msg);

        void showExpressTitleError(String msg);

        void showExpressDetailError(String msg);

        void showExpressOfferError(String msg);

        void showInputPayPassError(String msg);

        void setIsPaySet(int isPaySet);
        int getIsPaySet();
    }

    interface Presenter extends BasePresenter {
        void postExpress(String title, String detail, String offer, String type, String is_urgent,String pay_password);
        void showPayDialog(String title, String detail, String offer, String type, String is_urgent);
        void showPassView(Dialog dialog,String title, String detail, String offer, String type, String is_urgent);
    }
}
