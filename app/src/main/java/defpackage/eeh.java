package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eeh extends eeg {
    final /* synthetic */ eei c;
    private final String d;
    private final Iterator e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeh(eei eeiVar, een eenVar) {
        super(eeiVar);
        this.c = eeiVar;
        this.f = 0;
        if (eenVar.g().n()) {
            eeiVar.b = eenVar.a;
        }
        this.d = a(eenVar, null, 1);
        this.e = eenVar.h();
    }

    @Override // defpackage.eeg, java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        Iterator it = this.e;
        if (!it.hasNext()) {
            return false;
        }
        een eenVar = (een) it.next();
        this.f++;
        String strA = null;
        if (eenVar.g().n()) {
            this.c.b = eenVar.a;
        } else if (eenVar.c != null) {
            strA = a(eenVar, this.d, this.f);
        }
        eei eeiVar = this.c;
        if (eeiVar.a.b() && eenVar.t()) {
            return hasNext();
        }
        this.b = b(eenVar, eeiVar.b, strA);
        return true;
    }
}
