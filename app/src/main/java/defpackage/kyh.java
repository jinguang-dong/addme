package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kyh {
    public static final sgv a = sgv.g("kyh");
    public final hzs b;
    public final pjo c;
    public final pbn d;
    public final kxm e;
    public final kqp f;
    public final lat g;
    public final hgc h;

    public kyh(hzs hzsVar, pjo pjoVar, kqp kqpVar, hgc hgcVar, pbn pbnVar, kxm kxmVar, lat latVar) {
        this.b = hzsVar;
        this.c = pjoVar;
        this.f = kqpVar;
        this.h = hgcVar;
        this.d = pbnVar;
        this.e = kxmVar;
        this.g = latVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((pdk) it.next()).close();
        }
    }
}
