package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzn {
    public static final sgv a = sgv.g("kzn");
    public final owf b;
    public final nkw c;
    public final boolean d;
    public final boolean e;
    public final AtomicReference f = new AtomicReference(kfe.IDLE);
    public String g;
    public final hgu h;
    public final hgc i;

    public kzn(owf owfVar, hgc hgcVar, hgu hguVar, nkw nkwVar, pjo pjoVar, owf owfVar2, our ourVar, hbj hbjVar) {
        this.b = owfVar;
        this.i = hgcVar;
        this.h = hguVar;
        this.c = nkwVar;
        this.d = hbjVar.p(hak.w);
        boolean z = false;
        if (pjoVar.l().equals(pka.FRONT) && hbjVar.p(hae.y)) {
            z = true;
        }
        this.e = z;
        ourVar.d(owfVar2.dK(new fun(this, owfVar, 20), sxo.a));
    }
}
