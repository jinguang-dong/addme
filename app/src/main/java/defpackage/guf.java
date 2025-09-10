package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class guf implements gva {
    final /* synthetic */ guh a;
    private final /* synthetic */ int b;

    public guf(guh guhVar, int i) {
        this.b = i;
        this.a = guhVar;
    }

    @Override // defpackage.gva
    public final boolean a() {
        if (this.b == 0) {
            guh guhVar = this.a;
            if (guhVar.c.h() && guhVar.d.h()) {
                return Math.abs(Math.toDegrees((double) ((gug) guhVar.c.c()).a)) >= 45.0d || Math.abs(Math.toDegrees((double) ((gug) guhVar.c.c()).b)) >= 45.0d || ((gug) guhVar.c.c()).c;
            }
            return false;
        }
        guh guhVar2 = this.a;
        if (guhVar2.c.h() && guhVar2.d.h()) {
            float f = ((gug) guhVar2.c.c()).a;
            float f2 = ((gug) guhVar2.c.c()).b;
            boolean z = ((gug) guhVar2.c.c()).c;
            if (guh.a.contains((Range) Double.valueOf(Math.toDegrees(f))) && Math.abs(Math.toDegrees(f2)) <= 10.0d && !z) {
                return true;
            }
        }
        return false;
    }
}
