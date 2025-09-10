package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sge implements Iterator {
    sgg a;
    sec b;
    final /* synthetic */ sgi c;

    public sge(sgi sgiVar) {
        sgg sggVarG;
        this.c = sgiVar;
        Object obj = sgiVar.rootReference.a;
        sgg sggVar = null;
        if (obj != null) {
            sam samVar = sgiVar.range;
            if (samVar.b) {
                Object obj2 = samVar.c;
                sggVarG = ((sgg) obj).c(sgiVar.comparator, obj2);
                if (sggVarG != null) {
                    if (sgiVar.range.f == 1 && sgiVar.comparator.compare(obj2, sggVarG.a) == 0) {
                        sggVarG = sggVarG.g();
                    }
                }
            } else {
                sggVarG = sgiVar.header.g();
            }
            if (sggVarG != sgiVar.header && sgiVar.range.b(sggVarG.a)) {
                sggVar = sggVarG;
            }
        }
        this.a = sggVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sec next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        sgi sgiVar = this.c;
        sgg sggVar = this.a;
        sggVar.getClass();
        sgd sgdVar = new sgd(sgiVar, sggVar);
        this.b = sgdVar;
        if (sggVar.g() == sgiVar.header) {
            this.a = null;
            return sgdVar;
        }
        this.a = this.a.g();
        return sgdVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sgg sggVar = this.a;
        if (sggVar == null) {
            return false;
        }
        sgi sgiVar = this.c;
        if (!sgiVar.range.c(sggVar.a)) {
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        rnt.M(this.b != null, "no calls to next() since the last call to remove()");
        this.c.w(this.b.b());
        this.b = null;
    }
}
