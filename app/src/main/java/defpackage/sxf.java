package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxf extends sxd {
    @Override // defpackage.sxd
    public final int a(sxg sxgVar) {
        int i;
        synchronized (sxgVar) {
            i = sxgVar.remainingField - 1;
            sxgVar.remainingField = i;
        }
        return i;
    }

    @Override // defpackage.sxd
    public final void b(sxg sxgVar, Set set) {
        synchronized (sxgVar) {
            if (sxgVar.seenExceptionsField == null) {
                sxgVar.seenExceptionsField = set;
            }
        }
    }
}
