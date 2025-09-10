package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class rzu extends sah implements sfo {
    private transient Comparator a;
    private transient NavigableSet b;
    private transient Set c;

    @Override // defpackage.sah, defpackage.sad
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract sfo b();

    @Override // defpackage.sfo, defpackage.sfn
    public final Comparator comparator() {
        Comparator comparator = this.a;
        if (comparator != null) {
            return comparator;
        }
        sem semVarA = sem.b(b().comparator()).a();
        this.a = semVarA;
        return semVarA;
    }

    public abstract Iterator e();

    @Override // defpackage.sah, defpackage.sed
    public final Set g() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        rzt rztVar = new rzt(this);
        this.c = rztVar;
        return rztVar;
    }

    @Override // defpackage.sad, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return ujp.at(this);
    }

    @Override // defpackage.sfo
    public final sec j() {
        return b().k();
    }

    @Override // defpackage.sfo
    public final sec k() {
        return b().j();
    }

    @Override // defpackage.sfo
    public final sec l() {
        return b().m();
    }

    @Override // defpackage.sfo
    public final sec m() {
        return b().l();
    }

    @Override // defpackage.sfo
    public final sfo n() {
        return b();
    }

    @Override // defpackage.sah
    protected final sed o() {
        return b();
    }

    @Override // defpackage.sah, defpackage.sed
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final NavigableSet f() {
        NavigableSet navigableSet = this.b;
        if (navigableSet != null) {
            return navigableSet;
        }
        sfq sfqVar = new sfq(this);
        this.b = sfqVar;
        return sfqVar;
    }

    @Override // defpackage.sfo
    public final sfo q(Object obj, int i, Object obj2, int i2) {
        return b().q(obj2, i2, obj, i).n();
    }

    @Override // defpackage.sfo
    public final sfo r(Object obj, int i) {
        return b().s(obj, i).n();
    }

    @Override // defpackage.sfo
    public final sfo s(Object obj, int i) {
        return b().r(obj, i).n();
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return u();
    }

    @Override // defpackage.sai
    public final String toString() {
        return g().toString();
    }

    @Override // defpackage.sad, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ujp.ap(this, objArr);
    }
}
