package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ar {
    public final dg a;

    public ar(dg dgVar) {
        this.a = dgVar;
    }

    public final boolean b() {
        dg dgVar = this.a;
        View view = dgVar.a.P;
        int iAX = view != null ? a.aX(view) : 0;
        int i = dgVar.h;
        if (iAX != i) {
            return (iAX == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
