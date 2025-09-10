package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofm {
    private int d;
    private final yd c = new yd();
    public final pfl b = new pfl((byte[]) null, (byte[]) null);
    private boolean e = false;
    public final yd a = new yd();

    public ofm(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((oex) it.next()).c(), null);
        }
        this.d = this.a.keySet().size();
    }

    public final void a(ofl oflVar, odj odjVar, String str) {
        yd ydVar = this.a;
        ydVar.put(oflVar, odjVar);
        yd ydVar2 = this.c;
        ydVar2.put(oflVar, str);
        this.d--;
        if (!odjVar.c()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (!this.e) {
                this.b.d(ydVar2);
            } else {
                this.b.c(new oeq(ydVar));
            }
        }
    }
}
