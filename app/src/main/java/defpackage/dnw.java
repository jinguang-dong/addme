package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnw extends uhp {
    public Object a;
    public Object b;
    public Object c;
    public long d;
    public long e;
    public /* synthetic */ Object f;
    public int g;
    final /* synthetic */ AmbientDelegate h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnw(AmbientDelegate ambientDelegate, uhb uhbVar) {
        super(uhbVar);
        this.h = ambientDelegate;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.f = obj;
        this.g |= Integer.MIN_VALUE;
        return this.h.p(null, 0L, null, null, this);
    }
}
