package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnu extends uhp {
    public /* synthetic */ Object a;
    public int b;
    public ujz c;
    public ujz d;
    final /* synthetic */ AmbientDelegate e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnu(AmbientDelegate ambientDelegate, uhb uhbVar) {
        super(uhbVar);
        this.e = ambientDelegate;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.o(null, 0.0f, null, null, this);
    }
}
