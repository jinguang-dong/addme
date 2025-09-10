package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ryn extends ryi implements sfo {
    private transient sfo b;
    final Comparator comparator;

    public ryn() {
        this(sel.a);
    }

    @Override // defpackage.sfo, defpackage.sfn
    public final Comparator comparator() {
        return this.comparator;
    }

    @Override // defpackage.ryi
    public final /* synthetic */ Set e() {
        return new sfq(this);
    }

    @Override // defpackage.sfo
    public final sec j() {
        Iterator itC = c();
        if (itC.hasNext()) {
            return ((sge) itC).next();
        }
        return null;
    }

    @Override // defpackage.sfo
    public final sec k() {
        Iterator itO = o();
        if (itO.hasNext()) {
            return ((sgf) itO).next();
        }
        return null;
    }

    @Override // defpackage.sfo
    public final sec l() {
        Iterator itC = c();
        if (!itC.hasNext()) {
            return null;
        }
        sec secVarA = ((sge) itC).next();
        sei seiVar = new sei(secVarA.b(), secVarA.a());
        itC.remove();
        return seiVar;
    }

    @Override // defpackage.sfo
    public final sec m() {
        Iterator itO = o();
        if (!itO.hasNext()) {
            return null;
        }
        sec secVarA = ((sgf) itO).next();
        sei seiVar = new sei(secVarA.b(), secVarA.a());
        itO.remove();
        return seiVar;
    }

    @Override // defpackage.sfo
    public final sfo n() {
        sfo sfoVar = this.b;
        if (sfoVar != null) {
            return sfoVar;
        }
        rym rymVar = new rym(this);
        this.b = rymVar;
        return rymVar;
    }

    public abstract Iterator o();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.NavigableSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.NavigableSet, java.util.Set] */
    @Override // defpackage.ryi, defpackage.sed
    /* renamed from: p */
    public final NavigableSet f() {
        ?? r0 = this.a;
        if (r0 != 0) {
            return r0;
        }
        ?? E = e();
        this.a = E;
        return E;
    }

    @Override // defpackage.sfo
    public final sfo q(Object obj, int i, Object obj2, int i2) {
        return s(obj, i).r(obj2, i2);
    }

    public ryn(Comparator comparator) {
        this.comparator = comparator;
    }
}
