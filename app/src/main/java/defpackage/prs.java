package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class prs extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ szh c;
    final /* synthetic */ Callable d;
    final /* synthetic */ Executor e;

    public prs(AtomicBoolean atomicBoolean, Context context, szh szhVar, Callable callable, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = szhVar;
        this.d = callable;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            prt.e(this.b, this);
            this.c.f(ske.Q(this.d, this.e));
        }
    }
}
