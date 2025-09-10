package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dog extends uhp {
    public long a;
    public /* synthetic */ Object b;
    public int c;
    public dlc d;

    public dog(uhb uhbVar) {
        super(uhbVar);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return AmbientLifecycleObserverKt.i(null, this);
    }
}
