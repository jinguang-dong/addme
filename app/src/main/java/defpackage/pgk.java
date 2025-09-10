package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgk extends ojl {
    final List a;
    private final pbc b;
    private final Set c;
    private final LongSparseArray d;
    private boolean e;

    public pgk(our ourVar, pbc pbcVar) {
        super((short[]) null);
        this.c = new HashSet();
        this.a = new ArrayList(10);
        this.d = new LongSparseArray(8);
        this.e = false;
        this.b = pbcVar.a("MetadataDst");
        ourVar.d(new ngh(this, 5));
    }

    private static final void co(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((pgf) it.next()).k(null);
        }
    }

    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        long jKeyAt;
        if (!this.e) {
            long jD = poeVar.d();
            LongSparseArray longSparseArray = this.d;
            longSparseArray.put(jD, poeVar);
            if (longSparseArray.size() >= 8) {
                jKeyAt = longSparseArray.keyAt(0);
                longSparseArray.remove(jKeyAt);
            } else {
                jKeyAt = -1;
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                pgf pgfVar = (pgf) it.next();
                pdo pdoVar = pgfVar.c;
                if (pdoVar != null) {
                    long jD2 = poeVar.d();
                    long j = pdoVar.c;
                    if (j == jD2) {
                        pgfVar.k(poeVar);
                        it.remove();
                    } else if (jKeyAt >= 0 && j < jKeyAt) {
                        this.a.add(pgfVar);
                        it.remove();
                    }
                }
            }
            List list = this.a;
            if (!list.isEmpty()) {
                long jLongValue = ((Long) rwc.i((Long) ((poe) longSparseArray.valueAt(longSparseArray.size() - 1)).a(CaptureResult.SENSOR_TIMESTAMP)).e(0L)).longValue();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    pgf pgfVar2 = (pgf) it2.next();
                    pdo pdoVar2 = pgfVar2.c;
                    pdoVar2.getClass();
                    long j2 = pdoVar2.c;
                    if (j2 == jD) {
                        pgfVar2.k(poeVar);
                        it2.remove();
                    } else if (jKeyAt - j2 > 100 || jLongValue - pdoVar2.b > 4000000000L || list.size() > 10) {
                        pgfVar2.k(null);
                        it2.remove();
                    }
                }
            }
        }
    }

    public final synchronized void cm() {
        if (this.e) {
            return;
        }
        this.e = true;
        List list = this.a;
        co(list);
        Set set = this.c;
        co(set);
        set.clear();
        list.clear();
    }

    public final synchronized void cn(Collection collection) {
        if (this.e) {
            co(collection);
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            pgf pgfVar = (pgf) it.next();
            pdo pdoVar = pgfVar.c;
            if (pdoVar != null) {
                poe poeVar = (poe) this.d.get(pdoVar.c);
                if (poeVar != null) {
                    pgfVar.k(poeVar);
                } else {
                    this.c.add(pgfVar);
                }
            } else {
                this.c.add(pgfVar);
            }
        }
    }

    @Override // defpackage.ojl
    public final synchronized void dH(piw piwVar) {
        if (piwVar != null) {
            if (!this.e) {
                this.b.h("onCaptureFailed for Frame " + piwVar.b() + (true != piwVar.c() ? "" : " (images were captured)"));
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                pgf pgfVar = (pgf) it.next();
                pdo pdoVar = pgfVar.c;
                if (pdoVar != null) {
                    if (pdoVar.c == piwVar.b()) {
                        pgfVar.k(null);
                        it.remove();
                    }
                }
            }
        }
    }
}
