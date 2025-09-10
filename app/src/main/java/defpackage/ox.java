package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ox extends oy implements Iterator {
    ov a;
    ov b;

    public ox(ov ovVar, ov ovVar2) {
        this.a = ovVar2;
        this.b = ovVar;
    }

    private final ov d() {
        ov ovVar = this.b;
        ov ovVar2 = this.a;
        if (ovVar == ovVar2 || ovVar2 == null) {
            return null;
        }
        return b(ovVar);
    }

    public abstract ov a(ov ovVar);

    public abstract ov b(ov ovVar);

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        ov ovVar = this.b;
        this.b = d();
        return ovVar;
    }

    @Override // defpackage.oy
    public final void cJ(ov ovVar) {
        if (this.a == ovVar && ovVar == this.b) {
            this.b = null;
            this.a = null;
        }
        ov ovVar2 = this.a;
        if (ovVar2 == ovVar) {
            this.a = a(ovVar2);
        }
        if (this.b == ovVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
