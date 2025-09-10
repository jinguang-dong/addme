package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czo {
    public czc b;
    public cze d;
    public czj e;
    public czd a = new czd(0);
    public final Set c = new HashSet();

    public czo() {
        long jA = cze.a(System.currentTimeMillis());
        this.d = new cze(jA, jA);
    }

    public final void a(cyu cyuVar) {
        if (cyuVar instanceof czd) {
            this.a = (czd) cyuVar;
            return;
        }
        if (cyuVar instanceof czc) {
            this.b = (czc) cyuVar;
            return;
        }
        if (cyuVar instanceof cze) {
            this.d = (cze) cyuVar;
        } else if (cyuVar instanceof czb) {
            this.c.add((czb) cyuVar);
        } else {
            if (!(cyuVar instanceof czj)) {
                throw new IllegalArgumentException("Unsupported metadata");
            }
            this.e = (czj) cyuVar;
        }
    }
}
