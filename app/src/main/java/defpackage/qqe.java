package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqe {
    public final Object a;

    public qqe(Context context, byte[] bArr) {
        this.a = context;
    }

    public static syu d(oor oorVar) {
        return swf.j(qpt.av(oorVar), oep.class, new jie(5), sxo.a);
    }

    public final int a() {
        return ((AtomicInteger) this.a).get();
    }

    public final syu b(String str) {
        str.getClass();
        return d(((onm) this.a).a(str));
    }

    public final syu c(int[] iArr, String str, String str2) {
        iArr.getClass();
        str2.getClass();
        ogw ogwVar = new ogw();
        ogwVar.a = new opc(str, str2, iArr, 1);
        return d(((oet) this.a).f(ogwVar.a()));
    }

    public final syu e(qzv qzvVar) {
        String str;
        oet oetVar = (oet) this.a;
        ogn ognVarAE = ojl.aE(qzvVar, oetVar.f, onr.class.getSimpleName());
        String strA = ojk.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + "|" + System.identityHashCode(onr.class);
        }
        old oldVar = new old(str, ognVarAE, 4);
        onj onjVar = new onj(2);
        ogs ogsVar = new ogs();
        ogsVar.c = ognVarAE;
        ogsVar.a = oldVar;
        ogsVar.b = onjVar;
        ogsVar.d = new odl[]{onc.d};
        ogsVar.e = false;
        return d(oetVar.l(ogsVar.a()));
    }

    public qqe(Object obj) {
        this.a = obj;
    }

    public qqe() {
        this.a = new AtomicInteger();
    }

    public qqe(Context context) {
        new ConcurrentHashMap();
        qpt.W(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }
}
