package defpackage;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class syj {
    private final boolean a;
    private final Object b;

    public syj(qpt qptVar, rwc rwcVar) {
        this.b = qptVar;
        this.a = rwcVar.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Context context) {
        if (((fdi) context).b().p(gzo.bd)) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(VibrationEffect.createPredefined(2));
        }
    }

    public static void i(View view) {
        view.performHapticFeedback(6);
    }

    public final syu a(Callable callable, Executor executor) {
        return new sxn((sbe) this.b, this.a, executor, callable);
    }

    public final syu b(sxh sxhVar, Executor executor) {
        return new sxn((sbe) this.b, this.a, executor, sxhVar);
    }

    public final syu c(Runnable runnable, Executor executor) {
        return a(new syi(runnable), executor);
    }

    public final qvo d(final int i) {
        uem qmvVar = new uem() { // from class: qvp
            @Override // defpackage.uem, defpackage.uel
            public final Object a() {
                return Integer.valueOf(i);
            }
        };
        if (this.a) {
            qmvVar = new qmv(10);
        }
        return new qvo(qmvVar, (qpt) this.b);
    }

    public final void e() {
        if (this.a) {
            h(VibrationEffect.createPredefined(2));
        }
    }

    public final void g(int i) {
        h(VibrationEffect.createPredefined(i));
    }

    public final void h(VibrationEffect vibrationEffect) {
        Vibrator vibrator = (Vibrator) this.b;
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(vibrationEffect);
        }
    }

    public syj(boolean z, sbp sbpVar) {
        this.a = z;
        this.b = sbpVar;
    }

    public syj(Context context, hbj hbjVar) {
        this.b = (Vibrator) context.getSystemService("vibrator");
        this.a = hbjVar.p(gzo.bd);
    }
}
