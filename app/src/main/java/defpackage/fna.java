package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fna {
    public static final sgv a = sgv.g("fna");
    public final pdv b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final Set e = new HashSet();
    public volatile boolean f = false;
    public long g = -1;
    public long h = -1;
    public final foy i;
    public final pfu j;
    public final hbj k;
    public final hbp l;

    public fna(foy foyVar, hbj hbjVar, hbp hbpVar, pfu pfuVar, pdv pdvVar) {
        this.k = hbjVar;
        this.i = foyVar;
        this.l = hbpVar;
        this.j = pfuVar;
        this.b = pdvVar;
    }

    public final synchronized void a(Set set) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            poj pojVar = (poj) it.next();
            if (!set.contains(Long.valueOf(pojVar.d()))) {
                pojVar.close();
                it.remove();
            }
        }
    }
}
