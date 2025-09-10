package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tly extends tiv {
    @Override // defpackage.tiv
    public final /* bridge */ /* synthetic */ Object a(tml tmlVar) {
        try {
            return new AtomicInteger(tmlVar.c());
        } catch (NumberFormatException e) {
            throw new tis(e);
        }
    }
}
