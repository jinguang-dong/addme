package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfx implements mcw {
    public static final sgv a = sgv.g("hfx");
    public final szh b;
    private final hfr c;
    private final syu d;

    public hfx(hfr hfrVar, szh szhVar, syu syuVar) {
        this.c = hfrVar;
        this.b = szhVar;
        this.d = syuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        syu syuVarA = this.c.a();
        rnu rnuVar = new rnu(this);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.d);
        arrayList.add(syuVarA);
        ske.W(ske.I(arrayList), new jjm(rnuVar, 2), sxo.a);
    }
}
