package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdm implements rch {
    private final tqy a;
    private final tow b;

    public rdm(tqy tqyVar) {
        tow towVar = tow.a;
        tra traVar = tra.a;
        this.b = tow.a;
        this.a = tqyVar;
    }

    public static rdm b(tqr tqrVar) {
        return new rdm(tqrVar.w());
    }

    @Override // defpackage.rch
    public final /* bridge */ /* synthetic */ Object a(rcg rcgVar) throws IOException {
        InputStream inputStreamA = new rdn().a(rcgVar);
        try {
            Object objC = this.a.c(inputStreamA, this.b);
            if (inputStreamA != null) {
                inputStreamA.close();
            }
            return objC;
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
