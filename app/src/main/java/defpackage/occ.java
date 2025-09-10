package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class occ extends obz {
    public static final List m = new CopyOnWriteArrayList();
    public final List n;

    public occ(Context context, String str, String str2, oco ocoVar, ocd ocdVar, ocl oclVar, qaq qaqVar) {
        super(context, str, str2, ocoVar, ocdVar, oclVar, qaqVar);
        this.n = new CopyOnWriteArrayList();
    }

    @Deprecated
    public final oca e(tqr tqrVar) {
        ojl.ay(tqrVar);
        return new oca(this, tqrVar);
    }

    public final oca f(tqr tqrVar, pro proVar) {
        ojl.ay(tqrVar);
        oca ocaVar = new oca(this, tqrVar);
        ocaVar.m = proVar;
        return ocaVar;
    }
}
