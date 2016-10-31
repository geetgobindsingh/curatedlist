package com.learncircle.geet.ui.base;

import com.trello.rxlifecycle.RxLifecycle;
import com.trello.rxlifecycle.android.ActivityEvent;
import com.trello.rxlifecycle.android.RxLifecycleAndroid;

import rx.Observable;
import rx.subjects.BehaviorSubject;

/**
 * Created by Geet on 31-10-2016.
 */

public class BasePresenter implements IPresenter {
    private final BehaviorSubject<ActivityEvent> lifecycleSubject = BehaviorSubject.create();


    public final <T> Observable.Transformer<? super T, ? extends T> bindToLifecycle() {
        return RxLifecycleAndroid.<T>bindActivity(lifecycleSubject);
    }

    @Override
    public void onCreate() {
        lifecycleSubject.onNext(ActivityEvent.CREATE);
    }

    @Override
    public void onDestroy() {
        lifecycleSubject.onNext(ActivityEvent.DESTROY);
    }

    @Override
    public void onStart() {
        lifecycleSubject.onNext(ActivityEvent.START);
    }

    @Override
    public void onStop() {
        lifecycleSubject.onNext(ActivityEvent.STOP);
    }

    @Override
    public void onPause() {
        lifecycleSubject.onNext(ActivityEvent.PAUSE);
    }

    @Override
    public void onResume() {
        lifecycleSubject.onNext(ActivityEvent.RESUME);
    }


    @Override
    public IView getView() {
        return null;
    }
}
