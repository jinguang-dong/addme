package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bem extends ufn implements Map, bdy {
    public static final bem a = new bem(bev.a, 0);
    public final bev b;
    public final int c;

    public bem(bev bevVar, int i) {
        this.b = bevVar;
        this.c = i;
    }

    @Override // defpackage.ufn
    public final int b() {
        return this.c;
    }

    public final bem c(Object obj, Object obj2) {
        beu beuVarD = this.b.d(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return beuVarD == null ? this : new bem(beuVarD.a, b() + beuVarD.b);
    }

    @Override // defpackage.ufn, java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.bdy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public beo a() {
        return new beo(this);
    }

    @Override // defpackage.ufn
    public final /* synthetic */ Collection e() {
        return new bet(this);
    }

    @Override // defpackage.ufn
    public final Set f() {
        return new bes(this, 1);
    }

    @Override // defpackage.ufn
    public final /* synthetic */ Set g() {
        return new bes(this, 0);
    }

    @Override // defpackage.ufn, java.util.Map
    public Object get(Object obj) {
        return this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
