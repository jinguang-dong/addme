package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ao extends ar {
    private final boolean b;
    private boolean c;
    private ebn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(dg dgVar, boolean z) {
        super(dgVar);
        dgVar.getClass();
        this.b = z;
    }

    public final ebn a(Context context) throws Resources.NotFoundException {
        if (this.c) {
            return this.d;
        }
        dg dgVar = this.a;
        ebn ebnVarBt = a.bt(context, dgVar.a, dgVar.h == 2, this.b);
        this.d = ebnVarBt;
        this.c = true;
        return ebnVarBt;
    }
}
