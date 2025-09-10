package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oi {
    public Intent a;
    private final IntentSender b;
    private int c;
    private int d;

    public oi(IntentSender intentSender) {
        intentSender.getClass();
        this.b = intentSender;
    }

    public final oj a() {
        return new oj(this.b, this.a, this.c, this.d);
    }

    public final void b(int i, int i2) {
        this.d = i;
        this.c = i2;
    }
}
