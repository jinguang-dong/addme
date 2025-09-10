package defpackage;

import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class efk implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ efk(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, pbn] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.d;
        if (i == 0) {
            return efm.a((Context) this.a, (String) this.b, (String) this.c);
        }
        if (i == 1) {
            WorkDatabase workDatabase = ((dxj) this.a).a;
            String str = (String) this.b;
            ((ArrayList) this.c).addAll(workDatabase.C().a(str));
            return workDatabase.B().a(str);
        }
        if (i == 2) {
            return ((kuw) this.a).b((pfz) this.c, (pen) this.b);
        }
        if (i == 3) {
            ?? r0 = this.c;
            try {
                this.a.f((String) this.b);
                return r0.call();
            } finally {
                Trace.endSection();
            }
        }
        String str2 = ((pvr) ske.U(this.b)).c;
        pvd pvdVar = (pvd) ske.U(this.c);
        if (pvdVar != null) {
            return qsp.ap(str2, pvdVar.e);
        }
        pva pvaVar = (pva) this.a;
        return (pvaVar.b & 32) != 0 ? qsp.ap(str2, pvaVar.i) : str2;
    }

    public /* synthetic */ efk(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.a = obj;
        this.b = str;
        this.c = obj2;
    }

    public /* synthetic */ efk(syu syuVar, syu syuVar2, pva pvaVar, int i) {
        this.d = i;
        this.b = syuVar;
        this.c = syuVar2;
        this.a = pvaVar;
    }
}
