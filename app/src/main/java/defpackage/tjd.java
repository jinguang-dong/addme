package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjd implements Cloneable, tiw {
    public static final tjd a = new tjd();
    public final double b = -1.0d;
    public final int c = 136;
    public final List d = Collections.EMPTY_LIST;
    public final List e = Collections.EMPTY_LIST;

    @Override // defpackage.tiw
    public final tiv a(tih tihVar, tmk tmkVar) {
        Class cls = tmkVar.a;
        boolean zC = c(cls, true);
        boolean zC2 = c(cls, false);
        if (zC || zC2) {
            return new tjc(this, zC2, tihVar, tmkVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tjd clone() {
        try {
            return (tjd) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean c(Class cls, boolean z) {
        List list;
        if (z) {
            list = this.d;
        } else {
            if (!Enum.class.isAssignableFrom(cls) && tmf.h(cls)) {
                return true;
            }
            list = this.e;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((tia) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
