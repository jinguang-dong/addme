package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xa extends xb implements xf {
    final /* synthetic */ xe a;

    public xa(xe xeVar) {
        this.a = xeVar;
    }

    @Override // defpackage.xf
    public final void b(Object obj) {
        Object obj2;
        xd xdVar;
        this.b.O(new xi(obj));
        xe xeVar = this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = xeVar.g;
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i < size; i++) {
            ((qa) copyOnWriteArrayList.get(i)).b();
        }
        umb umbVar = xeVar.e;
        do {
            obj2 = umbVar.a;
            xd xdVar2 = (xd) obj2;
            int iOrdinal = xdVar2.ordinal();
            if (iOrdinal == 0) {
                xdVar = xd.b;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException(mn.e((byte) 32, xdVar2, xeVar, "Unexpected frame state for ", "! State is "));
                }
                xdVar = xd.d;
            }
        } while (!umbVar.d(obj2, xdVar));
        if (xdVar == xd.d) {
            xeVar.a();
        }
    }

    @Override // defpackage.xb
    protected final void a() {
    }
}
