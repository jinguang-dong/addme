package androidx.wear.ambient;

import android.app.Activity;
import android.os.Bundle;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientLifecycleObserver;
import defpackage.cwh;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AmbientLifecycleObserverImpl implements AmbientLifecycleObserver {
    private final AmbientDelegate a;
    private final AmbientLifecycleObserverImpl$callbackTranslator$1 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmbientLifecycleObserverImpl(Activity activity, AmbientLifecycleObserver.AmbientLifecycleCallback ambientLifecycleCallback) {
        this(activity, new AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0(0), ambientLifecycleCallback);
        activity.getClass();
        ambientLifecycleCallback.getClass();
    }

    public static final void a(Runnable runnable) {
        runnable.run();
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserver
    public final boolean isAmbient() {
        return this.a.h();
    }

    @Override // defpackage.cvt
    public final void onCreate(cwh cwhVar) {
        cwhVar.getClass();
        AmbientDelegate ambientDelegate = this.a;
        ambientDelegate.b();
        ambientDelegate.g();
    }

    @Override // defpackage.cvt
    public final void onDestroy(cwh cwhVar) {
        cwhVar.getClass();
        this.a.c();
    }

    @Override // defpackage.cvt
    public final void onPause(cwh cwhVar) {
        cwhVar.getClass();
        this.a.d();
    }

    @Override // defpackage.cvt
    public final void onResume(cwh cwhVar) {
        cwhVar.getClass();
        this.a.e();
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onStart(cwh cwhVar) {
        cwhVar.getClass();
    }

    @Override // defpackage.cvt
    public final void onStop(cwh cwhVar) {
        cwhVar.getClass();
        this.a.f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.wear.ambient.AmbientDelegate$AmbientCallback, androidx.wear.ambient.AmbientLifecycleObserverImpl$callbackTranslator$1] */
    public AmbientLifecycleObserverImpl(Activity activity, Executor executor, final AmbientLifecycleObserver.AmbientLifecycleCallback ambientLifecycleCallback) {
        activity.getClass();
        executor.getClass();
        ambientLifecycleCallback.getClass();
        ?? r2 = new AmbientDelegate.AmbientCallback() { // from class: androidx.wear.ambient.AmbientLifecycleObserverImpl$callbackTranslator$1
            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onEnterAmbient(Bundle bundle) {
                ambientLifecycleCallback.onEnterAmbient(new AmbientLifecycleObserver.AmbientDetails(bundle != null ? bundle.getBoolean("com.google.android.wearable.compat.extra.BURN_IN_PROTECTION") : false, bundle != null ? bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT") : false));
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onExitAmbient() {
                ambientLifecycleCallback.onExitAmbient();
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onUpdateAmbient() {
                ambientLifecycleCallback.onUpdateAmbient();
            }

            @Override // androidx.wear.ambient.AmbientDelegate.AmbientCallback
            public final void onAmbientOffloadInvalidated() {
            }
        };
        this.b = r2;
        this.a = new AmbientDelegate(activity, (AmbientDelegate.AmbientCallback) r2);
    }
}
