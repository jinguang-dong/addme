package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxj extends sak {
    final Set a;
    final /* synthetic */ rxk b;

    public rxj(rxk rxkVar) {
        this.b = rxkVar;
        this.a = rxkVar.b.keySet();
    }

    @Override // defpackage.sad, defpackage.sai
    /* renamed from: a */
    protected final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // defpackage.sak, defpackage.sad
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.sak
    /* renamed from: c */
    protected final Set a() {
        return this.a;
    }

    @Override // defpackage.sad, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new sdr(this.b.entrySet().iterator());
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return u();
    }

    @Override // defpackage.sai
    public final String toString() {
        StringBuilder sbBm = ujp.bm(size());
        sbBm.append('[');
        boolean z = true;
        for (Object obj : this) {
            if (!z) {
                sbBm.append(", ");
            }
            z = false;
            if (obj == this) {
                sbBm.append("(this Collection)");
            } else {
                sbBm.append(obj);
            }
        }
        sbBm.append(']');
        return sbBm.toString();
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ujp.ap(this, objArr);
    }
}
