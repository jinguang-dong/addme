package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dzg implements Runnable {
    private final dzj a;
    private final Intent b;
    private final int c;

    public dzg(dzj dzjVar, Intent intent, int i) {
        this.a = dzjVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c);
    }
}
