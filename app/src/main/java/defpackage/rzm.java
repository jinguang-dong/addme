package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rzm extends scv {
    final rzw a;

    public rzm(rzw rzwVar) {
        super(sel.a);
        this.a = rzwVar;
    }

    public static rzm a(seo seoVar, rzw rzwVar) {
        seoVar.getClass();
        rzwVar.getClass();
        try {
            seo seoVarG = !seoVar.k() ? seoVar.g(seo.c(rzwVar.c())) : seoVar;
            if (!seoVar.l()) {
                seoVarG = seoVarG.g(seo.d(rzwVar.b()));
            }
            if (!seoVarG.n()) {
                Comparable comparableD = seoVar.b.d(rzwVar);
                comparableD.getClass();
                Comparable comparableC = seoVar.c.c(rzwVar);
                comparableC.getClass();
                if (seo.b(comparableD, comparableC) <= 0) {
                    return new sev(seoVarG, rzwVar);
                }
            }
            return new rzy(rzwVar);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.scv
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final rzm l(Comparable comparable) {
        comparable.getClass();
        return n(comparable, false);
    }

    @Override // defpackage.scv
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final rzm m(Comparable comparable, boolean z) {
        comparable.getClass();
        return n(comparable, z);
    }

    /* renamed from: d */
    public abstract rzm n(Comparable comparable, boolean z);

    @Override // defpackage.scv, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final rzm subSet(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        a.I(this.b.compare(comparable, comparable2) <= 0);
        return q(comparable, true, comparable2, false);
    }

    @Override // defpackage.scv, java.util.NavigableSet
    /* renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final rzm subSet(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        comparable.getClass();
        comparable2.getClass();
        a.I(this.b.compare(comparable, comparable2) <= 0);
        return q(comparable, z, comparable2, z2);
    }

    /* renamed from: g */
    public abstract rzm q(Comparable comparable, boolean z, Comparable comparable2, boolean z2);

    @Override // defpackage.scv, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final rzm tailSet(Comparable comparable) {
        comparable.getClass();
        return t(comparable, true);
    }

    @Override // defpackage.scv, java.util.NavigableSet
    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final rzm tailSet(Comparable comparable, boolean z) {
        comparable.getClass();
        return t(comparable, z);
    }

    /* renamed from: j */
    public abstract rzm t(Comparable comparable, boolean z);

    @Override // defpackage.scv
    public scv k() {
        return new rzs(this);
    }

    @Override // defpackage.scv
    public /* bridge */ /* synthetic */ scv n(Object obj, boolean z) {
        throw null;
    }

    @Override // defpackage.scv
    public /* bridge */ /* synthetic */ scv q(Object obj, boolean z, Object obj2, boolean z2) {
        throw null;
    }

    @Override // defpackage.scv
    public /* bridge */ /* synthetic */ scv t(Object obj, boolean z) {
        throw null;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return u().toString();
    }

    public abstract seo u();

    @Override // defpackage.scv, defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
