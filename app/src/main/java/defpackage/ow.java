package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ow extends oy implements Iterator {
    final /* synthetic */ oz a;
    private ov b;
    private boolean c = true;

    public ow(oz ozVar) {
        this.a = ozVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        ov ovVar;
        if (this.c) {
            this.c = false;
            ovVar = this.a.b;
        } else {
            ov ovVar2 = this.b;
            ovVar = ovVar2 != null ? ovVar2.c : null;
        }
        this.b = ovVar;
        return this.b;
    }

    @Override // defpackage.oy
    public final void cJ(ov ovVar) {
        ov ovVar2 = this.b;
        if (ovVar == ovVar2) {
            ov ovVar3 = ovVar2.d;
            this.b = ovVar3;
            this.c = ovVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        ov ovVar = this.b;
        return (ovVar == null || ovVar.c == null) ? false : true;
    }
}
