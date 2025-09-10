package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyh extends cyl implements Runnable {
    public boolean a;
    final /* synthetic */ cyi b;

    public cyh(cyi cyiVar) {
        this.b = cyiVar;
    }

    @Override // defpackage.cyl
    public final Object a() {
        try {
            cyi cyiVar = this.b;
            TreeSet treeSet = new TreeSet();
            String[] strArrSplit = qsp.h(cyiVar.e.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                int iIndexOf = str.indexOf(32);
                String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
                rnt.O(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n%s", str);
                arrayList.add(new rbw(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
            }
            Collections.sort(arrayList);
            treeSet.addAll(arrayList);
            return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
        } catch (cmt e) {
            if (this.f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.cyl
    public final void b(Object obj) {
        cyi cyiVar = this.b;
        if (cyiVar.a != this) {
            cyiVar.c(this);
        } else {
            if (cyiVar.g) {
                return;
            }
            SystemClock.uptimeMillis();
            cyiVar.a = null;
            cyiVar.b((List) obj);
        }
    }

    @Override // defpackage.cyl
    public final void c() {
        this.b.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}
