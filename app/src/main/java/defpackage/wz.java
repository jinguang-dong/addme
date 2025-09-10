package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wz implements AutoCloseable {
    private final xe a;
    private final Set b;
    private final uly c;

    public wz(xe xeVar) {
        List list = xeVar.d;
        ArrayList arrayList = new ArrayList(ske.bq(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new rh(((xc) it.next()).a));
        }
        Set setBQ = ske.bQ(arrayList);
        this.a = xeVar;
        this.b = setBQ;
        this.c = new uly(false, umc.a);
    }

    public final boolean a() {
        if (!this.c.b()) {
            return false;
        }
        xe xeVar = this.a;
        xeVar.c.c();
        List list = xeVar.d;
        int i = ((ugl) list).c;
        for (int i2 = 0; i2 < i; i2++) {
            xc xcVar = (xc) list.get(i2);
            if (this.b.contains(new rh(xcVar.a))) {
                xcVar.c();
            }
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a();
    }

    protected final void finalize() {
        if (a()) {
            Log.e("CXCP", a.bz(this, "Failed to close ", "! This indicates a memory leak and could cause the camera to stall, or images to be lost."));
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
